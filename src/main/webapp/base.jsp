<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String basePath = request.getContextPath();
	String  path= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+basePath;
	path="";
%>

<script type="text/javascript" src="<%=path%>/scripts/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/scripts/jquery.dropdown.js"></script>
<script type="text/javascript" src="<%=path%>/scripts/jquery.easing.js"></script>
<script type="text/javascript" src="<%=path%>/scripts/common.function.js"></script>
<script type="text/javascript" src="<%=path%>/scripts/general.function.js"></script>
<script type="text/javascript" src="<%=path%>/scripts/jcarousellite.js"></script>

<link rel="stylesheet" type="text/css" href="<%=path%>/css/common.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">