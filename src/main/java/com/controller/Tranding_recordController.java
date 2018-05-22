package com.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.MsgDTO;
import com.entity.Trading_record;
import com.service.Tranding_recordService;
import com.util.Utils;

@Controller
@RequestMapping("/tr")
public class Tranding_recordController {

	private static Logger logger = LoggerFactory.getLogger(Tranding_recordController.class);
	@Resource
	private Tranding_recordService tranding_recordService;
	
	@RequestMapping(value="/consumeCard",method=RequestMethod.GET)
	public ModelAndView selectExpenseRecord(@RequestParam(value="icCardNum",defaultValue="")String icCardNum,
										@RequestParam(value="beginTime",defaultValue="")String beginTimeStr,
										@RequestParam(value="endTime",defaultValue="")String endTimeStr,
										ModelMap map){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("consumeCard");
		if(!Utils.stringNotEmpty(icCardNum)){
			return mv;
		}
		Date beginTime =null;
		Date endTime =null;
		try {
			if(Utils.stringNotEmpty(beginTimeStr)){
				//beginTimeStr = beginTimeStr.replaceAll("-", "");
				map.put("beginTime", beginTimeStr);
				beginTime = Utils.toDate(beginTimeStr);
			}
			if(Utils.stringNotEmpty(endTimeStr)){
				//endTimeStr = endTimeStr.replaceAll("-", "");
				map.put("endTime", endTimeStr);
				endTime = Utils.toDate(endTimeStr);
			}
		} catch (ParseException e) {
			logger.error("字符串转时间错误："+e);
		}
		
		List<Trading_record> LtTrading_record =  tranding_recordService.selectExpenseRecord(icCardNum, beginTime, endTime);
		MsgDTO msgDTO = new MsgDTO();
		msgDTO.setData(LtTrading_record);
		map.put("icCardNum", icCardNum);
		map.put("msgDTO", msgDTO);
		return mv;
	}
	
	
}
