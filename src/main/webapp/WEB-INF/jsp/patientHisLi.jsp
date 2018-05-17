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
   	<!-- demo -->
   	<script type="text/javascript" src='<%=basePath%>/js/js.js'></script>
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
							<div class="panel panel-title">病历详情</div>
							<div class="panel-body">
								<div class="tableBox">
									<c:if test="${msgDTO.total == 1}">
									<form class="form-horizontal dyForm">
										<div class="form-group col-sm-3">
											<label for="" class="col-sm-4 control-label">卡号</label>
											<div class="col-sm-8">
												<input type="tel" class="form-control" value="${msgDTO.data.iccardnum }" disabled="disabled" id="icCardNum">
											</div>
										</div>
										<div class="form-group col-sm-3">
											<label for="" class="col-sm-4 control-label">姓名</label>
											<div class="col-sm-8">
												<input type="text" class="form-control" value="${msgDTO.data.paname }" disabled="disabled">
											</div>
										</div>
										<div class="form-group col-sm-3">
											<label for="" class="col-sm-4 control-label">性别</label>
											<div class="col-sm-8">
												<%-- <select class="form-control" disabled="disabled" value="">
													<option value ="${msgDTO.data.pasex }">男</option>
													<option value ="${msgDTO.data.pasex }">女</option>
												</select> --%>
												<input type="text" class="form-control" value="${msgDTO.data.pasex == 'A'?'男':'女' }" disabled="disabled">
											</div>
										</div>
										<div class="form-group col-sm-3">
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
											<button type="button" class="btn btn-defalut fh">返回</button>
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
		<jsp:include page="menu.jsp" flush="true"></jsp:include>
	  	<div class="clearfix"></div>	
	</div>

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
			// 点击返回
			$(".fh").on('click', function() {
                var iccardnum = $('#icCardNum').val();
                window.location.href="<%=basePath%>/mere/list.abc?icCardNum="+iccardnum;
            });
   		})
   	</script>

</body>
</html>