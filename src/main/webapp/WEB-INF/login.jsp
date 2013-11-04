<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<%@ include file="/baseAdmin.jsp"%>
<script type="text/javascript">
$(function(){
// 登陆
$('#login_but').bind('click', function(){
	var message = '';
	// 校验
	if($('#userdm').val() == ''){
		message = 'username  ';
	}
	if($('#dataUserPassword').val() == ''){
		message += 'password  ';
	}
	
	if(message != ''){
		message += 'is empty!';
		$.messager.show({
			title:'Tips',
			msg: message,
			showType:'slide',
			style:{
				right:'',
				top:document.body.scrollTop+document.documentElement.scrollTop,
				bottom:''
			}
		});
		return;
	}
	
	$('#loginFormMain').submit();
});

// 登陆
$('#loginFormMain').form({
    url:"<%=path%>/login",

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
<body id="public" class="login ">

	<!-- HEADER -->
	<div id="header">
		<div class="nav_wrapper">
			<div class="nav_container">
				<ul class="nav">
					<li class="back"><a href="<%=path%>" title="Apextom.com">Apextom.com
							<span class="arr">→</span>
					</a></li>
				</ul>
			</div>
		</div>
		<div id="hero-container">
			<div id="hero" class="pad">
				<h1>Log In</h1>
			</div>
		</div>
	</div>

	<!-- WRAPPER -->
	<div id="wrapper">
		<div id="shell" class="container">
			<div id="content" class="pad">

				<form action="" id="loginFormMain" onsubmit="return false;"
					method="post">
					<p>
						<span class="field big"><input id="userdm" type="text"
							name="userdm" tabindex="1" class="validate[email] titleinside"
							title="Username" value="Username"></span>
					</p>
					<p>
						<span class="field password big"> <input
							id="dataUserPassword" type="text" name="password" tabindex="2"
							class="validate[required] titleinside" title="Password" value="">
						</span>
					</p>
					<div id="form_submit">
						<input type="button" id="login_but" tabindex="4" value="Log In"
							class="submit link green rounded_5">
					</div>
				</form>

			</div>
		</div>
	</div>
	<!-- END WRAPPER -->

</body>
</html>