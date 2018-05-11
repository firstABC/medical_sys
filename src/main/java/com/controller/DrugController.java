package com.controller;

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
import com.entity.Drug;
import com.service.DrugService;
import com.util.Utils;

@Controller
@RequestMapping("/drug")
public class DrugController {
	private static Logger logger = LoggerFactory
			.getLogger(DrugController.class);
	@Autowired
	private DrugService drugService;
	
	/**
	 * 通用页面跳转
	 */
	@RequestMapping(value="{page}",method=RequestMethod.GET)
	public ModelAndView toPage(@PathVariable("page")String page){
		return new ModelAndView(page);
	}
	/**
	 * 获取列表
	 * @return
	 */
	@RequestMapping("/list")
    public @ResponseBody MsgDTO drugList(){
		logger.info("Get Drug List Start");
		MsgDTO msgDTO = new MsgDTO();
		try{
			List<Drug> dList = drugService.getDrugList();
			if(Utils.listNotNull(dList)){
				msgDTO = MsgDTO.success();
				msgDTO.setTotal(dList.size());
				msgDTO.setData(dList);
			}else{
				msgDTO = MsgDTO.zero();
			}
			logger.info("Get Drug List End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		}catch(Exception e){
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Get Drug List Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}  
	/**
	 * 删除
	 * @param drugId
	 * @return
	 */
	@RequestMapping(value = "/delete", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO deleteDrug(@RequestParam("drugId")String drugId){
		logger.info("Delete Drug Start: drugId="+drugId);
		MsgDTO msgDTO = new MsgDTO();
		int total = 0;
		try {
			if(Utils.stringNotEmpty(drugId)){
				total = drugService.deleteDrug(drugId);
				if(Utils.numNotNull(total)){
					msgDTO = MsgDTO.success();
					msgDTO.setTotal(total);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}else{
				msgDTO = MsgDTO.fail();
			}
			logger.info("Delete Drug End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Delete Drug Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
	/**
	 * 添加或修改
	 * @param drug
	 * @return
	 */
	@RequestMapping(value = "/edit", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO updateDrug(Drug drug){
		logger.info("Edit Drug Start: "+drug.toString());
		MsgDTO msgDTO = new MsgDTO();
		int total = 0;
		try {
			if(Utils.stringNotEmpty(drug.getDrugid())){
				total = drugService.updateDrug(drug);
				if(Utils.numNotNull(total)){
					msgDTO.setStatus(MsgDTO.STATUS_OK);
					msgDTO.setMessage("修改成功!");
					msgDTO.setTotal(total);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}else{
				total = drugService.addDrug(drug);
				if(Utils.numNotNull(total)){
					msgDTO.setStatus(MsgDTO.STATUS_OK);
					msgDTO.setMessage("添加成功!");
					msgDTO.setTotal(total);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}
			logger.info("Edit Drug End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Edit Drug Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
	
	@RequestMapping(value = "/getDrug", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO getDrug(@RequestParam("drugId")String drugId){
		logger.info("Get Drug Start: drugId="+drugId);
		MsgDTO msgDTO = new MsgDTO();
		try {
			if(Utils.stringNotEmpty(drugId)){
				Drug drug = drugService.getDrug(drugId);
				if(drug != null){
					msgDTO = MsgDTO.success();
					msgDTO.setTotal(1);
					msgDTO.setData(drug);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}else{
				msgDTO = MsgDTO.fail();
			}
			logger.info("Get Drug End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("G Drug Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
	@RequestMapping(value = "/getDrugByCons", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO getDrugByCons(
			@RequestParam("drugname")String drugname,
			@RequestParam("drugcode")String drugcode){
		logger.info("Get Drug By Condition Start: drugname="+drugname+", drugcode="+drugcode);
		MsgDTO msgDTO = new MsgDTO();
		try {
			List<Drug> dList = drugService.getDrugByCons(drugname, drugcode);
			if(Utils.listNotNull(dList)){
				msgDTO = MsgDTO.success();
				msgDTO.setTotal(dList.size());
				msgDTO.setData(dList);
			}else{
				msgDTO = MsgDTO.zero();
			}
			logger.info("Get Drug By Condition End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Get Drug By Condition Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
}
