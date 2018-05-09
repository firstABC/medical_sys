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
   	<!-- 打印 -->
   	<script type="text/javascript" src="<%=basePath%>/js/jQuery.print.js"></script>

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
									<li><a href="javascript:;">历史病历</a></li>|
									<li><a href="javascript:;">病历详情</a></li>
								</ul>
							</div>
							<div class="top_left">
								<h2>
									<a href="javascript:;">张三<span>主治医师</span></a>
									<a href="javascript:;">退出</a>
									<span class="current-time"></span>
								</h2>
							</div>
							<div class="clearfix"></div>
						</div>
						
					</div>
					<div class="clearfix"></div>
				</div>
				<!-- content -->
				<div class="content">
					<div class="monthly-grid">
						<div class="panel-widget">
							<div class="panel panel-title">病历详情</div>
							<div class="panel-body">
								<div class="tableBox">
									<c:if test="${msgDTO.total == 1}">
									<form class="form-horizontal dyForm">
										<div class="form-group col-sm-4">
											<label for="" class="col-sm-4 control-label">卡号</label>
											<div class="col-sm-8">
												<input type="tel" class="form-control" value="${msgDTO.data.iccardnum }" disabled="disabled">
											</div>
										</div>
										<div class="form-group col-sm-4">
											<label for="" class="col-sm-4 control-label">姓名</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" value="${msgDTO.data.paname }" disabled="disabled">
											</div>
										</div>
										<div class="form-group col-sm-4">
											<label for="" class="col-sm-4 control-label">年龄</label>
											<div class="col-sm-8">
												<input type="tel" class="form-control" value="${msgDTO.data.paage }" disabled="disabled">
											</div>
										</div>
										<div class="col-sm-12">
											<div class="form-group">
												<label for="" class="col-sm-2 control-label">主述</label>
												<div class="col-sm-9">
													<textarea class="form-control" disabled="disabled">${msgDTO.data.selfReported }</textarea>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-2 control-label">现病史</label>
												<div class="col-sm-9">
													<textarea class="form-control" disabled="disabled">${msgDTO.data.nowMedicalRecord }</textarea>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-2 control-label">诊断</label>
												<div class="col-sm-9">
													<textarea class="form-control" disabled="disabled">${msgDTO.data.diagnosis }</textarea>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-2 control-label">备注</label>
												<div class="col-sm-9">
													<textarea class="form-control" disabled="disabled">${msgDTO.data.remark }</textarea>
												</div>
											</div>
											<div class="form-group">
												<div class="form-group col-sm-5">
													<label for="" class="col-sm-5 control-label">医生</label>
													<div class="col-sm-7">
														<input class="form-control" type="text" name="" value="${msgDTO.data.physician }" placeholder="" disabled="disabled">
													</div>
												</div>
												<div class="form-group col-sm-5">
													<label for="" class="col-sm-5 control-label">诊断时间</label>
													<div class="col-sm-7">
														<input class="form-control" type="" name="" 
														value="<fmt:formatDate value="${msgDTO.data.createtime }" pattern="yyyy.MM.dd HH:mm:ss"/>" 
														placeholder="" disabled="disabled">
													</div>
												</div>
											</div>
										</div>
			
										<div class="col-sm-12 text-center btnOpen">
											<button type="button" class="btn btn-info dy">打印</button>
											<button type="button" class="btn btn-defalut">返回</button>
										</div>
									</form>
									</c:if>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div> 

		<!--/sidebar-menu-->
		<div class="sidebar-menu">
			<header class="logo1">
				<a href="javascript:;" class="sidebar-icon"><span class="fa fa-bars"></span></a> 
			</header>
			<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
               <div class="menu">
					<ul id="menu" >
						<li><a href="openUser.html" title="开户"><i class="fa fa-tachometer"></i> <span>开户</span></a></li>
						<li><a href="closeUser.html" title="销户"><i class="fa fa-file-text-o"></i> <span>销户</span></a></li>
						<li><a href="patient.html" title="患者管理"><i class="fa fa-user-md"></i> <span>患者管理</span></a></li>
						<li class="menu-academico active">
						 	<a href="javascript:;" title="病历管理"><i class="fa fa-medkit"></i> <span>病历管理</span><span class="fa fa-angle-right" style="float: right"></span></a>
						    <ul class="menu-academico-sub" >
							    <li class="menu-academico-avaliacoes"><a href="addCase.html">新建病历</a></li>
								<li class="menu-academico-avaliacoes"><a href="patientHis.html">历史病历</a></li>
						  	</ul>
						</li>
						<li class="menu-academico">
						 	<a href="javascript:;" title="医疗卡"><i class="fa fa-address-card-o"></i> <span>医疗卡</span><span class="fa fa-angle-right" style="float: right"></span></a>
						    <ul class="menu-academico-sub" >
							    <li class="menu-academico-avaliacoes"><a href="rechangeCard.html">医疗卡充值</a></li>
								<li class="menu-academico-avaliacoes"><a href="consumeCard.html">医疗卡消费记录</a></li>
						  	</ul>
						</li>
						<li><a href="money.html" title="财务统计"><i class="fa fa-cny"></i> <span>财务统计</span></a></li>
						<li class="menu-academico">
						 	<a href="javascript:;" title="库房管理"><i class="fa fa-stethoscope"></i> <span>库房管理</span><span class="fa fa-angle-right" style="float: right"></span></a>
						    <ul class="menu-academico-sub" >
							    <li class="menu-academico-avaliacoes"><a href="drug.html">药品管理</a></li>
								<li class="menu-academico-avaliacoes"><a href="javascript:;">设备管理</a></li>
						  	</ul>
						</li>
						<li class="menu-academico">
						 	<a href="javascript:;" title="权限管理"><i class="fa fa-address-book"></i> <span>权限管理</span><span class="fa fa-angle-right" style="float: right"></span></a>
						    <ul class="menu-academico-sub" >
							    <li class="menu-academico-avaliacoes"><a href="user.html">用户管理</a></li>
								<li class="menu-academico-avaliacoes"><a href="role.html">角色管理</a></li>
						  	</ul>
						</li>
						<li class="menu-academico">
						 	<a href="javascript:;" title="处方管理"><i class="fa fa-envelope-open-o"></i> <span>处方管理</span><span class="fa fa-angle-right" style="float: right"></span></a>
						    <ul class="menu-academico-sub" >
							    <li class="menu-academico-avaliacoes"><a href="recipe.html">开处方</a></li>
								<li class="menu-academico-avaliacoes"><a href="recipeHis.html">历史处方</a></li>
						  	</ul>
						</li>
					</ul>
				</div>
			</div>
	  	<div class="clearfix"></div>	
	</div>

	<!-- demo -->
   	<script type="text/javascript" src='js/js.js'></script>

   	<script type="text/javascript">
   		$(function(){
   			// 点击打印
			$(".dy").on('click', function() {
                $(".panel-body").print({
                    //Use Global styles
                    globalStyles : true,
                    //Add link with attrbute media=print
                    mediaPrint : true,
                    printContainer: true,
                    importCSS: true,
                    //Print in a hidden iframe
                    iframe : false,
                    //Don't print this
                    noPrintSelector : ".btnOpen",
                    //Add this at top
                    //Log to console when printing is done via a deffered callback
                    deferred: $.Deferred().done(function() { console.log('Printing done', arguments); })
                });
            });
   		})
   	</script>

</body>
</html>