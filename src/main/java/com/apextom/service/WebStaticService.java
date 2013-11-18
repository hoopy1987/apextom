package com.apextom.service;


/**
 * 网页静态化服务
 *  
 * @author lys
 *
 */
public interface WebStaticService {
	
	/**
	 * 初始化所有栏目的静态页面
	 */
	public void initWebStatic();
	
	/**
	 * 将某页面静态化（更新页面数据时使用）
	 */
	public void doWebStatic(String ...pages);
	
}
