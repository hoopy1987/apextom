package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>登陆</title>\n");
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
      out.write("/scripts/easyui-lang-zh_CN.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/login.css\">\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("// 登陆\n");
      out.write("$('#login_but').bind('click', function(){\n");
      out.write("\tvar message = '';\n");
      out.write("\t// 校验\n");
      out.write("\tif($('#userdm').val() == ''){\n");
      out.write("\t\tmessage = 'username  ';\n");
      out.write("\t}\n");
      out.write("\tif($('#dataUserPassword').val() == ''){\n");
      out.write("\t\tmessage += 'password  ';\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tif(message != ''){\n");
      out.write("\t\tmessage += 'is empty!';\n");
      out.write("\t\t$.messager.show({\n");
      out.write("\t\t\ttitle:'Tips',\n");
      out.write("\t\t\tmsg: message,\n");
      out.write("\t\t\tshowType:'slide',\n");
      out.write("\t\t\tstyle:{\n");
      out.write("\t\t\t\tright:'',\n");
      out.write("\t\t\t\ttop:document.body.scrollTop+document.documentElement.scrollTop,\n");
      out.write("\t\t\t\tbottom:''\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\treturn;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t$('#loginFormMain').submit();\n");
      out.write("});\n");
      out.write("\n");
      out.write("// 登陆\n");
      out.write("$('#loginFormMain').form({\n");
      out.write("    url:\"");
      out.print(path);
      out.write("/login\",\n");
      out.write("\n");
      out.write("\tsuccess : function(data) {\n");
      out.write("\t\tvar data = eval('(' + data + ')');\n");
      out.write("\t\tvar message = 'success！';\n");
      out.write("\t\t\n");
      out.write("\t\talert(data.resStatus);\n");
      out.write("\t\t\n");
      out.write("\t\tif (data.resStatus != 'SUCCESS') {\n");
      out.write("\t\t\tmessage = 'failed：[error code:' + data.errCode\n");
      out.write("\t\t\t\t+ ']' + data.errMess;\n");
      out.write("\t\t\t$.messager.show({\n");
      out.write("\t\t\t\ttitle : 'Login Message',\n");
      out.write("\t\t\t\tmsg : message,\n");
      out.write("\t\t\t\tshowType : 'slide',\n");
      out.write("\t\t\t\tstyle : {\n");
      out.write("\t\t\t\t\tright : '',\n");
      out.write("\t\t\t\t\ttop : document.body.scrollTop\n");
      out.write("\t\t\t\t\t\t+ document.documentElement.scrollTop,\n");
      out.write("\t\t\t\t\tbottom : ''\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\twindow.location = '");
      out.print(path);
      out.write("/main';\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("});\n");
      out.write("\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body id=\"public\" class=\"login \">\n");
      out.write("\n");
      out.write("\t<!-- HEADER -->\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div class=\"nav_wrapper\">\n");
      out.write("\t\t\t<div class=\"nav_container\">\n");
      out.write("\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t<li class=\"back\"><a href=\"");
      out.print(path);
      out.write("\" title=\"Apextom.com\">Apextom.com\n");
      out.write("\t\t\t\t\t\t\t<span class=\"arr\">→</span>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"hero-container\">\n");
      out.write("\t\t\t<div id=\"hero\" class=\"pad\">\n");
      out.write("\t\t\t\t<h1>Log In</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- WRAPPER -->\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div id=\"shell\" class=\"container\">\n");
      out.write("\t\t\t<div id=\"content\" class=\"pad\">\n");
      out.write("\n");
      out.write("\t\t\t\t<form action=\"\" id=\"loginFormMain\" onsubmit=\"return false;\"\n");
      out.write("\t\t\t\t\tmethod=\"post\">\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<span class=\"field big\"><input id=\"userdm\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tname=\"userdm\" tabindex=\"1\" class=\"validate[email] titleinside\"\n");
      out.write("\t\t\t\t\t\t\ttitle=\"Username\" value=\"Username\"></span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<span class=\"field password big\"> <input\n");
      out.write("\t\t\t\t\t\t\tid=\"dataUserPassword\" type=\"text\" name=\"password\" tabindex=\"2\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"validate[required] titleinside\" title=\"Password\" value=\"\">\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<div id=\"form_submit\">\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" id=\"login_but\" tabindex=\"4\" value=\"Log In\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"submit link green rounded_5\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END WRAPPER -->\n");
      out.write("\n");
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
