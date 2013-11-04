package com.apextom.service;

import com.apextom.domain.UserModel;

/**
 * 用户服务接口
 * 
 * @author lys
 *
 */
public interface UserService {
	
	/**
	 * 验证用户登陆密码
	 * 
	 * @param userdm
	 * @param password
	 * @return 
	 */
	UserModel checkLogin(String userdm,String password) throws Exception; 
	
}
