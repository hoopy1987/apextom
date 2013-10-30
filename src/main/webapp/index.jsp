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

<base href="<%=path%>" target="_self">

<script type="text/javascript">
	var old_cur = parseInt("1");
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
																.attr('src','<%=path%>/img/kf_btn02.png')
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
				<a href="<%=path%>"><img src="<%=path%>/img/logo.png" border="0"
					width="120px" height="120px"></a>
			</div>

			<div class="contact">
				<!-- 
				<img src="<%=path%>/img/tel.gif">&nbsp;&nbsp;
				 -->
				<!-- WPA Button Begin -->

				<!-- WPA Button END -->
				<a id="fxbtn" href="javascript:"><img src="<%=path%>/img/fx.gif"
					style="border: none;" alt="分享"></a>

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
				<a href="<%=path%>" style="margin-left: 70px; _margin-left: 30px;"
					top="1">首页<br> <font>Home</font></a> <a href="news.html"
					top="2">最新动态<br> <font>News</font></a> <a href="service.html"
					top="3">课程服务<br> <font>OurService</font></a> <a
					href="service.html" top="4">资料下载<br> <font>DataDownload</font></a>
				<a href="about_us.html" top="5">关于我们<br> <font>AboutUs</font></a>
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
						<%-- 						<img src="<%=path%>/img/kf_phone.jpg" width="158" height="27"> --%>
					</h1>
					<p class="context">
						<a href="tencent://message/?uin=&amp;Site=cherry&amp;Menu=yes">
							<strong>X老师</strong><br> Tel: xxx-xxxx-xxxx
						</a>
					</p>
				</div>
			</div>
			<p class="kf_btn">
				<img src="<%=path%>/img/kf_btn02.png" width="32" height="194">
			</p>
		</div>
		<!--客服-->


		<div class="content_top" style="height: 620px; padding-top: 20px;">
			<div class="index_flash">
				<img src="<%=path%>/img/homepage-image1.jpg" style="border: none;" alt="分享">
			</div>
			
			<div class="leftlayout">

				<div class="sitetype">
					<div>
						<a><img src="admin/uploads/1269398230_831573.gif" width="72"
							border="0"></a>
					</div>
					<div class="sitetype_text">
						<span class="index_title"><a href="website_building_1.html">网站建设类型</a></span>
						<h4>
							<a href="website_building_1.html">宣传展示型网站 — 展示企业CI，提升企业整体形象
								活动应用型网站 — 华丽...</a>
						</h4>
						<span class="index_more"><em><a
								href="website_building_1.html">MORE</a></em></span>
					</div>
				</div>
				<div class="sitetype">
					<div>
						<a><img src="admin/uploads/1269398296_877624.gif" width="72"
							border="0"></a>
					</div>
					<div class="sitetype_text">
						<span class="index_title"><a href="website_building_2.html">网站优化|网站推广</a></span>
						<h4>
							<a href="website_building_2.html">网站优化/网站推广就是指如何让更多人知道你的网站,
								利用互联网进行宣传推广活动。 推广网站的形式多样...</a>
						</h4>
						<span class="index_more"><em><a
								href="website_building_2.html">MORE</a></em></span>
					</div>
				</div>
				<div class="sitetype">
					<div>
						<a><img src="admin/uploads/1269398351_90119.gif" width="72"
							border="0"></a>
					</div>
					<div class="sitetype_text">
						<span class="index_title"><a href="website_building_3.html">网站技术维护</a></span>
						<h4>
							<a href="website_building_3.html">缤果创意本着“一站式”服务的标准，不仅为您提供建站服务，并为您提供的专业高效...</a>
						</h4>
						<span class="index_more"><em><a
								href="website_building_3.html">MORE</a></em></span>
					</div>
				</div>
				<div class="sitetype">
					<div>
						<a><img src="admin/uploads/1269398374_684021.gif" width="72"
							border="0"></a>
					</div>
					<div class="sitetype_text">
						<span class="index_title"><a href="website_building_4.html">网站建设流程</a></span>
						<h4>
							<a href="website_building_4.html">客户提出网站建设申请 → 制定网站建设方案
								→签订网站相关协议 → 网...</a>
						</h4>
						<span class="index_more"><em><a
								href="website_building_4.html">MORE</a></em></span>
					</div>
				</div>

			</div>
			<div class="rightlayout">
				<div id="news_player"
					style="height: 242px; overflow: hidden; visibility: visible; position: relative; z-index: 2; left: 0px;">
					<ul
						style="margin: 0px; padding: 0px; position: relative; list-style-type: none; z-index: 1; height: 1089px; top: -363px;">
						<li class="detail_right_content"
							style="overflow: hidden; float: none; width: 290px; height: 100px;">
							<a href="news_show_191.html"><img
								src="admin/uploads/s1332469984_13648.gif" width="92" height="72"
								border="0"></a>
							<p>
								<a href="news_show_191.html" class="greenone"
									style="font-size: 13px;" title="缤果创意与上海德奈福洗染设备有限公司建立合作关系">缤果创意与上海德奈福洗染设备有限公司建立合作...</a><br>
								将为德奈福提供网站建设<br>发表时间：2012-03-20
							</p>
							<div style="clear: both;"></div>
						</li>
						<li class="detail_right_content"
							style="overflow: hidden; float: none; width: 290px; height: 100px;">
							<a href="news_show_190.html"><img
								src="admin/uploads/s1332231690_449040.gif" width="92"
								height="72" border="0"></a>
							<p>
								<a href="news_show_190.html" class="greenone"
									style="font-size: 13px;" title="缤果创意与上海贝汉建筑设计有限公司建立合作关系">缤果创意与上海贝汉建筑设计有限公司建立合作关...</a><br>
								将为贝汉建筑提供网站建设<br>发表时间：2012-03-19
							</p>
							<div style="clear: both;"></div>
						</li>
						<li class="detail_right_content"
							style="overflow: hidden; float: none; width: 290px; height: 100px;">
							<a href="news_show_193.html"><img
								src="admin/uploads/s1337677657_814396.jpg" width="92"
								height="72" border="0"></a>
							<p>
								<a href="news_show_193.html" class="greenone"
									style="font-size: 13px;" title="缤果创意搬家啦！">缤果创意搬家啦！</a><br>
								缤果创意搬家啦！<br>发表时间：2012-05-22
							</p>
							<div style="clear: both;"></div>
						</li>
						<li class="detail_right_content"
							style="overflow: hidden; float: none; width: 290px; height: 100px;">
							<a href="news_show_189.html"><img
								src="admin/uploads/s1330919821_23051.jpg" width="92" height="72"
								border="0"></a>
							<p>
								<a href="news_show_189.html" class="greenone"
									style="font-size: 13px;" title="Fla-bingo已正式上线啦!">Fla-bingo已正式上线啦!</a><br>
								Fla-bingo已正式上线啦!<br>发表时间：2012-03-28
							</p>
							<div style="clear: both;"></div>
						</li>
						<li class="detail_right_content"
							style="overflow: hidden; float: none; width: 290px; height: 100px;">
							<a href="news_show_192.html"><img
								src="admin/uploads/s1332470723_900187.gif" width="92"
								height="72" border="0"></a>
							<p>
								<a href="news_show_192.html" class="greenone"
									style="font-size: 13px;" title="缤果创意与纽斯凯威(加拿大)国际顾问有限公司建立合作关系">缤果创意与纽斯凯威(加拿大)国际顾问有限公司...</a><br>
								将为纽斯凯威提供网站建设<br>发表时间：2012-03-21
							</p>
							<div style="clear: both;"></div>
						</li>
						<li class="detail_right_content"
							style="overflow: hidden; float: none; width: 290px; height: 100px;">
							<a href="news_show_191.html"><img
								src="admin/uploads/s1332469984_13648.gif" width="92" height="72"
								border="0"></a>
							<p>
								<a href="news_show_191.html" class="greenone"
									style="font-size: 13px;" title="缤果创意与上海德奈福洗染设备有限公司建立合作关系">缤果创意与上海德奈福洗染设备有限公司建立合作...</a><br>
								将为德奈福提供网站建设<br>发表时间：2012-03-20
							</p>
							<div style="clear: both;"></div>
						</li>
						<li class="detail_right_content"
							style="overflow: hidden; float: none; width: 290px; height: 100px;">
							<a href="news_show_190.html"><img
								src="admin/uploads/s1332231690_449040.gif" width="92"
								height="72" border="0"></a>
							<p>
								<a href="news_show_190.html" class="greenone"
									style="font-size: 13px;" title="缤果创意与上海贝汉建筑设计有限公司建立合作关系">缤果创意与上海贝汉建筑设计有限公司建立合作关...</a><br>
								将为贝汉建筑提供网站建设<br>发表时间：2012-03-19
							</p>
							<div style="clear: both;"></div>
						</li>
						<li class="detail_right_content"
							style="overflow: hidden; float: none; width: 290px; height: 100px;">
							<a href="news_show_193.html"><img
								src="admin/uploads/s1337677657_814396.jpg" width="92"
								height="72" border="0"></a>
							<p>
								<a href="news_show_193.html" class="greenone"
									style="font-size: 13px;" title="缤果创意搬家啦！">缤果创意搬家啦！</a><br>
								缤果创意搬家啦！<br>发表时间：2012-05-22
							</p>
							<div style="clear: both;"></div>
						</li>
						<li class="detail_right_content"
							style="overflow: hidden; float: none; width: 290px; height: 100px;">
							<a href="news_show_189.html"><img
								src="admin/uploads/s1330919821_23051.jpg" width="92" height="72"
								border="0"></a>
							<p>
								<a href="news_show_189.html" class="greenone"
									style="font-size: 13px;" title="Fla-bingo已正式上线啦!">Fla-bingo已正式上线啦!</a><br>
								Fla-bingo已正式上线啦!<br>发表时间：2012-03-28
							</p>
							<div style="clear: both;"></div>
						</li>
					</ul>
				</div>
				<div class="button">
					<a href="javascript:" id="news_next"><img
						src="<%=path%>/img/gobotom.gif" width="17" height="17"
						border="0"></a> <a href="javascript:" id="news_prev"><img
						src="<%=path%>/img/gotop.gif" width="17" height="17" border="0"></a>
				</div>
				<div></div>
			</div>
		</div>
		<div class="content_bot"></div>
		﻿ ﻿
		<div class="footer">
			<a href="<%=path%>" style="margin-left: 200px; _margin-left: 100px;"
				class="footermenu">Home</a> <a href="<%=path%>/blog"
				class="footermenu">Blog</a> <a href="contact_us.html"
				class="footermenu">ContactUS</a> <a href="sitemap.html"
				class="footermenu">SiteMap</a>
			<div>
				地址：南京市玄武区珠江路5号华利国际大厦2307室(赛格数码广场后门电梯上) 联系电话：025-83364670<br>
				Copyright<font style="font-family: Arial">©</font>&nbsp;2013
				Apex-Tom Workshop.All rights reserved.<br> 
				苏ICP备 ???????号&nbsp;
			</div>
		</div>
	</div>


</body>
</html>