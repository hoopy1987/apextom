package com.apextom.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.apextom.domain.MenuTreeModel;
import com.apextom.domain.UserModel;
import com.apextom.service.MenuService;

/**
 * 菜单
 * @author lys
 */
@Controller
public class MenuController extends BaseController {
	
	private static Logger logger = Logger.getLogger(MenuController.class);
	
	@Autowired
	private MenuService menuService;

	/**
	 * 获取菜单
	 * 
	 * @param userdm
	 * @return
	 */
	@RequestMapping(value = "/menu",produces = TEXT_HTML_PRODUCES)
	@ResponseBody
	public String menu(HttpServletRequest httpServletRequest) {
		UserModel userInfo = (UserModel) getSessionAttribute(httpServletRequest, SESSION_USERINFO);
		
		try {
			List<MenuTreeModel> menuList = menuService.queryMenuTreeByRight(userInfo.getAuthType());
			
			if(logger.isDebugEnabled()){
				logger.debug("Begin to get user menuTree, userdm :" + JSON.toJSONString(menuList));
			}
			
			return JSON.toJSONString(menuList);
		}catch(Exception e){
			return null;	
		}
	}

}