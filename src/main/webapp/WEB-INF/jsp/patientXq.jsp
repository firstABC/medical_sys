<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>医疗系统</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<link href="<%=basePath%>/bootstrap/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
	<link href="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.css" rel='stylesheet' type='text/css' />
	<link href="<%=basePath%>/css/font-awesome.css" rel="stylesheet">

	<link href="<%=basePath%>/css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="<%=basePath%>/js/jquery-1.10.2.min.js"></script>
   	<script src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
   	<script src="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.js"></script>

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
									<li><a href="patient.html">患者管理</a></li>|
									<li><a href="javascript:;">患者详情</a></li>
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
							<div class="panel panel-title">患者详情</div>
							<div class="panel-body">
								<div class="content-user">
									<form class="form-horizontal openForm">
										<div class="col-sm-6">
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">姓名</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" name="" value="${msgDTO.data.paname }" disabled="disabled" />
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">卡号</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="${msgDTO.data.iccardnum }" disabled="disabled">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">手机号</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" name="" value="${msgDTO.data.paphone }" disabled="disabled" />
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">婚姻</label>
												<div class="col-sm-8">
												<input type="text" class="form-control" value="${msgDTO.data.pamarriage == 'A'?'已婚':'未婚' }" disabled="disabled">
													<!-- <select class="form-control" disabled="disabled">
														<option>未婚</option>
														<option>已婚</option>
													</select> -->
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">卡余额</label>
												<div class="col-sm-8">
													<div class="input-group">
														<input type="tel" class="form-control" value="${msgDTO.data.icbalance }" disabled="disabled">
														<span class="input-group-addon">元</span>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">状态</label>
												<div class="col-sm-8">
												<input type="text" class="form-control" value="${msgDTO.data.isstatus == 'A'?'正常':msgDTO.data.isstatus == 'B'?'冻结':'销户' }" disabled="disabled">
													<!-- <select class="form-control" disabled="disabled">
														<option>正常</option>
														<option>冻结</option>
													</select> -->
												</div>
											</div>
										</div>

										<div class="col-sm-6">
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">性别</label>
												<div class="col-sm-8">
												<input type="text" class="form-control" value="${msgDTO.data.pasex == 'A'?'男':'女' }" disabled="disabled">
													<!-- <select class="form-control" disabled="disabled">
														<option>男</option>
														<option>女</option>
													</select> -->
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">身份证号</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" name="" value="${msgDTO.data.paidcard }" disabled="disabled">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">年龄</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="${msgDTO.data.paage }" disabled="disabled">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">住址</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" value="${msgDTO.data.paaddress }" disabled="disabled">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">开户人</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" value="${msgDTO.data.pacreator }" disabled="disabled">
												</div>
											</div>
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