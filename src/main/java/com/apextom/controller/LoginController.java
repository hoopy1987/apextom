package com.apextom.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.apextom.common.BaseResponse;
import com.apextom.common.RestfulExceptions;
import com.apextom.domain.UserModel;
import com.apextom.exception.UnMacthingDataException;
import com.apextom.service.UserService;

/**
 * 登录控制器
 * @author lys
 */
@Controller
public class LoginController extends BaseController {
	
	private static Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/index" )
	public String index(){
		return "index";
	}
	
	/**
	 * 用户登陆
	 * @param user 
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/tologin" )
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	/**
	 * 用户登陆
	 * @param user 
	 * @param httpServletRequest
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/login" ,method = RequestMethod.POST)
	public String login(@ModelAttribute("user") UserModel user,
			HttpServletRequest httpServletRequest) {
		try {
			UserModel userInfo = userService.checkLogin(user.getUserdm(), user.getPassword());
			setSessionAttribute(httpServletRequest,SESSION_USERINFO,userInfo);
			if(logger.isDebugEnabled()){
				logger.debug("User Login Event:" + JSON.toJSONString(userInfo));
			}
			
		} catch (UnMacthingDataException e){
			return RestfulExceptions.UNKNOW_SYS_ERROR.setErrMess("Error username/password!").getResponse();
		} catch (Exception e){
			return RestfulExceptions.UNKNOW_SYS_ERROR.setErrMess("Error username/password!").getResponse();
		}
		BaseResponse br = new BaseResponse();
		return JSON.toJSONString(br);
	}
	
	/**
	 * 登陆跳转
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/main")
	public ModelAndView login(HttpServletRequest httpServletRequest) {
		return new ModelAndView("main");
	}
	
	/**
	 * 退出系统
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/logout", produces = TEXT_HTML_PRODUCES)
	public String logout(HttpServletRequest httpServletRequest) {
		removeSessionAttribute(httpServletRequest, SESSION_USERINFO);
		BaseResponse br = new BaseResponse();
		return JSON.toJSONString(br);
	}

}