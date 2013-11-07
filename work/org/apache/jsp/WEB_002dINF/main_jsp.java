package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Apextom</title>\n");
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
      out.write(" \n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body,td,th {\n");
      out.write("\tfont-size: 12px;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\tmargin-top: 0px;\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("}\n");
      out.write(".STYLE2 {color: #064684}\n");
      out.write("a{TEXT-DECORATION:none}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("// tabs\n");
      out.write("$(function(){\n");
      out.write("\t$('#tt').tabs({\n");
      out.write("\t\tonLoad:function(panel){\n");
      out.write("\t\t\tvar plugin = panel.panel('options').title;\n");
      out.write("\t\t\tpanel.find('textarea[name=\"code-'+plugin+'\"]').each(function(){\n");
      out.write("\t\t\t\tvar data = $(this).val();\n");
      out.write("\t\t\t\tdata = data.replace(/(\\r\\n|\\r|\\n)/g, '\\n');\n");
      out.write("\t\t\t\tif (data.indexOf('\\t') == 0){\n");
      out.write("\t\t\t\t\tdata = data.replace(/^\\t/, '');\n");
      out.write("\t\t\t\t\tdata = data.replace(/\\n\\t/g, '\\n');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tdata = data.replace(/\\t/g, '    ');\n");
      out.write("\t\t\t\tvar pre = $('<pre name=\"code\" class=\"prettyprint linenums\"></pre>').insertAfter(this);\n");
      out.write("\t\t\t\tpre.text(data);\n");
      out.write("\t\t\t\t$(this).remove();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t//prettyPrint();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$('#tree').tree({\n");
      out.write("\t\tonClick: function(node){\n");
      out.write("\t\t\t//alert(node.text);  // alert node text property when clicked\n");
      out.write("\t\t\t//alert(node.text + node.attributes.url);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(node.attributes.url != \"\"){\n");
      out.write("\t\t\t\tvar s=\"");
      out.print(path);
      out.write("\"+node.attributes.url;\n");
      out.write("\t\t\t\topen1(node.text,s);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("\n");
      out.write("// open\n");
      out.write("function open1(plugin,url){\n");
      out.write("\tvar url='<iframe scrolling=\"yes\" frameborder=\"0\"  src='+url+' style=\"width:100%;height:100%;\"></iframe>'\n");
      out.write("\tif ($('#tt').tabs('exists',plugin)){\n");
      out.write("\t\t$('#tt').tabs('select', plugin);\n");
      out.write("\t} else {\n");
      out.write("\t\t$('#tt').tabs('add',{\n");
      out.write("\t\t\ttitle:plugin,\n");
      out.write("\t\t\tcontent: url,\n");
      out.write("\t\t\tclosable:true\n");
      out.write("\t\t\t/* extractor:function(data){\n");
      out.write("\t\t\t\tdata = $.fn.panel.defaults.extractor(data);\n");
      out.write("\t\t\t\tvar tmp = $('<div></div>').html(data);\n");
      out.write("\t\t\t\tdata = tmp.find('#content').html();\n");
      out.write("\t\t\t\ttmp.remove();\n");
      out.write("\t\t\t\treturn data;\n");
      out.write("\t\t\t} */\n");
      out.write("\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script type=\"text/JavaScript\">\n");
      out.write("<!--\n");
      out.write("function MM_swapImgRestore() { //v3.0\n");
      out.write("  \tvar i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_preloadImages() { //v3.0\n");
      out.write("  \tvar d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();\n");
      out.write("    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)\n");
      out.write("    if (a[i].indexOf(\"#\")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_findObj(n, d) { //v4.01\n");
      out.write("  \tvar p,i,x;  if(!d) d=document; if((p=n.indexOf(\"?\"))>0&&parent.frames.length) {\n");
      out.write("    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}\n");
      out.write("  \tif(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];\n");
      out.write("  \tfor(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);\n");
      out.write("  \tif(!x && d.getElementById) x=d.getElementById(n); return x;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_swapImage() { //v3.0\n");
      out.write("  \tvar i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)\n");
      out.write("   \tif ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function openrili(){\n");
      out.write("\twindow.showModalDialog(\"");
      out.print(path);
      out.write("/public/rili.htm\",window,\"dialogWidth:600px;status:no;dialogHeight:500px\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("function goquest(){\n");
      out.write("\t$.messager.confirm('提示', '您确定要退出系统吗?', function(r){\n");
      out.write("        if (r){\n");
      out.write("        \t$.ajax({ \n");
      out.write("        \t\turl: '");
      out.print(path);
      out.write("/logout', \n");
      out.write("        \t\tsuccess: function(){\n");
      out.write("                \twindow.location = \"");
      out.print(path);
      out.write("\";\n");
      out.write("            \t}\n");
      out.write("        \t});\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("}\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body class=\"easyui-layout\" style=\"text-align:left\">\n");
      out.write("\t\n");
      out.write("\t<!-- 标题区域 -->\n");
      out.write("\t<div region=\"north\" border=\"false\" text-align: center\">\n");
      out.write("\n");
      out.write("\t\t<div id=\"header-inner\">\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" style=\"width: 100%;\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td style=\"height: 52px;\">\n");
      out.write("\t\t\t\t\t\t<div style=\"color: #fff; font-size: 22px; font-weight: bold;\">\n");
      out.write("\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"46%\" valign=\"top\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbackground=\"img/backggroup1.gif\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"499\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"img/bt.jpg\" width=\"499\" height=\"69\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" height=\"29\" border=\"0\" cellpadding=\"0\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\" background=\"img/bg_3.gif\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"bottom\"><table width=\"390\" height=\"27\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</table></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"54%\" valign=\"top\" bgcolor=\"#a8d7ea\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" background=\"\"><table width=\"100%\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" background=\"img/top_bg1.gif\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"STYLE2\"> 【");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USERINFO.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("】</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"48\"><img src=\"img/jiao.gif\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"26\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</table></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\"><table width=\"100%\" height=\"72\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tborder=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td background=\"img/bg_4.gif\">&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"73\"><img src=\"img/dh_0.gif\" width=\"73\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"72\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"360\" valign=\"top\" background=\"img/bg_5.gif\"><table\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"javascript:openrili()\" title='打开日历'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonmouseout=\"MM_swapImgRestore()\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonmouseover=\"MM_swapImage('Image9','','img/index1_03.gif',1)\"><img\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"img/index2_03.gif\" name=\"Image9\" width=\"72\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"72\" border=\"0\" id=\"Image9\" /></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:openwin('\\modifypassword.jsp');\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle='设置' onmouseout=\"MM_swapImgRestore()\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonmouseover=\"MM_swapImage('Image10','','img/index1_04.gif',1)\"><img\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"img/index2_04.gif\" name=\"Image10\" width=\"55\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"72\" border=\"0\" id=\"Image10\" /></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"javascript:goquest()\" title='退出系统'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonmouseout=\"MM_swapImgRestore()\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonmouseover=\"MM_swapImage('Image13','','img/index1_07.gif',1)\"><img\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"img/index2_07.gif\" name=\"Image13\" width=\"66\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\theight=\"72\" border=\"0\" id=\"Image13\" /></a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"66\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"66\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</table></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 菜单区域 -->\n");
      out.write("\t<div region=\"west\" border=\"false\" split=\"true\" title=\"系统功能\"\n");
      out.write("\t\tstyle=\"width: 250px; padding: 5px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<ul id=\"tree\" class=\"easyui-tree\" data-options=\"url:'");
      out.print(path);
      out.write("/menu'\">\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 内容区域 -->\n");
      out.write("\t<div region=\"center\" border=\"false\">\n");
      out.write("\t\t<div id=\"tt\" class=\"easyui-tabs\" fit=\"true\" border=\"false\"\n");
      out.write("\t\t\tplain=\"true\">\n");
      out.write("\t\t\t<div title=\"欢迎\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
