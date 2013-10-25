package com.apextom.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

@Controller
public abstract class BaseController {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

	/**
	 * 使用.html作为后缀的时候,并且返回是String格式的数据
	 */
	public static final String TEXT_HTML_PRODUCES = "text/html;charset=UTF-8";

	public static final String TEXT_JSON_PRODUCES = "text/json;charset=UTF-8";

	public static final String TEXT_PLAIN_PRODUCES = "text/plain;charset=UTF-8";

	public static final String APPLICATION_JSON_PRODUCES = "application/json;charset=UTF-8";

	public static final String SESSION_SLRY = "SLRY";
	
	public static final String SESSION_USERINFO = "USERINFO";
	
	public static final int DEFAULT_PAGE_SIZE = 15;
	
	public static final String PAGE_NO = "PAGENO";
	
	public static final String PAGE_TOTAL_COUNT = "TOTAL";
	
	
	/**
     * 结果集
     * @param sql
     * @param start
     * @param end
     * @return
     */
    protected  List<Map<String, Object>> getResultBySql(String sql) {
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        return rows;
    }
	
	
	
	/**
	 * 获取session数据
	 * @param httpServletRequest
	 * @param sessionKey
	 * @return
	 */
	protected Object getSessionAttribute(HttpServletRequest httpServletRequest,String sessionKey){
		return httpServletRequest.getSession().getAttribute(sessionKey);
	}
	
	/**
	 * 存放session数据
	 * @param httpServletRequest
	 * @param sessionKey
	 * @param value
	 */
	protected void setSessionAttribute(HttpServletRequest httpServletRequest,String sessionKey,Object valueObj){
		httpServletRequest.getSession().setAttribute(sessionKey, valueObj);
	}
	

	/**
	 * 分页起始行
	 * 
	 * @param page
	 *            页码
	 * @param rows
	 *            每页行数
	 * @return
	 */
	protected int getStart(int page, int rows) {
		int start = (page - 1) * rows + 1;
		return start;
	}

	/**
	 * 分页结束行
	 * 
	 * @param total
	 * @param page
	 * @param rows
	 * @return
	 */
	protected int getEnd(int total, int page, int rows) {
		int end = page * rows;
		if (end > (total - 1)) {
			end = total;
		}
		return end;
	}
	
	
	protected String getStartTimeHH24MISS(String startYYYYMMDD){
	    return startYYYYMMDD+" 00:00:00";
	}
	
	protected String getEndTimeHH24MISS(String endYYYYMMDD){
        return endYYYYMMDD+" 23:59:59";
    }
}
