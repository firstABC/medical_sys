<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
    <title>登录</title>
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0,viewport-fit=cover">
    <meta content="yes" name="apple-mobile-web-app-capable">
    <meta content="black" name="apple-mobile-web-app-status-bar-style">
    <meta name="format-detection" content="telephone=no">
	
    <link href="<%=basePath%>/bootstrap/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
    <link href="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.css" rel='stylesheet' type='text/css' />
    <link href="<%=basePath%>/css/font-awesome.css" rel="stylesheet">

    <link href="<%=basePath%>/css/style.css" rel='stylesheet' type='text/css' />
    
    <script src="<%=basePath%>/js/jquery-1.10.2.min.js"></script>
    <script src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
    <script src="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.js"></script>
    <script src="<%=basePath%>/js/jquery.form.js"></script>
    <script type="text/javascript">
	function toLogin(){
    	var option = {
    		url:'${pageContext.request.getContextPath()}/uesr/toLogin.abc',
    		type :"post",
    		dataType:'json',
    		headers:{"ClientCallMode" : "ajax"}, 
    		success : function(data) {
    			if(data.status == '-1'){
					alert(data.message);
				}else if(data.status == '-2'){
					alert(data.message);
				}else{
					window.location.href="${pageContext.request.contextPath}/switch/index.abc";
				}
            },
         };
   	 	$("#loginForm").ajaxSubmit(option);
   	 	return false;
  	}
    </script>

</head>
<body>
    <div class="container">
	    <div class="modal login">
	        <div class="modal-dialog login animated">
    		    <div class="modal-content">

                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">医药系统</h4>
                    </div>
        
                    <div class="modal-body">  
                        <div class="box content">
                            <div class="form loginBox">
                                <form method="post" action="" accept-charset="UTF-8" id="loginForm" name="loginForm">
                                   <!-- <select class="form-control">
                                        <option>角色1</option>
                                        <option>角色2</option>
                                        <option>角色3</option>
                                    </select> -->
                                    <input class="form-control" type="text" placeholder="用户名" name="userAccount" id="userAccount">
                                    <input class="form-control" type="password" placeholder="密码" name="userPwd" id="userPwd">
                                 <!--    <input class="form-control yz" type="text" placeholder="验证码" name=""><span class="code" id="idcode"></span> -->
                                    <input class="btn btn-default btn-login" type="button" value="登录" onclick="toLogin();">
                                </form>
                            </div>
                        </div>
                    </div>   

    		    </div>
		    </div>
	    </div>
    </div>

    <script type="text/javascript" src="<%=basePath%>/js/jquery.idcode.js"></script>
    <script>
        $.idcode.setCode();
    </script>

</body>
</html>
