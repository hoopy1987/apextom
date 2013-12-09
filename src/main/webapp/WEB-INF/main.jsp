<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Apextom</title>
<%@ include file="/baseAdmin.jsp"%> 
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
}
.STYLE2 {color: #064684}
a{TEXT-DECORATION:none}
-->
</style>
<script type="text/javascript">
// tabs
$(function(){
	$('#tt').tabs({
		onLoad:function(panel){
			var plugin = panel.panel('options').title;
			panel.find('textarea[name="code-'+plugin+'"]').each(function(){
				var data = $(this).val();
				data = data.replace(/(\r\n|\r|\n)/g, '\n');
				if (data.indexOf('\t') == 0){
					data = data.replace(/^\t/, '');
					data = data.replace(/\n\t/g, '\n');
				}
				data = data.replace(/\t/g, '    ');
				var pre = $('<pre name="code" class="prettyprint linenums"></pre>').insertAfter(this);
				pre.text(data);
				$(this).remove();
			});
			//prettyPrint();
		}
	});
	
	$('#tree').tree({
		onClick: function(node){
			//alert(node.text);  // alert node text property when clicked
			//alert(node.text + node.attributes.url);
			
			if(node.attributes.url != ""){
				var id = node.id;
				var ptype = node.attributes.ptype;
				
				alert(node.attributes.url);
				
				var url = '<%=path%>/' + node.attributes.url;
				
				open1(node.text,url);
			}
		}
	});
});

// open
function open1(plugin,url){
	var url='<iframe scrolling="yes" frameborder="0"  src='+url+' style="width:100%;height:100%;"></iframe>'
	if ($('#tt').tabs('exists',plugin)){
		$('#tt').tabs('select', plugin);
	} else {
		$('#tt').tabs('add',{
			title:plugin,
			content: url,
			closable:true
			/* extractor:function(data){
				data = $.fn.panel.defaults.extractor(data);
				var tmp = $('<div></div>').html(data);
				data = tmp.find('#content').html();
				tmp.remove();
				return data;
			} */

		});
	}
}
</script>
<script type="text/JavaScript">
<!--
function MM_swapImgRestore() { //v3.0
  	var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  	var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  	var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  	if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  	for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  	if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  	var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   	if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

function openrili(){
	window.showModalDialog("<%=path%>/public/rili.htm",window,"dialogWidth:600px;status:no;dialogHeight:500px");
}

function goquest(){
	$.messager.confirm('提示', '您确定要退出系统吗?', function(r){
        if (r){
        	$.ajax({ 
        		url: '<%=path%>/logout', 
        		success: function(){
                	window.location = "<%=path%>";
            	}
        	});
        }
    });

}
//-->
</script>
</head>
<body class="easyui-layout" style="text-align:left">
	
	<!-- 标题区域 -->
	<div region="north" border="false" text-align: center">

		<div id="header-inner">
			<table cellpadding="0" cellspacing="0" style="width: 100%;">
				<tr>
					<td style="height: 52px;">
						<div style="color: #fff; font-size: 22px; font-weight: bold;">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="46%" valign="top">
										<table width="100%" border="0" cellspacing="0" cellpadding="0"
											background="img/backggroup1.gif">
											<tr>

												<td width="499">
													<img src="img/bt.jpg" width="499" height="69" />
												</td>
											</tr>
										</table>
										<table width="100%" height="29" border="0" cellpadding="0"
											cellspacing="0" background="img/bg_3.gif">
											<tr>
												<td valign="bottom"><table width="390" height="27"
														border="0" cellpadding="0" cellspacing="0">
														<tr>

														</tr>
													</table></td>
											</tr>
										</table>
									</td>
									<td width="54%" valign="top" bgcolor="#a8d7ea">
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td height="26" background=""><table width="100%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td align="center" background="img/top_bg1.gif"><span
																class="STYLE2"> 【${USERINFO.username}】</span></td>
															<td width="48"><img src="img/jiao.gif" width="48"
																height="26" /></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td valign="top"><table width="100%" height="72"
														border="0" cellpadding="0" cellspacing="0">
														<tr>
															<td background="img/bg_4.gif">&nbsp;</td>
															<td width="73"><img src="img/dh_0.gif" width="73"
																height="72" /></td>
															<td width="360" valign="top" background="img/bg_5.gif"><table
																	width="100%" border="0" cellspacing="0" cellpadding="0">
																	<tr>
																		<td><a href="javascript:openrili()" title='打开日历'
																			onmouseout="MM_swapImgRestore()"
																			onmouseover="MM_swapImage('Image9','','img/index1_03.gif',1)"><img
																				src="img/index2_03.gif" name="Image9" width="72"
																				height="72" border="0" id="Image9" /></a></td>
																		<td><a
																			href="javascript:openwin('\modifypassword.jsp');"
																			title='设置' onmouseout="MM_swapImgRestore()"
																			onmouseover="MM_swapImage('Image10','','img/index1_04.gif',1)"><img
																				src="img/index2_04.gif" name="Image10" width="55"
																				height="72" border="0" id="Image10" /></a></td>
																		<td><a href="javascript:goquest()" title='退出系统'
																			onmouseout="MM_swapImgRestore()"
																			onmouseover="MM_swapImage('Image13','','img/index1_07.gif',1)"><img
																				src="img/index2_07.gif" name="Image13" width="66"
																				height="72" border="0" id="Image13" /></a></td>
																		<td width="66"></td>
																		<td width="66"></td>
																	</tr>
																</table></td>
														</tr>
													</table></td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</div>
	
	<!-- 菜单区域 -->
	<div region="west" border="false" split="true" title="系统功能"
		style="width: 250px; padding: 5px;">


		<ul id="tree" class="easyui-tree" data-options="url:'<%=path%>/menu'">
			

		</ul>
	</div>
	
	<!-- 内容区域 -->
	<div region="center" border="false">
		<div id="tt" class="easyui-tabs" fit="true" border="false"
			plain="true">
			<div title="欢迎"></div>
		</div>
	</div>

</body>
</html>