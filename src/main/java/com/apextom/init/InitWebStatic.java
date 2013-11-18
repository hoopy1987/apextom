package com.apextom.init;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apextom.service.WebStaticService;

@Component("initWebStatic")
public class InitWebStatic implements InitializingBean {
	
	private static Logger logger = Logger.getLogger(InitWebStatic.class);
	
	@Autowired
	private WebStaticService webStaticService;
	
	private final long lazyTime = 10000L;
	
	/**
	 * 初始化静态页面
	 */
	public void afterPropertiesSet() throws Exception {
		InitThread init = new InitThread();
        Thread tt = new Thread(init);
        tt.start();
	}
	
	class InitThread implements Runnable {

	    public void run() {
	    	
	    	try {
				Thread.sleep(lazyTime);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
	    	
	    	logger.info("----------------- InitWebStatic start!----------------------------");
			try{
				webStaticService.initWebStatic();
				logger.info("--------------------InitWebStatic finish! -------------------------");
			}catch(Exception e){
				logger.error("InitWebStatic cause error ,please check!", e);
			}
	    }

	}

}
