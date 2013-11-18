package com.apextom.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.apextom.service.WebStaticService;
import com.apextom.webstatic.WebStatic;

@Service("webStaticService")
public class WebStaticServiceImpl implements WebStaticService {
	
	private static Logger logger = Logger.getLogger(WebStaticServiceImpl.class);
	
	@Autowired
	private WebStatic webStatic;
	
	@Value("${web.baseUrl}")
	private String baseUrl;
	
	@Value("${web.baseDir}")
	private String baseDir;

	public void initWebStatic() {
		logger.info(baseUrl + baseDir + "------------------------------------");
		String[] pageList = {
				""
		};
		doWebStatic(pageList);
	}

	public void doWebStatic(String ...pages) {
		for(String page : pages){
			webStatic(page);
		}

	}
	
	private void webStatic(String page){
		String htmlName = "";
		if("".equals(page)){
			htmlName = "index.html";
		}
		webStatic.CreateHtml(baseDir,baseDir + htmlName, baseUrl + page);
	}

}
