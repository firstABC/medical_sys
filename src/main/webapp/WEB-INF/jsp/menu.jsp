<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="sidebar-menu">
			<header class="logo1">
				<a href="javascript:;" class="sidebar-icon"><span class="fa fa-bars"></span></a> 
			</header>
			<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
               <div class="menu">
					<ul id="menu" >
						<li><a href="${pageContext.request.contextPath}/switch/openUser.abc" title="开户"><i class="fa fa-tachometer"></i> <span>开户</span></a></li>
						<li><a href="closeUser.html" title="销户"><i class="fa fa-file-text-o"></i> <span>销户</span></a></li>
						<li><a href="patient.html" title="患者管理"><i class="fa fa-user-md"></i> <span>患者管理</span></a></li>
						<li class="menu-academico">
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
							    <li class="menu-academico-avaliacoes"><a href="${pageContext.request.contextPath}/switch/user.abc">用户管理</a></li>
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
</body>
</html>