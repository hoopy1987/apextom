package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class articleedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/baseAdmin.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write('\n');

	String basePath = request.getContextPath();
	String  path= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+basePath;

      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/scripts/themes/default/easyui.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/scripts/themes/icon.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/scripts/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/scripts/jquery.easyui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/scripts/easyui-lang-zh_CN.js\"></script>");
      out.write("\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/ckeditor/ckeditor.js\"></script>\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/ckeditor/adapters/jquery.js\"></script>\n");
      out.write("<title>编辑</title>\n");
      out.write("<script  type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("\t\n");
      out.write("\t$('#classForm').form({\n");
      out.write("\t    url:\"");
      out.print(path);
      out.write("/class/edit/classid/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\",\n");
      out.write("\n");
      out.write("\t\tsuccess : function(data) {\n");
      out.write("\t\t\tvar data = eval('(' + data + ')');\n");
      out.write("\t\t\tvar message = 'success！';\n");
      out.write("\t\t\t//alert(data.resStatus);\n");
      out.write("\t\t\tif (data.resStatus != 'SUCCESS') {\n");
      out.write("\t\t\t\tmessage = 'failed：[error code:' + data.errCode\n");
      out.write("\t\t\t\t\t+ ']' + data.errMess;\n");
      out.write("\t\t\t\t$.messager.show({\n");
      out.write("\t\t\t\t\ttitle : 'Login Message',\n");
      out.write("\t\t\t\t\tmsg : message,\n");
      out.write("\t\t\t\t\tshowType : 'slide',\n");
      out.write("\t\t\t\t\tstyle : {\n");
      out.write("\t\t\t\t\t\tright : '',\n");
      out.write("\t\t\t\t\t\ttop : document.body.scrollTop\n");
      out.write("\t\t\t\t\t\t\t+ document.documentElement.scrollTop,\n");
      out.write("\t\t\t\t\t\tbottom : ''\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\twindow.location = '");
      out.print(path);
      out.write("/main';\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body style=\"font-size: 13px\">\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <br/>\n");
      out.write("\t 当前课程 ：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\t <br/>\n");
      out.write("</div>\n");
      out.write("<form action=\"\" id=\"classForm\" onsubmit=\"return false;\" method=\"post\">\n");
      out.write("<div style=\"width: 95%;height: 80%;padding-top: 20px\">\n");
      out.write("\t<textarea name=\"content\" style=\"height: 100%;width: 80%\" rows=\"10\" cols=\"20\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${class.content}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\n");
      out.write("\t<br/>\n");
      out.write("\t<font color=\"red\">注：以上内容为课程简介（首页展示内容）</font>\n");
      out.write("</div>\n");
      out.write("<div style=\"width: 95%;height: 80%;padding-top: 20px\">\n");
      out.write("\t<textarea class=\"ckeditor\" name=\"htmlStr\" style=\"height: 100%;width: 100%\"></textarea>\n");
      out.write("\t<br/>\n");
      out.write("\t<font color=\"red\">注：以上内容为课程课程详细介绍，图片请使用网络URL</font>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("\t<br/>\n");
      out.write("\t<br/>\n");
      out.write("\t<a id=\"preview\" href=\"#\" class=\"easyui-linkbutton\">预览</a>\n");
      out.write("\t<a id=\"save\" href=\"#\" class=\"easyui-linkbutton\">保存</a>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
