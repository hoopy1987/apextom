package com.apextom.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.apextom.domain.MenuTreeModel;
import com.apextom.domain.UserModel;

/**
 * 文章管理
 * 
 * @author lys
 */
@Controller
public class ArticleController extends BaseController {
	
	private static Logger logger = Logger.getLogger(ArticleController.class);
	
	@RequestMapping(value = "/index" )
	public String index(){
		return "index";
	}
	
	/**
	 * 各类型首页
	 * 
	 * @param user 
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/articlelist/ptype/{ptype}/aid/{aid}" )
	public ModelAndView articleMain(@PathVariable("ptype") String ptype,@PathVariable("aid") String aid) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("ptype", ptype);
		map.put("aid", aid);
		
		String viewName = "";
		// 课程 ，直接打开现有编辑界面
		if("1".equals(ptype)){
			viewName = "articleedit";
		}
		// 常规或下载，列表页面
		else {
			viewName = "articlelist";
		}
		return new ModelAndView(viewName,map);
	}

	/**
	 * 文章编辑
	 * 
	 * @param userdm
	 * @return
	 */
	@RequestMapping(value = "/article/ptype/{ptype}/aid/{aid}",produces = TEXT_HTML_PRODUCES)
	@ResponseBody
	public String articlelist(HttpServletRequest httpServletRequest) {
		return null;
	}

}