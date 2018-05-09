package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.MsgDTO;
import com.dto.PaCaCons;
import com.entity.Patient;
import com.entity.Patient;
import com.entity.PatientCardVO;
import com.service.PatientService;
import com.util.Utils;

@Controller
@RequestMapping("/pa")
public class PatientController {
	private static Logger logger = LoggerFactory
			.getLogger(PatientController.class);
	@Autowired
	private PatientService patientService;
	
	/**
	 * 通用页面跳转
	 */
	@RequestMapping(value="{page}",method=RequestMethod.GET)
	public ModelAndView toPage(@PathVariable("page")String page){
		return new ModelAndView(page);
	}
	//获取列表
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
			logger.error("Get Patient List Exaception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}  
	
	@RequestMapping(value = "/getPatient", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO getPatient(@RequestParam("patientId")String patientId){
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
		return msgDTO;
	}
	@RequestMapping(value = "/getPatientByCons", method = { RequestMethod.POST })
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
}
