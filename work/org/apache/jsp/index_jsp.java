package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/base.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>南京艾派克斯TOM工作室 APEXTOM-WORKSHOP</title>\r\n");
      out.write('\n');

String basePath = request.getContextPath();
String  path= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+basePath;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/scripts/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/scripts/jquery.dropdown.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/scripts/jquery.easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/scripts/common.function.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/scripts/general.function.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/scripts/jcarousellite.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/common.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/style.css\">");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("<meta content=\"南京艾派克斯\" name=\"keywords\">\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"APEX,TOM,APEXTOM,WORKSHOP,南京艾派克斯,教育,遥遥领先行业对手!\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.print(path);
      out.write("/img/apextom.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("<base href=\"");
      out.print(path);
      out.write("\" target=\"_self\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tjQuery(document).ready(function() {\r\n");
      out.write("\t\tjQuery(\"#news_player\").jCarouselLite({\r\n");
      out.write("\t\t\tbtnNext : \"#news_prev\",\r\n");
      out.write("\t\t\tbtnPrev : \"#news_next\",\r\n");
      out.write("\t\t\tmouseWheel : false,\r\n");
      out.write("\t\t\tvisible : 2,\r\n");
      out.write("\t\t\tscroll : 1,\r\n");
      out.write("\t\t\tauto : 0,\r\n");
      out.write("\t\t\tvertical : true,\r\n");
      out.write("\t\t\tspeed : 1000\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tvar old_cur = parseInt(\"1\");\r\n");
      out.write("\tvar cur = old_cur;\r\n");
      out.write("\tjQuery(document).ready(function() {\r\n");
      out.write("\t\tif (old_cur > 0) {\r\n");
      out.write("\t\t\tjQuery('#smoth_block').css({\r\n");
      out.write("\t\t\t\tleft : jQuery('#nav a[top=' + old_cur + ']').offset().left,\r\n");
      out.write("\t\t\t\ttop : 163\r\n");
      out.write("\t\t\t}).show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tjQuery('#nav a').hover(function(event) {//hover\r\n");
      out.write("\t\t\tif (jQuery(this).attr('top') != cur) {\r\n");
      out.write("\t\t\t\tjQuery('#smoth_block').stop();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar left = jQuery(this).offset().left;\r\n");
      out.write("\t\t\t\tvar top = jQuery(this).offset().top;\r\n");
      out.write("\t\t\t\tcur = jQuery(this).attr('top');\r\n");
      out.write("\t\t\t\tjQuery('#smoth_block').animate({\r\n");
      out.write("\t\t\t\t\tleft : left,\r\n");
      out.write("\t\t\t\t\ttop : top\r\n");
      out.write("\t\t\t\t}, 500, 'backout').show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tjQuery('.content_top').mouseover(function() {\r\n");
      out.write("\t\t\tif (old_cur > 0) {\r\n");
      out.write("\t\t\t\tjQuery('#smoth_block').stop();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar left = jQuery('#nav a[top=' + old_cur + ']').offset().left;\r\n");
      out.write("\t\t\t\tvar top = jQuery('#nav a[top=' + old_cur + ']').offset().top;\r\n");
      out.write("\t\t\t\tcur = old_cur;\r\n");
      out.write("\t\t\t\tjQuery('#smoth_block').animate({\r\n");
      out.write("\t\t\t\t\tleft : left,\r\n");
      out.write("\t\t\t\t\ttop : top\r\n");
      out.write("\t\t\t\t}, 500, 'backout').show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//Gray\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"all\">\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(document)\r\n");
      out.write("\t\t\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\tjQuery('.dropdown_contact')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.mouseover(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tjQuery(this)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.setDropDown(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tjQuery('.dropdown_contact_sub'));\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\tjQuery(\"#fxbtn\").mouseover(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tjQuery('.cate_1').mouseover(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tjQuery('.cate_1').show();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}).mouseout(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tjQuery('.cate_1').hide();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\tjQuery('.cate_1').show();\r\n");
      out.write("\t\t\t\t\t\t\t\t}).mouseout(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tjQuery('.cate_1').hide();\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tvar js = new JsLoader();\r\n");
      out.write("\t\t\t\t\t\t\t\tjs.load('http://v2.jiathis.com/code/jia.js');\r\n");
      out.write("\t\t\t\t\t\t\t\tjs.onsuccess = function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//jQuery('#ckepop').show() ;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\tjs.onfailure = function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//jQuery('#ckepop').hide() ;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t//客服\r\n");
      out.write("\t\t\t\t\t\t\t\tjQuery(\".kf_info\").css('width', '0')\r\n");
      out.write("\t\t\t\t\t\t\t\tjQuery(\".kf_btn\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.mouseover(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (jQuery(\".kf_info\").css(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'width') == '0px') {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tjQuery(\".kf_info\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.animate({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 175\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}, \"slow\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tjQuery('.kf_btn img')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr('src',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'");
      out.print(path);
      out.write("/img/kf_btn01.png')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tjQuery('.kf_info')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.mouseleave(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (jQuery(\".kf_info\").css(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'width') == '175px') {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tjQuery(\".kf_info\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.animate({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}, \"slow\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tjQuery('.kf_btn img')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr('src','");
      out.print(path);
      out.write("/img/kf_btn02.png')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tstyle=\"position: absolute; width: 122px; height: 54px; background-image: url(");
      out.print(path);
      out.write("/img/index12.gif); z-index: 0; left: 1127px; top: 163px; background-position: initial initial; background-repeat: no-repeat no-repeat;\"\r\n");
      out.write("\t\t\tid=\"smoth_block\"></div>\r\n");
      out.write("\t\t<div class=\"header\" id=\"nav_header\" style=\"position: relative;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- JiaThis Button BEGIN -->\r\n");
      out.write("\t\t\t<div id=\"ckepop\" class=\"cate_1\" parentvalue=\"1\"\r\n");
      out.write("\t\t\t\tstyle=\"position: absolute; right: -23px; top: 50px; background-image: url(");
      out.print(path);
      out.write("/img/fx_bj.png); width: 112px; height: 20px; padding-left: 60px; padding-top: 15px; display: none;\">\r\n");
      out.write("\t\t\t\t<a class=\"jiathis_button_qzone\" title=\"分享到QQ空间\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"jiathis_txt jtico jtico_qzone\"></span></a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"jiathis_button_tsina\" title=\"分享到新浪微博\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"jiathis_txt jtico jtico_tsina\"></span></a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"jiathis_button_tqq\" title=\"分享到腾讯微博\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"jiathis_txt jtico jtico_tqq\"></span></a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"jiathis_button_renren\" title=\"分享到人人网\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"jiathis_txt jtico jtico_renren\"></span></a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"jiathis_button_taobao\" title=\"分享到淘江湖\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"jiathis_txt jtico jtico_taobao\"></span></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- JiaThis Button END -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(path);
      out.write("\"><img src=\"");
      out.print(path);
      out.write("/img/logo.png\" border=\"0\"\r\n");
      out.write("\t\t\t\t\twidth=\"120px\" height=\"120px\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"contact\">\r\n");
      out.write("\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(path);
      out.write("/img/tel.gif\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\t\t\t\t<!-- WPA Button Begin -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- WPA Button END -->\r\n");
      out.write("\t\t\t\t<a id=\"fxbtn\" href=\"javascript:\"><img src=\"");
      out.print(path);
      out.write("/img/fx.gif\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border: none;\" alt=\"分享\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-top: 20px; padding-right: 10px; padding-left: 300px; display: none\">\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown_contact\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"contact_us.html\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #fff; text-decoration: none;\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.print(path);
      out.write("/img/dropdown.png\" hspace=\"5\" border=\"0\">联系</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown_contact_sub\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"contact_us.html?type=taiyuan\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"color: #fff; text-decoration: none;\">联系</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"all_link\" id=\"nav\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(path);
      out.write("\" style=\"margin-left: 70px; _margin-left: 30px;\"\r\n");
      out.write("\t\t\t\t\ttop=\"1\">首页<br> <font>Home</font></a> <a href=\"news.html\"\r\n");
      out.write("\t\t\t\t\ttop=\"2\">最新动态<br> <font>News</font></a> <a href=\"service.html\"\r\n");
      out.write("\t\t\t\t\ttop=\"3\">课程服务<br> <font>OurService</font></a> <a\r\n");
      out.write("\t\t\t\t\thref=\"service.html\" top=\"4\">资料下载<br> <font>DataDownload</font></a>\r\n");
      out.write("\t\t\t\t<a href=\"about_us.html\" top=\"5\">关于我们<br> <font>AboutUs</font></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tstyle=\"width: 100%; background: #000; position: absolute; left: 0px; top: 0px; z-index: 100000; display: none;\"\r\n");
      out.write("\t\t\tid=\"mask_loading\"></div>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tstyle=\"width: 100%; position: absolute; left: 0px; top: 0px; z-index: 100001; display: none; text-align: center; color: #fff;\"\r\n");
      out.write("\t\t\tid=\"text_loading\">正在加载数据...</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--客服-->\r\n");
      out.write("\t\t<div class=\"kf\">\r\n");
      out.write("\t\t\t<div class=\"kf_info\" style=\"width: 0px;\">\r\n");
      out.write("\t\t\t\t<div style=\"padding-left: 8px;\">\r\n");
      out.write("\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t<p class=\"context\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"tencent://message/?uin=&amp;Site=cherry&amp;Menu=yes\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>X老师</strong><br> Tel: xxx-xxxx-xxxx\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p class=\"kf_btn\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(path);
      out.write("/img/kf_btn02.png\" width=\"32\" height=\"194\">\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--客服-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"content_top\" style=\"height: 620px; padding-top: 20px;\">\r\n");
      out.write("\t\t\t<div class=\"index_flash\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(path);
      out.write("/img/homepage-image1.jpg\" style=\"border: none;\" alt=\"分享\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"leftlayout\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"sitetype\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a><img src=\"");
      out.print(path);
      out.write("/img/home_pic1.gif\" width=\"72\"\r\n");
      out.write("\t\t\t\t\t\t\tborder=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sitetype_text\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"index_title\"><a href=\"website_building_1.html\">TOEFL</a></span>\r\n");
      out.write("\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"website_building_1.html\">TOEFL是北美留学所需的必要考试之一！虽然其难度和SAT相比显得非常简单...</a>\r\n");
      out.write("\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sitetype\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a><img src=\"");
      out.print(path);
      out.write("/img/home_pic2.gif\" width=\"72\"\r\n");
      out.write("\t\t\t\t\t\t\tborder=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sitetype_text\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"index_title\"><a href=\"website_building_2.html\">SAT</a></span>\r\n");
      out.write("\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"website_building_2.html\">SAT，又被视为美国高考，其分数在学生的申请成绩中起了重要的作用。 随着现在中国学生对这门考试准备...</a>\r\n");
      out.write("\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sitetype\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a><img src=\"");
      out.print(path);
      out.write("/img/home_pic3.gif\" width=\"72\"\r\n");
      out.write("\t\t\t\t\t\t\tborder=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sitetype_text\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"index_title\"><a href=\"website_building_3.html\">AP</a></span>\r\n");
      out.write("\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"website_building_3.html\">AP是XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX...</a>\r\n");
      out.write("\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sitetype\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a><img src=\"");
      out.print(path);
      out.write("/img/home_pic4.gif\" width=\"72\"\r\n");
      out.write("\t\t\t\t\t\t\tborder=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sitetype_text\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"index_title\"><a href=\"website_building_4.html\">GRE</a></span>\r\n");
      out.write("\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"website_building_4.html\">GRE是XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX...</a>\r\n");
      out.write("\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"index_more\"><em><a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"website_building_4.html\">MORE</a></em></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"rightlayout\">\r\n");
      out.write("\t\t\t\t<div id=\"news_player\"\r\n");
      out.write("\t\t\t\t\tstyle=\"height: 242px; overflow: hidden; visibility: visible; position: relative; z-index: 2; left: 0px;\">\r\n");
      out.write("\t\t\t\t\t<ul\r\n");
      out.write("\t\t\t\t\t\tstyle=\"margin: 0px; padding: 0px; position: relative; list-style-type: none; z-index: 1; height: 1089px; top: -363px;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"detail_right_content\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"overflow: hidden; float: none; width: 290px; height: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"news_show_193.html\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"admin/uploads/s1337677657_814396.jpg\" width=\"92\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"72\" border=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"news_show_193.html\" class=\"greenone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-size: 13px;\" title=\"缤果创意搬家啦！\">搬家啦！</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t搬家啦！<br>发表时间：2013-10-30\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"detail_right_content\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"overflow: hidden; float: none; width: 290px; height: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"news_show_189.html\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"admin/uploads/s1330919821_23051.jpg\" width=\"92\" height=\"72\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"news_show_189.html\" class=\"greenone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-size: 13px;\" title=\"Fla-bingo已正式上线啦!\">Apex-Tom已正式上线啦!</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\tApex-Tom已正式上线啦!<br>发表时间：2012-03-28\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"detail_right_content\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"overflow: hidden; float: none; width: 290px; height: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"news_show_193.html\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"admin/uploads/s1337677657_814396.jpg\" width=\"92\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"72\" border=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"news_show_193.html\" class=\"greenone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-size: 13px;\" title=\"缤果创意搬家啦！\">搬家啦！</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t搬家啦！<br>发表时间：2013-10-30\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"detail_right_content\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"overflow: hidden; float: none; width: 290px; height: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"news_show_189.html\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"admin/uploads/s1330919821_23051.jpg\" width=\"92\" height=\"72\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"news_show_189.html\" class=\"greenone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-size: 13px;\" title=\"Fla-bingo已正式上线啦!\">Apex-Tom已正式上线啦!</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\tApex-Tom已正式上线啦!<br>发表时间：2012-03-28\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"detail_right_content\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"overflow: hidden; float: none; width: 290px; height: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"news_show_193.html\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"admin/uploads/s1337677657_814396.jpg\" width=\"92\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"72\" border=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"news_show_193.html\" class=\"greenone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-size: 13px;\" title=\"缤果创意搬家啦！\">搬家啦！</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t搬家啦！<br>发表时间：2013-10-30\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"detail_right_content\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"overflow: hidden; float: none; width: 290px; height: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"news_show_189.html\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"admin/uploads/s1330919821_23051.jpg\" width=\"92\" height=\"72\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=\"0\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"news_show_189.html\" class=\"greenone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-size: 13px;\" title=\"Fla-bingo已正式上线啦!\">Apex-Tom已正式上线啦!</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t\tApex-Tom已正式上线啦!<br>发表时间：2012-03-28\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"button\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:\" id=\"news_next\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.print(path);
      out.write("/img/gobotom.gif\" width=\"17\" height=\"17\"\r\n");
      out.write("\t\t\t\t\t\tborder=\"0\"></a> <a href=\"javascript:\" id=\"news_prev\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.print(path);
      out.write("/img/gotop.gif\" width=\"17\" height=\"17\" border=\"0\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"content_bot\"></div>\r\n");
      out.write("\t\t﻿ ﻿\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(path);
      out.write("\" style=\"margin-left: 200px; _margin-left: 100px;\"\r\n");
      out.write("\t\t\t\tclass=\"footermenu\">Home</a> <a href=\"");
      out.print(path);
      out.write("/blog\"\r\n");
      out.write("\t\t\t\tclass=\"footermenu\">Blog</a> <a href=\"contact_us.html\"\r\n");
      out.write("\t\t\t\tclass=\"footermenu\">ContactUS</a> <a href=\"sitemap.html\"\r\n");
      out.write("\t\t\t\tclass=\"footermenu\">SiteMap</a>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t地址：南京市玄武区珠江路5号华利国际大厦2307室(赛格数码广场后门电梯上) 联系电话：025-83364670<br>\r\n");
      out.write("\t\t\t\tCopyright<font style=\"font-family: Arial\">©</font>&nbsp;2013\r\n");
      out.write("\t\t\t\tApex-Tom Workshop.All rights reserved.<br> \r\n");
      out.write("\t\t\t\t苏ICP备 XXXXXXX号&nbsp;\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
