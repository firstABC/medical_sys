<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
   		function toeditUser(){
   			var option = {
   		    		url:'<%=basePath%>/uesr/editUser.abc',
   		    		type :"post",
   		    		dataType:'json',
   		    		headers:{"ClientCallMode" : "ajax"}, 
   		    		success : function(data) {
   		    			if(data.status == '-1'){
   							alert(data.message);
   						}else{
   							alert(data.message);
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
									<li><a href="javascript:;">修改用户信息</a></li>
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
							<div class="panel panel-title">修改用户信息</div>
							<div class="panel-body">
								<div class="content-user">
									<form class="form-horizontal openForm" id="addUserForm" name="addUserForm">
										<div class="col-sm-12">
											<div class="form-group">
												<input type="text" class="form-control" placeholder="" name="userId" style="display:none" id="userId" value="${user.userid }">
												<label for="" class="col-sm-3 control-label">用户名</label>
												<div class="col-sm-9">
													<input type="text" class="form-control" placeholder="" name="userAccount" disabled="disabled" id="userAccount" value="${user.useraccount }">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-3 control-label" id="uiIdcardNumber">密码</label>
												<div class="col-sm-9">
													<input type="password" class="form-control" name="userPwd" id="userPwd" value="" placeholder="">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-3 control-label" id="uiIdcardNumber">用户状态</label>
												<div class="col-sm-8">
													<select class="form-control" name="status">
														<option value="A" <c:if test="${user.status=='A' }">selected="selected"</c:if>>正常</option>
														<option value="B" <c:if test="${user.status=='B' }">selected="selected"</c:if>>冻结</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-3 control-label">拥有角色</label>
												<div class="col-sm-9">
												<c:forEach items="${ltRole}" var="it" varStatus="idx">
													<div class="checkbox checkbox-info col-sm-4">
								                        <input id="checkbox${idx.index+1 }" name="role" class="styled" type="checkbox" value="${it.roleid }" <c:if test="${fn:contains(ltrid,it.roleid)}">checked="checked"</c:if>>
								                        <label for="checkbox${idx.index+1 }">${it.rolenmae }</label>
								                    </div>
												</c:forEach>
												</div>
											</div>
										</div>

										<div class="col-sm-12 text-center btnOpen">
											<button type="button" class="btn btn-info" onclick="toeditUser();">修改</button>
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