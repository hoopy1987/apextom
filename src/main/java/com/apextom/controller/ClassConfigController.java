package com.apextom.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.apextom.domain.ClassModel;
import com.apextom.service.ClassService;

/**
 * 文章管理
 * 
 * @author lys
 */
@Controller
@RequestMapping("/class")
public class ClassConfigController extends BaseController {
	
	private static Logger logger = Logger.getLogger(ClassConfigController.class);
	
	@Autowired
	private ClassService classService;
	
	/**
	 * 课程类型
	 * 
	 * @param user 
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/config/classid/{classId}" )
	public ModelAndView articleMain(@PathVariable("classId") Integer classId) {
		ClassModel classModel = new ClassModel();
		classModel = classService.queryClassByClassId(classId);
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("classId", classId);
		map.put("class", classModel);
		
		return new ModelAndView("articleedit",map);
	}

	/**
	 * 文章编辑
	 * 
	 * @param userdm
	 * @return
	 */
	@RequestMapping(value = "/edit/classid/{classId}",produces = TEXT_HTML_PRODUCES)
	@ResponseBody
	public String articleEdit(HttpServletRequest httpServletRequest,@PathVariable("classId") Integer classId) {
		
		logger.info("Save class " + classId + " and create html!");
		
		return null;
	}

}