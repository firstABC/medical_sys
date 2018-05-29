<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
								<div class="roleTable clearfix">
									<div class="title clearfix">
										<ul>
											<li>角色</li>
											<li>拥有权限</li>
										</ul>
									</div>
									<!-- 角色 -->
									<div class="table nav">
										<ul>
										<c:forEach items="${ltRole}" var="it" varStatus="idx">
											<li><a href="javascript:;" class="selRole <c:if test="${idx.index==0}">active</c:if>">${it.rolenmae }<input class="qq" type="hidden" value="${it.roleid }"></a></li>
										</c:forEach>	
										</ul>
									</div>
									<!-- 权限 -->
									<div class="table roleBox">
										<!-- 角色1的权限 -->
										<c:forEach items="${ltRole}" var="it" varStatus="idx">
											<div class="roleList <c:if test="${idx.index==0}"> curren </c:if>">
												<div class="checkbox checkbox-info">
							                        <input id="checkbox${idx.index+1}1" class="styled" type="checkbox"  <c:if test="${fn:contains(it.ltPerCode,'A001')}">checked="checked"</c:if> value="A001">
							                        <label for="checkbox${idx.index+1}1">开户</label>
							                    </div>
							                    <div class="checkbox checkbox-info">
							                        <input id="checkbox${idx.index+1}2" class="styled" type="checkbox" <c:if test="${fn:contains(it.ltPerCode,'A002')}">checked="checked"</c:if> value="A002">
							                        <label for="checkbox${idx.index+1}2">销户</label>
							                    </div>
							                    <div class="checkbox checkbox-info">
							                        <input id="checkbox${idx.index+1}3" class="styled" type="checkbox" <c:if test="${fn:contains(it.ltPerCode,'B001')}">checked="checked"</c:if> value="B001">
							                        <label for="checkbox${idx.index+1}3">患者管理</label>
							                    </div>
												<div class="checkbox checkbox-info">
							                        <input id="checkbox${idx.index+1}4" class="styled" type="checkbox" <c:if test="${fn:contains(it.ltPerCode,'C001')}">checked="checked"</c:if> value="C001">
							                        <label for="checkbox${idx.index+1}4">病历管理</label>
							                    </div>
							                    <div class="checkbox checkbox-info">
							                        <input id="checkbox${idx.index+1}5" class="styled" type="checkbox" <c:if test="${fn:contains(it.ltPerCode,'D001')}">checked="checked"</c:if> value="D001">
							                        <label for="checkbox${idx.index+1}5">医疗卡</label>
							                    </div>
							                    <div class="checkbox checkbox-info">
							                        <input id="checkbox${idx.index+1}6" class="styled" type="checkbox" <c:if test="${fn:contains(it.ltPerCode,'E001')}">checked="checked"</c:if> value="E001">
							                        <label for="checkbox${idx.index+1}6">库房管理</label>
							                    </div>	
							                    <div class="checkbox checkbox-info">
							                        <input id="checkbox${idx.index+1}7" class="styled" type="checkbox" <c:if test="${fn:contains(it.ltPerCode,'F001')}">checked="checked"</c:if> value="F001">
							                        <label for="checkbox${idx.index+1}7">权限管理</label>
							                    </div>	
							                     <div class="checkbox checkbox-info">
							                        <input id="checkbox${idx.index+1}8" class="styled" type="checkbox" <c:if test="${fn:contains(it.ltPerCode,'G001')}">checked="checked"</c:if> value="G001">
							                        <label for="checkbox${idx.index+1}8">处方管理</label>
							                    </div>	
							                </div>
						                </c:forEach>
									</div>
								</div>
								<button type="button" class="btn btn-info btn-sm fr qdBtn">确定</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div> 

		<!-- sidebar-menu-->
		<jsp:include page="menu.jsp" flush="true"></jsp:include>
	  	<div class="clearfix"></div>	
	</div>

	<!-- demo -->
   	<script type="text/javascript" src='<%=basePath%>/js/js.js'></script>

   	<script type="text/javascript">
   		$(function(){
   			$('.nav li').click(function(){
   				var index = $(this).index();
   				if (!$(this).children('.selRole').hasClass('active')) {
   					$('.selRole').removeClass('active');
	   				$(this).children('.selRole').addClass('active');
	   				$('.roleList').removeClass('curren');
	   				$('.roleBox').children('.roleList').eq(index).addClass('curren');
   				}
   			})
   			// 点击确定
   			$('.qdBtn').click(function(){
   				// 选中的角色
	   			//var role = $('.nav li').children('.active').text();
	   			var role = $('.nav li .active .qq').val();
	   			 alert(role);
	   			// 权限
	   			var qx_value = []; 
	   			//var permissions;
				$('.curren').find('input.styled:checked').each(function(){ 
					qx_value.push($(this).val()); 
				//	permissions+$(this).val()+"-"
				//	alert(permissions);
				}); 
				 alert(qx_value.length==0 ?'你还没有选择任何权限！':qx_value);
				 
				 window.location.href="<%=basePath%>/rolep/upR.abc?roleId="+role+"&permissions="+qx_value;
				 alert("修改成功！")
				 
   			})
   		})
   	</script>

</body>
</html>