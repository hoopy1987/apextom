package com.ezizoo.framework.interceptor;  
  
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ezizoo.framework.controller.BaseController;
  
/**
 * session 拦截器 
 * @author hoopy
 *
 */
@Repository  
public class SystemInterceptor extends HandlerInterceptorAdapter {  
  
	private static Logger logger = Logger.getLogger(SystemInterceptor.class); 
  
    /* 
     * (non-Javadoc) 
     *  
     * @see 
     * org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle 
     * (javax.servlet.http.HttpServletRequest, 
     * javax.servlet.http.HttpServletResponse, java.lang.Object) 
     */  
    @Override  
    public boolean preHandle(HttpServletRequest request,  
            HttpServletResponse response, Object handler) throws Exception {  
  
        request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8");  
        response.setContentType("text/html;charset=UTF-8");  
  
        // 后台session控制  
        String[] noFilters = new String[] { "login", "/modify/pwd","/css","/img","/scripts" };  
        String uri = request.getRequestURI();  
  
        if (uri.indexOf("zhzs") != -1) {  
            boolean beFilter = true;  
            for (String s : noFilters) {  
                if (uri.indexOf(s) != -1) {  
                    beFilter = false;  
                    break;  
                }  
            }  
            if (beFilter) {  
                Object obj = request.getSession().getAttribute(BaseController.SESSION_USERINFO);  
                if (null == obj) {  
  
                    // 未登录  
                    PrintWriter out = response.getWriter();  
                    StringBuilder builder = new StringBuilder();  
                    builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");  
                    builder.append("alert(\"页面过期，请重新登录\");");  
                    builder.append("window.top.location.href=\"");  
                    builder.append(";</script>");  
                    out.print(builder.toString());  
                    out.close();  
                    return false;  
                } else {  
                    // 添加日志  
                	if(logger.isDebugEnabled()){
                		logger.debug(request.getRemoteHost() + " visit :" + uri);
                	}
//                    String operateContent = Constants.operateContent(uri);  
//                    if (null != operateContent) {  
//                        String url = uri.substring(uri.indexOf("background"));  
//                        String ip = request.getRemoteAddr();  
//                        Integer userId = ((SystemUserForm) obj).getId();  
//                        SystemLoggerForm form = new SystemLoggerForm();  
//                        form.setUserId(userId);  
//                        form.setIp(ip);  
//                        form.setOperateContent(operateContent);  
//                        form.setUrl(url);  
//                        this.systemLoggerService.edit(form);  
//                    }  
                }  
            }  
        }  
  
//        Map paramsMap = request.getParameterMap();  
//  
//        for (Iterator<Map.Entry> it = paramsMap.entrySet().iterator(); it  
//                .hasNext();) {  
//            Map.Entry entry = it.next();  
//            Object[] values = (Object[]) entry.getValue();  
//            for (Object obj : values) {  
//                if (!DataUtil.isValueSuccessed(obj)) {  
//                    throw new RuntimeException("有非法字符：" + obj);  
//                }  
//            }  
//        }  
  
        return super.preHandle(request, response, handler);  
    }  
  
}  