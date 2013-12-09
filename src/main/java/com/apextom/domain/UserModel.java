package com.apextom.domain;

import org.apache.commons.lang3.StringUtils;

/**
 * 用户模型
 * 
 * @author hoopy
 *
 */
public class UserModel extends BaseObj {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7960401016530214884L;

	/**
	 * 用户ID(保留字段)
	 */
	private String userId;
	
	/**
	 * 登录用户名
	 */
	private String userdm;
	
	/**
	 * 登录密码
	 */
	private String password;
	
	/**
	 * 用户名称
	 */
	private String username;
	
	/**
	 * 登录认证类型(0:管理员，1：普通教师)
	 */
	private String authType;
	
	/**
	 * 机关代码
	 */
	private String jgdm;
	
	/**
	 * 机关名称
	 */
	private String jgmc;
	
	/**
	 * 用户描述
	 */
	private String desUser;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserdm() {
		return userdm;
	}

	public void setUserdm(String userdm) {
		this.userdm = StringUtils.trimToEmpty(userdm);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = StringUtils.trimToEmpty(password);
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getDesUser() {
		return desUser;
	}

	public void setDesUser(String desUser) {
		this.desUser = desUser;
	}

	public String getJgdm() {
		return jgdm;
	}

	public void setJgdm(String jgdm) {
		this.jgdm = jgdm;
	}

	public String getJgmc() {
		return jgmc;
	}

	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}

}
