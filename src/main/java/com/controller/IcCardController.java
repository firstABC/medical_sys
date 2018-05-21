package com.controller;

import java.text.ParseException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MsgDTO;
import com.entity.PatientCardVO;
import com.service.IcCardService;
import com.service.Tranding_recordService;
import com.util.Utils;

@Controller
@RequestMapping("/ic")
public class IcCardController {

	private static Logger logger = LoggerFactory
			.getLogger(IcCardController.class);
	@Autowired
	private IcCardService icCardService;
	
	@Autowired
	private Tranding_recordService tranding_recordService;
	
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
	
	@Transactional
	@RequestMapping("/reCharge")
	@ResponseBody
	public MsgDTO toRecharge(@RequestParam(value="num",defaultValue="")String icCardNum,
							@RequestParam(value="icBalance",defaultValue="")String icBalance,
							@RequestParam(value="trMoney",defaultValue="")String trMoney){
		MsgDTO msgDTO =new MsgDTO();
		msgDTO = MsgDTO.fail();
		try {
			if(!(icCardNum!=null&&icCardNum!=""))
				return msgDTO;
			if(!(icBalance!=null&&icBalance!=""))
				return msgDTO;
			if(!(trMoney!=null&&trMoney!=""))
				return msgDTO;
			long icBalanceL = Long.parseLong(icBalance);
			long trMoneyL = Long.parseLong(trMoney);
			long tatal = icBalanceL+trMoneyL;
			Date time = Utils.getNow();
			icCardService.toRecharge(icCardNum, tatal, trMoneyL, time);
			tranding_recordService.toReCharge(icCardNum, tatal, trMoneyL, time);
			msgDTO = MsgDTO.success();
		} catch (ParseException e) {
			logger.error("充值失败："+e);
			e.printStackTrace();
		}
		return msgDTO;
	}
}
