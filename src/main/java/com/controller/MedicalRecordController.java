package com.controller;

import java.text.ParseException;
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

import com.dto.MedicalRecordCons;
import com.dto.MsgDTO;
import com.entity.Drug;
import com.entity.MedicalRecord;
import com.entity.MedicalRecord;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	public ModelAndView meReList(@RequestParam(value="icCardNum",defaultValue="")String icCardNum,
			@RequestParam(value="pageno",defaultValue="1")Integer pageno,
			@RequestParam(value="pagesize",defaultValue="9")Integer pagesize,
			ModelMap map
    		){
		logger.info("Get MedicalRecord List Start: icCardNum="+icCardNum);
		MsgDTO msgDTO = new MsgDTO();
		//指定查询的页码和每页的条数
		PageHelper.startPage(pageno, pagesize);
		List<MedicalRecord> meList = new ArrayList<MedicalRecord>();
		try{
			if(Utils.stringNotEmpty(icCardNum)){
				map.put("icCardNum", icCardNum);
				meList = medicalRecordService.getMeReListByCons(icCardNum);
			}else{
				//参数为空,查询全部
				meList = medicalRecordService.getMeReList();
			}
			if(Utils.listNotNull(meList)){
				msgDTO = MsgDTO.success();
				msgDTO.setTotal(meList.size());
				PageInfo<MedicalRecord> pageInfo = new PageInfo<MedicalRecord>(meList);
				Map<String,Object> mapP = new HashMap<String,Object>();
				mapP.put("pageInfo", pageInfo);
				msgDTO.setData(mapP);
				//msgDTO.setData(meList);
			}else{
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
	/**
	 * 获取病历详细信息
	 * @param id
	 * @param map
	 * @return
	 */
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
	/**
	 * 新增病历
	 * @param meRe
	 * @return
	 */
	@RequestMapping(value = "/edit", method = { RequestMethod.POST })
	public @ResponseBody MsgDTO addMedicalRecord(MedicalRecordCons meRe){
		logger.info("Edit MedicalRecord Start: "+meRe.toString());
		MsgDTO msgDTO = new MsgDTO();
		MedicalRecord res = null;
		try {
			if(Utils.stringNotEmpty(meRe.getId())){
				res = medicalRecordService.updateMeRe(meRe);
				if(res != null){
					msgDTO.setStatus(MsgDTO.STATUS_OK);
					msgDTO.setMessage("修改成功!");
					msgDTO.setTotal(1);
					msgDTO.setData(res);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}else{
				res = medicalRecordService.addMeRe(meRe);
				if(res != null){
					msgDTO.setStatus(MsgDTO.STATUS_OK);
					msgDTO.setMessage("添加成功!");
					msgDTO.setTotal(1);
					msgDTO.setData(res);
				}else{
					msgDTO = MsgDTO.zero();
				}
			}
			logger.info("Edit MedicalRecord End: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage()+" Total:"+msgDTO.getTotal());
		} catch (ParseException pe) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(pe.getMessage());
			logger.error("Edit MedicalRecord ParseException: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}catch (Exception e) {
			msgDTO.setStatus(MsgDTO.STATUS_ERR);
			msgDTO.setMessage(e.getMessage());
			logger.error("Edit MedicalRecord Exception: Status:"+msgDTO.getStatus()+" Message:"+msgDTO.getMessage());
		}
		return msgDTO;
	}
}
