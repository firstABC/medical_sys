package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.MsgDTO;
import com.dto.PaCaCons;
import com.entity.IcCard;
import com.entity.Patient;
import com.entity.PatientCardVO;
import com.service.IcCardService;
import com.service.PatientService;
import com.service.Tranding_recordService;
import com.util.Utils;

@Controller
@RequestMapping("/pa")
public class PatientController {
	private static Logger logger = LoggerFactory
			.getLogger(PatientController.class);
	@Autowired
	private PatientService patientService;
	@Autowired
	private IcCardService icCardService;
	@Autowired
	private Tranding_recordService tranding_recordService;
	/**
	 * 获取列表
	 * @return
	 */
	@RequestMapping("/list")
    public @ResponseBody MsgDTO patientList(){
		logger.info("Get Patient List Start");
		MsgDTO msgDTO = new MsgDTO();
		try{
			List<PatientCardVO> dList = patientService.getPatientList();
			if(Utils.listNotNull(dList)){
				msgDTO = MsgDTO.success();
				msgDTO.setTotal(dList.size());
				msgDTO.setData(dList);
			}else{
				msgDTO = MsgDTO.zero();
			}
			logger.info("Get Patient List End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		}catch(Exception e){
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Get Patient List Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}  
	/**
	 * 获取患者详情
	 */
	@RequestMapping(value = "/getPatient", method = { RequestMethod.GET })
	public ModelAndView getPatient(@RequestParam(value="patientId",defaultValue="")String patientId,ModelMap map){
		logger.info("Get Patient Start: patientId="+patientId);
		MsgDTO msgDTO = new MsgDTO();
		try {
			if(Utils.stringNotEmpty(patientId)){
				PatientCardVO patientCardVO = patientService.getPatient(patientId);
				if(patientCardVO != null){
					msgDTO = MsgDTO.success();
					msgDTO.setTotal(1);
					msgDTO.setData(patientCardVO);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}else{
				msgDTO = MsgDTO.fail();
			}
			logger.info("Get Patient End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Get Patient Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		map.put("msgDTO", msgDTO);
		return new ModelAndView("patientXq");
	}
	/*@RequestMapping(value = "/getPatientByCons", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO getPatientByCons(@RequestBody PaCaCons paCaCons){
		logger.info("Get Patient By Condition Start: "+paCaCons.toString());
		MsgDTO msgDTO = new MsgDTO();
		try {
			List<PatientCardVO> dList = patientService.getPatientByCons(paCaCons);
			if(Utils.listNotNull(dList)){
				msgDTO = MsgDTO.success();
				msgDTO.setTotal(dList.size());
				msgDTO.setData(dList);
			}else{
				msgDTO = MsgDTO.zero();
			}
			logger.info("Get Patient By Condition End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("G Patient By Condition Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
	*/
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/cratePatient", method = { RequestMethod.POST })
	public MsgDTO toCreatePatient(HttpServletRequest request){
		MsgDTO msgDTO =new MsgDTO();
		try {
			SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date=new Date();
			String dateNow = dateFormater.format(date);
			Date time = dateFormater.parse(dateNow);
			
			
			String patientid = UUID.randomUUID().toString();
			//卡号
			String num = request.getParameter("num");
			
			//医疗卡
			String icId = UUID.randomUUID().toString();
			IcCard icCard = new IcCard();
			icCard.setIcid(icId);
			icCard.setIccardnum(num);
			icCard.setIsstatus("A");
			icCard.setCreatetime(time);
			icCard.setLasttime(time);
			icCard.setIcbalance(0l);
			icCardService.creatIcCard(icCard);
			
			
			//身份证号
			String uiIdcardNumber = request.getParameter("uiIdcardNumber");
			String paAge = request.getParameter("paAge");
			String paMarriage = request.getParameter("paMarriage");
			String paCreator = request.getParameter("paCreator");
			String username = request.getParameter("username");
			String phone = request.getParameter("phone");
			String paSex = request.getParameter("paSex");
			String paAddress = request.getParameter("paAddress");
			Patient patient = new Patient(patientid, username, uiIdcardNumber, phone, paAge, paSex, paMarriage, paAddress, paCreator, icId, time);
			patientService.createPatient(patient);
			
			
			
			//交易记录
			//开户的时候无需创建交易记录 这样查询的时候查询结果为空
		} catch (Throwable e) {
			logger.error("开户失败："+e);
			msgDTO.setMessage("开户失败！");
			msgDTO.setStatus(msgDTO.STATUS_ERR);
			return msgDTO;
		}
		msgDTO.setMessage("开户成功！");
		msgDTO.setStatus(msgDTO.STATUS_OK);
		return msgDTO;
	} 
	@ResponseBody
	@RequestMapping(value = "/closePatient", method = { RequestMethod.POST })
	public MsgDTO toClosePatient(HttpServletRequest request){
		MsgDTO msgDTO = new MsgDTO();
		msgDTO = MsgDTO.success();
		try {
			Date date = Utils.getNow();
			//卡号
			String num = request.getParameter("num");
			String icbalance = request.getParameter("icbalance");
//			BigDecimal bd = new BigDecimal(icbalance); 
			long trMoney = Long.parseLong(icbalance);
			//用卡号去改变卡状态
			icCardService.closeAccount(num, date);
			//修改消费记录
			tranding_recordService.closeAccount(num, trMoney, date);
		} catch (Throwable e) {
			logger.error("销户失败："+e);
			msgDTO = MsgDTO.fail();
		}
		
		return msgDTO;
	}
}
