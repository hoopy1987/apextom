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
</head>
<body>
<div>
	图片处理
</div>
<div style="width: 95%;height: 80%">
	<textarea class="ckeditor" name="editor1" style="height: 100%;width: 100%"></textarea>
</div>
</body>
</html>