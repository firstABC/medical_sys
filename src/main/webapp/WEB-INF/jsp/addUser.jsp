<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"  %>
<%@page import="com.entity.Role" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE HTML>
<html>
<head>
	<title>医疗系统</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<link href="<%=basePath%>/bootstrap/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
	<link href="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.css" rel='stylesheet' type='text/css' />
	<link href="<%=basePath%>/css/font-awesome.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/build.css">

	<link href="<%=basePath%>/css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="<%=basePath%>/js/jquery-1.10.2.min.js"></script>
   	<script src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
   	<script src="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.js"></script>
   	<script src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
   	<script type="text/javascript">
   		function toAddUser(){
   			var option = {
   		    		url:'<%=basePath%>/uesr/createUser.abc',
   		    		type :"post",
   		    		dataType:'json',
   		    		headers:{"ClientCallMode" : "ajax"}, 
   		    		success : function(data) {
   		    			if(data.status == '-1'){
   							alert(data.message);
   						}else{
   							alert(data.message);
   							window.location.href="<%=basePath%>/switch/user.abc";
   						}
   		            },
   		         };
   		   	 	$("#addUserForm").ajaxSubmit(option);
   		   	 	return false;
   		}
   	</script>

</head> 
<body>
   	<div class="page-container">
   		<!-- inner-content -->
		<div class="left-content">
			<div class="inner-content">
				<!-- top_bg -->
				<div class="header-section">
					<div class="top_bg">
						<div class="header_top">
							<div class="top_right">
								<ul>
									<li><a href="javascript:;">当前位置</a></li>|
									<li><a href="javascript:;">新增用户</a></li>
								</ul>
							</div>
							<jsp:include page="currentUser.jsp" flush="true"></jsp:include>
						</div>
						
					</div>
					<div class="clearfix"></div>
				</div>
				<!-- content -->
				<div class="content">
					<div class="monthly-grid">
						<div class="panel-widget">
							<div class="panel panel-title">新增用户</div>
							<div class="panel-body">
								<div class="content-user">
									<form class="form-horizontal openForm" id="addUserForm" name="addUserForm">
										<div class="col-sm-12">
											<div class="form-group">
												<label for="" class="col-sm-3 control-label">用户名</label>
												<div class="col-sm-9">
													<input type="text" class="form-control" placeholder="" name="userAccount" id="userAccount">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-3 control-label" id="uiIdcardNumber">密码</label>
												<div class="col-sm-9">
													<input type="password" class="form-control" name="userPwd" id="userPwd" value="" placeholder="">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-3 control-label" id="uiIdcardNumber">确认密码</label>
												<div class="col-sm-9">
													<input type="password" class="form-control" name="userPwdAffirm" id="userPwdAffirm" value="" placeholder="">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-3 control-label">拥有角色</label>
												<div class="col-sm-9">
												<%
													List<Role> ltRole = (List<Role>)request.getAttribute("ltRole");
														if(ltRole!=null){
															int i =0;
															for(Role role:ltRole){
																i++;
																
												%>
													<div class="checkbox checkbox-info col-sm-4">
								                        <input id="checkbox<%=i %>" name="role" class="styled" type="checkbox" value="<%=role.getRoleid()%>">
								                        <label for="checkbox<%=i %>"><%=role.getRolenmae() %></label>
								                    </div>
												<%
															}
														}
												%>
												</div>
											</div>
										</div>

										<div class="col-sm-12 text-center btnOpen">
											<button type="button" class="btn btn-info" onclick="toAddUser();">创建</button>
											<button type="button" class="btn btn-default">重置</button>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div> 

		<!--/sidebar-menu-->
		<jsp:include page="menu.jsp" flush="true"></jsp:include>
	  	<div class="clearfix"></div>	

	</div>


	<!-- demo -->
   	<script type="text/javascript" src='<%=basePath%>/js/js.js'></script>

</body>
</html>