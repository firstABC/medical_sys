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
									<li><a href="javascript:;">首页</a></li>
								</ul>
							</div>
							<jsp:include page="currentUser.jsp" flush="true"></jsp:include>
							<div class="clearfix"></div>
						</div>
						
					</div>
					<div class="clearfix"></div>
				</div>
				<!-- content -->
				<div class="content"></div>
			</div>
		</div> 

		<!--/sidebar-menu-->
		<jsp:include page="menu.jsp" flush="true"></jsp:include>
	  	<div class="clearfix"></div>	
	</div>

	<!-- demo -->
   	<script type="text/javascript" src='${pageContext.request.contextPath}/js/js.js'></script>
</body>
</html>