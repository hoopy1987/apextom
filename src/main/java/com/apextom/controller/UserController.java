package com.apextom.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.apextom.common.BaseResponse;
import com.apextom.common.RestfulExceptions;
import com.apextom.domain.ModifyUserModel;

/**
 * 用户控制器
 * 
 * @author lys
 */
@Controller
public class UserController extends BaseController {
	
	private static Logger logger = Logger.getLogger(UserController.class);

	/**
	 * 修改用户密码
	 * 
	 * @param modifyUser
	 * @return 成功失败信息
	 */
	@RequestMapping(value = "/modify/pwd", method = RequestMethod.POST ,produces = TEXT_HTML_PRODUCES)
	@ResponseBody
	public String login(@ModelAttribute("user") ModifyUserModel modifyUser) {
			
		if(logger.isDebugEnabled()){
			logger.debug("User modifyUser info :" + JSON.toJSONString(modifyUser));
		}
		
		if("123".equals(modifyUser.getUserdm())){
			return RestfulExceptions.UNKNOW_SYS_ERROR.getResponse();
		}else {
			BaseResponse br = new BaseResponse();
			return JSON.toJSONString(br);
		}
	}

}