package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MsgDTO;
import com.entity.PatientCardVO;
import com.service.IcCardService;

@Controller
@RequestMapping("/ic")
public class IcCardController {

	private static Logger logger = LoggerFactory
			.getLogger(IcCardController.class);
	@Autowired
	private IcCardService icCardService;
	
	@RequestMapping("/search")
	@ResponseBody
	public MsgDTO selectIcCard(@RequestParam("num")String icCardNum){
		MsgDTO msgDTO =new MsgDTO();
		PatientCardVO patientCardVO = icCardService.selectIcCard(icCardNum);
		if(patientCardVO==null){
			msgDTO.setMessage("此卡号不存在！");
			msgDTO.setStatus(msgDTO.STATUS_Zero);
			logger.info("销户---卡号不存在");
			return msgDTO;
		}
		msgDTO.setData(patientCardVO);
		msgDTO.setStatus(msgDTO.STATUS_OK);
		return msgDTO;
	}
}
