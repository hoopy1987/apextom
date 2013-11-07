package com.apextom.util;

import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.binary.Base64;

/**
 * 信息编码工具类
 * @author hoopy
 *
 */
public class DigestUtil {
	
	/**
	 * MD5
	 */
	public static String DIGESTTYPE_MD5 = "MD5";
	
	/**
	 * 常用于密码转码加密
	 * @param message
	 * @return 信息MD5加密，BASE64编码后字符串
	 * @throws Exception
	 */
	public static String encodeMessageMD5(String message) throws Exception{
		Base64 encoder = new Base64();
		
		String str = encoder.encodeToString(MessageDigest.getInstance(DIGESTTYPE_MD5).digest(
				message.getBytes()));
		
		Pattern p = Pattern.compile("\\s*|\t|\r|\n");
		Matcher m = p.matcher(str);
		
		return m.replaceAll("");
	}
	
	/**
	 * test User: CZ00005
	 * @param args
	 */
	public static void main(String[] args){
		try {
			System.out.println(DigestUtil.encodeMessageMD5("123456"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
