<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>南京艾派克斯TOM工作室 APEXTOM-WORKSHOP</title>
<%@ include file="/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<meta content="南京艾派克斯" name="keywords">
<meta name="description"
	content="APEX,TOM,APEXTOM,WORKSHOP,南京艾派克斯,教育,遥遥领先行业对手!">

<link rel="shortcut icon" href="/img/apextom.ico" type="image/x-icon">

<base href="<%=path %>" target="_self">

<script type="text/javascript">
	var old_cur = parseInt("2");
	var cur = old_cur;
	jQuery(document).ready(function() {
		if (old_cur > 0) {
			jQuery('#smoth_block').css({
				left : jQuery('#nav a[top=' + old_cur + ']').offset().left,
				top : 163
			}).show();
		}
		jQuery('#nav a').hover(function(event) {//hover
			if (jQuery(this).attr('top') != cur) {
				jQuery('#smoth_block').stop();

				var left = jQuery(this).offset().left;
				var top = jQuery(this).offset().top;
				cur = jQuery(this).attr('top');
				jQuery('#smoth_block').animate({
					left : left,
					top : top
				}, 500, 'backout').show();
			}
		});
		jQuery('.content_top').mouseover(function() {
			if (old_cur > 0) {
				jQuery('#smoth_block').stop();

				var left = jQuery('#nav a[top=' + old_cur + ']').offset().left;
				var top = jQuery('#nav a[top=' + old_cur + ']').offset().top;
				cur = old_cur;
				jQuery('#smoth_block').animate({
					left : left,
					top : top
				}, 500, 'backout').show();
			}
		});

		//Gray
	});
