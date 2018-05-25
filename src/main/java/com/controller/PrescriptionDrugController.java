package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.entity.PrescriptionDrug;
import com.entity.Earlywarning;
import com.entity.MedicalRecord;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.PrescriptionDrugService;
import com.service.EWService;
import com.util.Utils;

@Controller
@RequestMapping("/predrug")
public class PrescriptionDrugController {
	private static Logger logger = LoggerFactory
			.getLogger(PrescriptionDrugController.class);
	@Autowired
	private PrescriptionDrugService preDrugService;
	@Autowired
	private EWService ewService;
	
	/**
	 * 获取列表
	 * @return
	 */
	@RequestMapping("/list")
    public @ResponseBody MsgDTO drugList(
    		@RequestParam(value="prescriptionId",defaultValue="")String prescriptionId){
		logger.info("Get PrescriptionDrug List Start: prescriptionId="+prescriptionId);
		MsgDTO msgDTO = new MsgDTO();
		List<PrescriptionDrug> pList = new ArrayList<PrescriptionDrug>();
		try{
			if(Utils.stringNotEmpty(prescriptionId)){
				pList = preDrugService.getPreByCons(prescriptionId);
			}else{
				pList = new ArrayList<PrescriptionDrug>();
			}
			if(Utils.listNotNull(pList)){
				msgDTO = MsgDTO.success();
				msgDTO.setTotal(pList.size());
				msgDTO.setData(pList);
			}else{
				msgDTO = MsgDTO.zero();
			}
			logger.info("Get PrescriptionDrug List End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		}catch(Exception e){
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Get PrescriptionDrug List Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}  
	/**
	 * 删除
	 * @param drugId
	 * @return
	 */
	@RequestMapping(value = "/delete", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO deletePrescriptionDrug(@RequestParam("id")String id){
		logger.info("Delete PrescriptionDrug Start: id="+id);
		MsgDTO msgDTO = new MsgDTO();
		int total = 0;
		try {
			if(Utils.stringNotEmpty(id)){
				total = preDrugService.deletePre(id);
				if(Utils.numNotNull(total)){
					msgDTO = MsgDTO.success();
					msgDTO.setTotal(total);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}else{
				msgDTO = MsgDTO.fail();
			}
			logger.info("Delete PrescriptionDrug End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Delete PrescriptionDrug Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
	/**
	 * 添加或修改
	 * @param drug
	 * @return
	 */
	@RequestMapping(value = "/add", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO addPrescriptionDrug(PrescriptionDrug drug){
		logger.info("Add PrescriptionDrug Start: "+drug.toString());
		MsgDTO msgDTO = new MsgDTO();
		int total = 0;
		try {
			if(Utils.stringNotEmpty(drug.getId())){
				msgDTO = MsgDTO.fail();
			}else{
				total = preDrugService.addPre(drug);
				if(Utils.numNotNull(total)){
					msgDTO.setStatus(MsgDTO.STATUS_OK);
					msgDTO.setMessage("添加成功!");
					msgDTO.setTotal(total);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}
			logger.info("Add PrescriptionDrug End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Add PrescriptionDrug Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
	/**
	 * 添加或修改
	 * @param drug
	 * @return
	 */
	@RequestMapping(value = "/update", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO updatePrescriptionDrug(PrescriptionDrug drug){
		logger.info("Update PrescriptionDrug Start: "+drug.toString());
		MsgDTO msgDTO = new MsgDTO();
		int total = 0;
		try {
			if(Utils.stringNotEmpty(drug.getId())){
				total = preDrugService.updatePre(drug);
				if(Utils.numNotNull(total)){
					msgDTO.setStatus(MsgDTO.STATUS_OK);
					msgDTO.setMessage("修改成功!");
					msgDTO.setTotal(total);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}else{
				msgDTO = MsgDTO.fail();
			}
			logger.info("Edit PrescriptionDrug End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Edit PrescriptionDrug Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
	
}
