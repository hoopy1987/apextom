package com.apextom.webstatic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.apextom.util.PathUtil;

/**
 * 网页静态化 -- nginx指向目录
 * @author hoopy
 */
@Component
public class WebStatic {
	
	private static Logger logger = Logger.getLogger(WebStatic.class);

	/**
	 * 生成静态页面
	 * @param page 存放静态页面的本地文件路径
	 * @param url_addr 所要生成的静态页的URL地址
	 * @return 生成状态
	 */
	public boolean CreateHtml(String dir,String page, String url_addr) {
		File file = new File(dir);
		if(!file.exists()){
			file.mkdirs();
		}
		
		URL url;
		String rLine = null;
		PrintWriter fileOut = null;
		InputStream ins = null;
		try {
			url = new URL(url_addr);
			ins = url.openStream();
			BufferedReader bReader = new BufferedReader(new InputStreamReader(
					ins, "UTF-8"));// 获取编码为gb2312的文件
			FileOutputStream out = new FileOutputStream(page);
			OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
			fileOut = new PrintWriter(writer);
			// 循环取取数据,并写入目标文件中
			while ((rLine = bReader.readLine()) != null) {
				String tmp_rLine = rLine;
				int str_len = tmp_rLine.length();
				if (str_len > 0) {
					fileOut.println(tmp_rLine);
					fileOut.flush();
				}
				tmp_rLine = null;
			}
			url = null;
			return true;
		} catch (IOException e) {
			logger.error("error: " + e.getMessage());
			return false;
		} catch (Exception es) {
			logger.error("error: " + es.getMessage());
			return false;
		} finally {// 关闭资源
			fileOut.close();
			try {
				ins.close();
			} catch (IOException ex) {
				// 关闭输入流出错
				ex.printStackTrace();
			}
		}

	}

}
