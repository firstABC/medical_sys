<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

	<link href="<%=basePath%>/css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="<%=basePath%>/js/jquery-1.10.2.min.js"></script>
   	<script src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
   	<script src="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.js"></script>
   	<script src="<%=basePath%>/js/jquery.form.js"></script>
   	<script type="text/javascript">
   	function toSearchInfo() {
			var option = {
		    		url:'<%=basePath%>/ic/search.abc',
		    		type :"post",
		    		dataType:'json',
		    		headers:{"ClientCallMode" : "ajax"}, 
		    		success : function(data) {
		    			if(data.status == '-2'){
							alert(data.message);
							$("#icbalance").val("");
							$("#paName").val("");
						}else{
							//将数据填充到标签里
							$("#icbalance").val(data.data.icbalance);
							$("#paName").val(data.data.paname);
						}
		            },
		         };
		   	 	$("#reChargeForm").ajaxSubmit(option);
		   	 	return false;
	}
   	
   	function toReCharge() {
		var option = {
	    		url:'<%=basePath%>/ic/search.abc',
	    		type :"post",
	    		dataType:'json',
	    		headers:{"ClientCallMode" : "ajax"}, 
	    		success : function(data) {
	    			if(data.status == '-2'){
						alert(data.message);
						$("#icbalance").val("");
						$("#paName").val("");
					}else{
						//将数据填充到标签里
						$("#icbalance").val(data.data.icbalance);
						$("#paName").val(data.data.paname);
					}
	            },
	         };
	   	 	$("#reChargeForm").ajaxSubmit(option);
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
									<li><a href="javascript:;">医疗卡</a></li>|
									<li><a href="javascript:;">医疗卡充值</a></li>
								</ul>
							</div>
							<jsp:include page="currentUser.jsp"></jsp:include>
							<div class="clearfix"></div>
						</div>
						
					</div>
					<div class="clearfix"></div>
				</div>
				<!-- content -->
				<div class="content">
					<div class="monthly-grid">
						<div class="panel-widget">
							<div class="panel panel-title">医疗卡充值</div>
							<div class="panel-body">
								<div class="content-user">
									<form class="form-horizontal closeForm" id="reChargeForm" name="reChargeForm">
										<div class="col-sm-12">
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">卡号<span class="text-muted">*</span></label>
												<div class="col-sm-4">
													<input type="tel" class="form-control" placeholder="" name="num" onchange="toSearchInfo();" data-bv-trigger="blur" data-bv-message="卡号不能为空" required data-bv-notempty-message="卡号不能为空">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">姓名</label>
												<div class="col-sm-4">
													<input type="text" class="form-control" placeholder="" id="paName" name="paName">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">余额</label>
												<div class="col-sm-4">
													<div class=" input-group">
								 						<input type="tel" class="form-control" id="icBalance" name="icBalance">
														<span class="input-group-addon">元</span>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">充值数额</label>
												<div class="col-sm-4">
													<div class=" input-group">
														<input type="tel" class="form-control" id="trMoney" name="trMoney ">
														<span class="input-group-addon">元</span>
													</div>
												</div>
											</div>
										</div>

										<div class="col-sm-12 text-center btnOpen">
											<button type="button" class="btn btn-info" id="sureBtn" onclick="toRecharge();">确认充值</button>
											<button type="button" class="btn btn-default" id="closeBtn">取消</button>
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