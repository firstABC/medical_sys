<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
	<title>医疗系统</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
	<link href="${pageContext.request.contextPath}/bootstrapValidator/bootstrapValidator.min.css" rel='stylesheet' type='text/css' />
	<link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/build.css">

	<link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
   	<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
   	<script src="${pageContext.request.contextPath}/bootstrapValidator/bootstrapValidator.min.js"></script>

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
									<li><a href="javascript:;">权限管理</a></li>|
									<li><a href="javascript:;">角色管理</a></li>
								</ul>
							</div>
							<jsp:include page="currentUser.jsp" flush="true"></jsp:include>
							<div class="clearfix"></div>
						</div>
						
					</div>
					<div class="clearfix"></div>
				</div>
				<!-- content -->
				<div class="content">
					<div class="monthly-grid">
						<div class="panel-widget">
							<div class="panel panel-title">角色管理</div>
							<div class="panel-body">
								<div class="roleTable">
									<table class="table">
										<thead>
											<tr>
												<th>角色</th>
												<th>拥有权限</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td><a href="javascript:;" class="selRole active">角色1</a></td>
												<td rowspan="7" class="roleList">
													<div class="checkbox checkbox-info">
								                        <input id="checkbox1" class="styled" type="checkbox">
								                        <label for="checkbox1">权限1</label>
								                    </div>
								                    <div class="checkbox checkbox-info">
								                        <input id="checkbox2" class="styled" type="checkbox">
								                        <label for="checkbox2">权限2</label>
								                    </div>
								                    <div class="checkbox checkbox-info">
								                        <input id="checkbox3" class="styled" type="checkbox">
								                        <label for="checkbox3">权限3</label>
								                    </div>
													<div class="checkbox checkbox-info">
								                        <input id="checkbox4" class="styled" type="checkbox">
								                        <label for="checkbox4">权限4</label>
								                    </div>
								                    <div class="checkbox checkbox-info">
								                        <input id="checkbox5" class="styled" type="checkbox">
								                        <label for="checkbox5">权限5</label>
								                    </div>
								                    <div class="checkbox checkbox-info">
								                        <input id="checkbox6" class="styled" type="checkbox">
								                        <label for="checkbox6">权限6</label>
								                    </div>												
								                 </td>
											</tr>
											<tr>
												<td><a href="javascript:;" class="selRole">角色2</a></td>
											</tr>
												<td><a href="javascript:;" class="selRole">角色3</a></td>
											</tr>
											<tr>
												<td><a href="javascript:;" class="selRole">角色4</a></td>
											</tr>
											<tr>
												<td><a href="javascript:;" class="selRole">角色5</a></td>
											</tr>
											<tr>
												<td><a href="javascript:;" class="selRole">角色6</a></td>
											</tr>
											<tr>
												<td><a href="javascript:;" class="selRole">角色7</a></td>
											</tr>
										</tbody>
									</table>
								</div>
								<button type="button" class="btn btn-info btn-sm fr">确定</button>
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
   	<script type="text/javascript" src='${pageContext.request.contextPath}/js/js.js'></script>

   	<script type="text/javascript">
   		$(function(){
   			$(".table td, .table th").addClass("text-center");

   			$('.selRole').click(function(){
   				if (!$(this).hasClass('active')) {
   					$('.selRole').removeClass('active');
	   				$(this).addClass('active');
	   				// $('.roleList').show();
   				}
   			})
   		})
   	</script>

</body>
</html>