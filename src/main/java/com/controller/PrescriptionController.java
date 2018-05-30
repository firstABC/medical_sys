package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.MsgDTO;
import com.entity.MedicalRecord;
import com.entity.Prescription;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.PrescriptionService;
import com.util.Utils;

@Controller
@RequestMapping("/pp")
public class PrescriptionController {
	private static Logger logger = LoggerFactory
			.getLogger(PrescriptionController.class);
	@Resource
	private PrescriptionService prescriptionService;
	
	@RequestMapping("/pr")
	public ModelAndView preScriptionList(@RequestParam(value="icCardNum",defaultValue="")String icCardNum,
			@RequestParam(value="physician",defaultValue="")String physician,
			@RequestParam(value="pageno",defaultValue="1")Integer pageno,
			@RequestParam(value="pagesize",defaultValue="9")Integer pagesize,
			ModelMap map){
		ModelAndView mv = new ModelAndView();
		MsgDTO msgDTO = new MsgDTO();
		try{
			//指定查询的页码和每页的条数
			PageHelper.startPage(pageno, pagesize);
			List<Prescription> ltPr = prescriptionService.getPrListByCons(icCardNum, physician);
			if(Utils.listNotNull(ltPr)){
				msgDTO = MsgDTO.success();
				msgDTO.setTotal(ltPr.size());
				PageInfo<Prescription> pageInfo = new PageInfo<Prescription>(ltPr);
				Map<String,Object> mapP = new HashMap<String,Object>();
				mapP.put("pageInfo", pageInfo);
				msgDTO.setData(mapP);
				//msgDTO.setData(meList);
			}else{
				msgDTO = MsgDTO.zero();
			}
		}catch(Throwable e){
			logger.error("查询处方失败："+e);
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
		}
		
		logger.info("Get Prescription List End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		map.put("icCardNum", icCardNum);
		map.put("physician", physician);
		map.put("msgDTO", msgDTO);
		mv.setViewName("recipeHis");
		return mv;
	}
	
	@RequestMapping("/info")
	public ModelAndView preScriptionInfo(HttpServletRequest request,@RequestParam(value="perId",defaultValue="")String perId){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("recipeXq");
		Prescription prescription = null;
		if(perId!=""){
			 prescription = prescriptionService.queryPrescriptionById(perId);
		}
		mv.addObject("prescription", prescription);
		return mv;
	}
}