</script>
</head>
<body>
	<div class="all">
		<script type="text/javascript">
			jQuery(document)
					.ready(
							function() {
								jQuery('.dropdown_contact')
										.mouseover(
												function() {
													jQuery(this)
															.setDropDown(
																	jQuery('.dropdown_contact_sub'));
												});
								jQuery("#fxbtn").mouseover(function() {
									jQuery('.cate_1').mouseover(function() {
										jQuery('.cate_1').show();
									}).mouseout(function() {
										jQuery('.cate_1').hide();
									});
									jQuery('.cate_1').show();
								}).mouseout(function() {
									jQuery('.cate_1').hide();
								});

								var js = new JsLoader();
								js.load('http://v2.jiathis.com/code/jia.js');
								js.onsuccess = function() {
									//jQuery('#ckepop').show() ;
								}
								js.onfailure = function() {
									//jQuery('#ckepop').hide() ;
								}

								//客服
								jQuery(".kf_info").css('width', '0')
								jQuery(".kf_btn")
										.mouseover(
												function() {
													if (jQuery(".kf_info").css(
															'width') == '0px') {
														jQuery(".kf_info")
																.animate({
																	width : 175
																}, "slow");
														jQuery('.kf_btn img')
																.attr('src',
																		'<%=path%>/img/kf_btn01.png')
													}
												});

								jQuery('.kf_info')
										.mouseleave(
												function() {
													if (jQuery(".kf_info").css(
															'width') == '175px') {
														jQuery(".kf_info")
																.animate({
																	width : 0
																}, "slow");
														jQuery('.kf_btn img')
																.attr('src',
																		'<%=path%>/img/kf_btn02.png')
													}
												})
							});
		</script>
		<div
			style="position: absolute; width: 122px; height: 54px; background-image: url(<%=path%>/img/index12.gif); z-index: 0; left: 1127px; top: 163px; background-position: initial initial; background-repeat: no-repeat no-repeat;"
			id="smoth_block"></div>
		<div class="header" id="nav_header" style="position: relative;">
		
			<!-- JiaThis Button BEGIN -->
			<div id="ckepop" class="cate_1" parentvalue="1"
				style="position: absolute; right: -23px; top: 50px; background-image: url(<%=path%>/img/fx_bj.png); width: 112px; height: 20px; padding-left: 60px; padding-top: 15px; display: none;">
				<a class="jiathis_button_qzone" title="分享到QQ空间"><span
					class="jiathis_txt jtico jtico_qzone"></span></a> <a
					class="jiathis_button_tsina" title="分享到新浪微博"><span
					class="jiathis_txt jtico jtico_tsina"></span></a> <a
					class="jiathis_button_tqq" title="分享到腾讯微博"><span
					class="jiathis_txt jtico jtico_tqq"></span></a> <a
					class="jiathis_button_renren" title="分享到人人网"><span
					class="jiathis_txt jtico jtico_renren"></span></a> <a
					class="jiathis_button_taobao" title="分享到淘江湖"><span
					class="jiathis_txt jtico jtico_taobao"></span></a>
			</div>
			<!-- JiaThis Button END -->
			
			<div class="logo">
				<a href="http://www.bingoidea.net"><img
					src="<%=path%>/img/logo.png" border="0"></a> <a
					href="http://apextom.com" target="_blank" class="outlin"><img
					src="<%=path%>/img/logo_btn.png" width="32" height="32"></a>
			</div>
			
			<div class="contact">
				<!-- 
				<img src="<%=path%>/img/tel.gif">&nbsp;&nbsp;
				 -->
				<!-- WPA Button Begin -->

				<!-- WPA Button END -->
				<a id="fxbtn" href="javascript:"><img
					src="<%=path%>/img/fx.gif" style="border: none;" alt="分享"></a>
				 
				<div
					style="margin-top: 20px; padding-right: 10px; padding-left: 300px; display: none">
					<div class="dropdown_contact">
						<a href="contact_us.html"
							style="color: #fff; text-decoration: none;"><img
							src="<%=path%>/img/dropdown.png" hspace="5" border="0">联系</a>
					</div>
					<div class="dropdown_contact_sub">
						<a href="contact_us.html?type=taiyuan"
							style="color: #fff; text-decoration: none;">联系</a>
					</div>
				</div>
				
			</div>

			<div class="all_link" id="nav">
				<a href="http://www.bingoidea.net"
					style="margin-left: 70px; _margin-left: 30px;" top="1">缤果首页<br><font>Home</font></a> 
				<a href="about_us.html" top="2">关于我们<br><font>AboutUs</font></a> 
				<a href="case.html" top="3">缤果案例<br><font>OurCase</font></a>
				<a href="service.html" top="4">缤果服务<br><font>OurService</font></a>
				<a href="contact_us.html" top="5">联系我们<br><font>ContactUs</font></a>
				
				<a href="#" top="6">联系我们<br><font>Flash</font></a>
			</div>
		</div>
		<div
			style="width: 100%; background: #000; position: absolute; left: 0px; top: 0px; z-index: 100000; display: none;"
			id="mask_loading"></div>
		<div
			style="width: 100%; position: absolute; left: 0px; top: 0px; z-index: 100001; display: none; text-align: center; color: #fff;"
			id="text_loading">正在加载数据...</div>

		<!--客服-->
		<div class="kf">
			<div class="kf_info" style="width: 0px;">
				<div style="padding-left: 8px;">
					<h1>
						<img src="<%=path%>/img/kf_phone.jpg" width="158" height="27">
					</h1>
					<p class="context">
						<a href="tencent://message/?uin=&amp;Site=cherry&amp;Menu=yes">
							<strong>Bingo.Jimmy</strong><br> Tel: 186-1682-7767
						</a>


					</p>
				</div>
			</div>
			<p class="kf_btn">
				<img src="<%=path%>/img/kf_btn02.png" width="32" height="194">
			</p>



		</div>
		<!--客服-->
		<div class="content_top">
			<div class="aboutus_left">
				<script type="text/javascript">
					var left = parseInt("2");
					jQuery(document)
							.ready(
									function() {
										jQuery('#left_nav a')
												.each(
														function() {
															if (jQuery(this)
																	.attr(
																			'left') == left) {
																jQuery(this)
																		.css(
																				'border-left',
																				'#99cc00 10px solid');
															}
														});
									});
				</script>
				<div id="left_nav">
					<a class="one" href="opinion.html" left="1"></a> <a class="two"
						href="about_us.html" left="2"
						style="border-left-color: rgb(153, 204, 0); border-left-width: 10px; border-left-style: solid;"></a>
					<a class="three" href="news_show.html" left="3"></a> <a
						class="four" href="join_us.html" left="4"></a>
				</div>
			</div>
			<div class="aboutus_right">
				<p class="picone">
					<span class="aboutus_font" style="color: #99cc00">&nbsp;&nbsp;&nbsp;“缤果创意”</span>隶属于上海<span
						class="aboutus_font" style="color: #99cc01">思壤信息技术</span>有限公司。
				</p>
				<p class="pictwo">
					<span class="aboutus_font" style="color: #ff8c00">&nbsp;&nbsp;&nbsp;“缤果创意”</span>BINGOIDEA专注于<a
						class="aboutus_font" style="color: #ff8c00">网站建设</a>，依靠专业网站建设技术致力于系统化解决您的企业品牌在互联网上的统一性传播。从<a
						class="aboutus_font" style="color: #ff8c00">网站咨询策划、界面设计、交互设计，线上营销策划到网站程序开发、网站视觉整合，</a>我们都提供适合您需求的一站式专业建站方案。
				</p>
				<p class="picthree">
					<span style="color: #0099cc">&nbsp;&nbsp;&nbsp;“缤果创意”</span>BINGOIDEA是（缤纷、果实、创意、智慧）的象征。“缤果创意”致力于成为在创意产业中囊括<a>平面设计、网站设计、网络推广、专业品牌设计等服务的专业互联网技术服务提供商。我们奉行</a><a
						class="aboutus_font" style="color: #0099cc">“<span
						style="color: #0099cc">设</span>计彰显品质,创意改变生活”
					</a>的宗旨，以准确的市场定位和客户的需求为目的，拥有着热情、细致、专注的高素质团队，更具魅力的是他们拥有非凡的创造力和无私的奉献精神。我们一直秉承国际化、品牌化的创作理念和规范专业的设计态度，创造力与专注度决定了我们能胜任一切挑战。
				</p>
				<p class="picfour">
					<a class="aboutus_font" style="color: #376092">&nbsp;&nbsp;&nbsp;“缤果创意”
					</a>是朝气蓬勃、积极创造的<a class="aboutus_font" style="color: #376092">风向</a>；<br>
					&nbsp;&nbsp;&nbsp;<a class="aboutus_font" style="color: #376092">“缤果创意”
					</a>将是专业化、规范化的<a class="aboutus_font" style="color: #376092">标尺</a>；<br>
					&nbsp;&nbsp;&nbsp;<a class="aboutus_font" style="color: #376092">“缤果创意”
					</a>会是互联网技术服务领域的<a class="aboutus_font" style="color: #376092">典范</a>。
				</p>
			</div>
			<div style="clear: both;" class="aboutusbj"></div>
		</div>
		<div class="content_bot"></div>
		﻿
		<div class="footer">
			<a href="http://www.bingoidea.net"
				style="margin-left: 200px; _margin-left: 100px;" class="footermenu">Home</a>
			<a href="http://www.bingoidea.net/blog" class="footermenu">Blog</a> <a
				href="contact_us.html" class="footermenu">ContactUS</a> <a
				href="sitemap.html" class="footermenu">SiteMap</a>
			<div>
				<div style="padding: 0px;">
					友情链接:&nbsp;<a href="http://www.bingoidea.net/" target="_blank"
						style="margin-right: 10px;">上海网站建设</a><a
						href="http://www.bingoidea.net/" target="_blank"
						style="margin-right: 10px;">网页设计</a><a
						href="http://www.bingoidea.net/" target="_blank"
						style="margin-right: 10px;">品牌网站设计</a><a
						href="http://www.bingoidea.net/" target="_blank"
						style="margin-right: 10px;">高端网站建设</a>
				</div>
				地址：上海市徐汇区石龙路345弄23-27号A座208 联系电话：+86-21-64681909<br> Copyright<font
					style="font-family: Arial">©</font>&nbsp;2009上海思壤信息技术有限公司 版权所有<br>
				<a href="http://www.miibeian.gov.cn" target="_blank"
					rel="”nofollow”">沪ICP备09089012号</a>&nbsp;
				<script type="text/javascript">
var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F7697c00db8641c0aa939f12b95728799' type='text/javascript'%3E%3C/script%3E"));
</script>
				<script
					src=" http://hm.baidu.com/h.js?7697c00db8641c0aa939f12b95728799"
					type="text/javascript"></script>
				<a
					href="http://www.sgs.gov.cn/lz/licenseLink.do?method=licenceView&amp;entyId=20120315163548399"><img
					src="<%=path%>/img/icon.gif" width="47" height="47" border="0"></a>
			</div>
		</div>
	</div>


</body>
</html>