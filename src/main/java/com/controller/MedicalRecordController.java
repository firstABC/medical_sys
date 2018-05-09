package com.controller;

import java.text.ParseException;
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
import com.entity.MedicalRecord;
import com.entity.MedicalRecord;
import com.service.MedicalRecordService;
import com.service.MedicalRecordService;
import com.util.Utils;

@Controller
@RequestMapping("/mere")
public class MedicalRecordController {
	private static Logger logger = LoggerFactory
			.getLogger(MedicalRecordController.class);
	@Autowired
	private MedicalRecordService medicalRecordService;
	
	/**
	 * 获取列表跳转
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView meReList(@RequestParam("icCardNum")String icCardNum,ModelMap map){
		logger.info("Get MedicalRecord List Start");
		MsgDTO msgDTO = new MsgDTO();
		try{
			if(Utils.stringNotEmpty(icCardNum)){
				List<MedicalRecord> meList = medicalRecordService.getMeReList(icCardNum);
				if(Utils.listNotNull(meList)){
					msgDTO = MsgDTO.success();
					msgDTO.setTotal(meList.size());
					msgDTO.setData(meList);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}else{
				//参数为空
				msgDTO = MsgDTO.zero();
			}
			logger.info("Get MedicalRecord List End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		}catch(Exception e){
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Get MedicalRecord List Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		map.put("msgDTO", msgDTO);
		return new ModelAndView("patientHis");
	}
	
	@RequestMapping(value = "/getMeRe", method = RequestMethod.GET)
	public ModelAndView getMeRe(@RequestParam("id")String id,ModelMap map){
		logger.info("Get MedicalRecord Start: id="+id);
		MsgDTO msgDTO = new MsgDTO();
		try {
			if(Utils.stringNotEmpty(id)){
				MedicalRecord meRe = medicalRecordService.getMeRe(id);
				if(meRe != null){
					msgDTO = MsgDTO.success();
					msgDTO.setTotal(1);
					msgDTO.setData(meRe);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}else{
				msgDTO = MsgDTO.fail();
			}
			logger.info("Get MedicalRecord End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("G MedicalRecord Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		map.put("msgDTO", msgDTO);
		return new ModelAndView("patientHisLi");
	}
	@RequestMapping(value = "/add", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO addMedicalRecord(@RequestBody MedicalRecord meRe){
		logger.info("Add MedicalRecord Start: "+meRe.toString());
		MsgDTO msgDTO = new MsgDTO();
		int total = 0;
		try {
			total = medicalRecordService.addMeRe(meRe);
			if(Utils.numNotNull(total)){
				msgDTO = MsgDTO.success();
				msgDTO.setTotal(total);
			}else{
				msgDTO = MsgDTO.zero();
			}
			logger.info("Add MedicalRecord End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (ParseException pe) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(pe.getMessage());
			logger.error("Add MedicalRecord ParseException: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Add MedicalRecord Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
	
	//获取列表json
		@RequestMapping("/jsonlist")
	    public @ResponseBody MsgDTO jsonmeReList(@RequestParam("icCardNum")String icCardNum){
			logger.info("Get MedicalRecord List Start");
			MsgDTO msgDTO = new MsgDTO();
			try{
				List<MedicalRecord> meList = medicalRecordService.getMeReList(icCardNum);
				if(Utils.listNotNull(meList)){
					msgDTO = MsgDTO.success();
					msgDTO.setTotal(meList.size());
					msgDTO.setData(meList);
				}else{
					msgDTO = MsgDTO.zero();
				}
				logger.info("Get MedicalRecord List End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
			}catch(Exception e){
				msgDTO.setStatus(MsgDTO.STATUS_ERR);
				msgDTO.setMessage(e.getMessage());
				logger.error("Get MedicalRecord List Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
			}
			return msgDTO;
		}  
}
