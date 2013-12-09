<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/baseAdmin.jsp"%>
<script src="<%=path%>/ckeditor/ckeditor.js"></script>
<script src="<%=path%>/ckeditor/adapters/jquery.js"></script>
<title>编辑</title>
<script  type="text/javascript">
$(function(){
	
	$('#classForm').form({
	    url:"<%=path%>/class/edit/classid/${classId}",

		success : function(data) {
			var data = eval('(' + data + ')');
			var message = 'success！';
			//alert(data.resStatus);
			if (data.resStatus != 'SUCCESS') {
				message = 'failed：[error code:' + data.errCode
					+ ']' + data.errMess;
				$.messager.show({
					title : 'Login Message',
					msg : message,
					showType : 'slide',
					style : {
						right : '',
						top : document.body.scrollTop
							+ document.documentElement.scrollTop,
						bottom : ''
					}
				});
			}else{
				window.location = '<%=path%>/main';
			}
		}
	});
	
});
</script>
</head>
<body style="font-size: 13px">

<div>
    <br/>
	 当前课程 ：${class.name}
	 <br/>
</div>
<form action="" id="classForm" onsubmit="return false;" method="post">
<div style="width: 95%;height: 80%;padding-top: 20px">
	<textarea name="content" style="height: 100%;width: 80%" rows="10" cols="20">${class.content}</textarea>
	<br/>
	<font color="red">注：以上内容为课程简介（首页展示内容）</font>
</div>
<div style="width: 95%;height: 80%;padding-top: 20px">
	<textarea class="ckeditor" name="htmlStr" style="height: 100%;width: 100%"></textarea>
	<br/>
	<font color="red">注：以上内容为课程课程详细介绍，图片请使用网络URL</font>
</div>
<div>
	<br/>
	<br/>
	<a id="preview" href="#" class="easyui-linkbutton">预览</a>
	<a id="save" href="#" class="easyui-linkbutton">保存</a>
</div>
</form>
</body>
</html>