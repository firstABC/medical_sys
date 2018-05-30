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
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

	<link href="<%=basePath%>/bootstrap/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
	<link href="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.css" rel='stylesheet' type='text/css' />
	<link href="<%=basePath%>/css/font-awesome.css" rel="stylesheet">

	<link rel="stylesheet" type="text/css" href="<%=basePath%>/dataTables/css/jquery.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/dataTables/css/dataTables.tableTools.min.css">

	<link href="<%=basePath%>/css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="<%=basePath%>/js/jquery-1.10.2.min.js"></script>
   	<script src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
   	<script src="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.js"></script>
   	<!-- 打印 -->
   	<script type="text/javascript" src="<%=basePath%>/js/jQuery.print.js"></script>
	<link href="<%=basePath%>/css/print.css" rel='stylesheet' type='text/css' media='print' />

</head> 
<body>
   	<div class="page-container">
   		<!-- inner-content -->
		<div class="left-content left-content2">
			<div class="inner-content">
				<!-- top_bg -->
				<div class="header-section">
					<div class="top_bg">
						<div class="header_top">
							<div class="top_right">
								<ul>
									<li><a href="javascript:;">当前位置</a></li>|
									<li><a href="javascript:;">处方管理</a></li>|
									<li><a href="recipeHis.html">历史处方</a></li>|
									<li><a href="javascript:;">处方详情</a></li>
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
							<div class="panel panel-title">处方详情</div>
							<div class="panel-body">
								<div class="tableBox tableCf">
									<div class="cfd">
										<!-- 根据长号查到的患者信息 -->
										<div class="info">
											<h4 class="text-center">北京东城宗喀藏医诊所<br/>处方单</h4>
											<form class="form-horizontal">
												<div class="form-group col-sm-3">
													<label for="" class="col-sm-4 control-label">姓名</label>
													<div class="col-sm-8">
														<input type="text" class="form-control" value="${prescription.paname }" disabled="disabled">
													</div>
												</div>
												<div class="form-group col-sm-3">
													<label for="" class="col-sm-4 control-label" id="uiIdcardNumber">性别</label>
													<div class="col-sm-8">
													<c:choose>
														<c:when test="${prescription.pasex =='A' }">
															<input type="text" class="form-control" value="男" disabled="disabled">
														</c:when>
														<c:otherwise>
															<input type="text" class="form-control" value="女" disabled="disabled">
														</c:otherwise>
													</c:choose>
													</div>
												</div>
												<div class="form-group col-sm-3">
													<label for="" class="col-sm-4 control-label">年龄</label>
													<div class="col-sm-8">
														<input type="tel" class="form-control" value="${prescription.paage }" disabled="disabled">
													</div>
												</div>
												<div class="form-group col-sm-3">
													<label for="" class="col-sm-4 control-label">日期</label>
													<div class="col-sm-8">
														<input type="data" class="form-control" value="<fmt:formatDate value="${prescription.createtime }" pattern="yyyy.MM.dd "/>" disabled="disabled">
													</div>
												</div>
											</form>
										</div>
										<div class="cfItem">
											<h4>RP：</h4>
											<table class="table-bordered table-striped table-hover" id="table" width="100%" border="0" cellspacing="0" cellpadding="2">
								    			<thead>
						                            <tr>
						                                <th>名称</th>
						                                <th>单价</th>
						                                <th>数量</th>
						                                <th>单位</th>
						                                <th>用法</th>
						                            </tr>
						                        </thead>
						                        <tbody>
						                        	 <c:forEach items="${prescription.ltPrDList}" var="it">
							                        	<tr>
							                        		<td>${it.drugname }</td>
							                        		<td>${it.drugprice }</td>
							                        		<td>${it.drugnum }</td>
							                        		<td>${it.drugunit }</td>
							                        		<td>${it.usagetext }</td>
							                        	</tr>
						                        	</c:forEach>
						                        </tbody>
								    		</table>
										</div>
										<div class="other form-horizontal">
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">医师</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="${prescription.physician}" disabled="disabled">
												</div>
											</div>
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">司药</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" value="${prescription.druggist}" disabled="disabled">
												</div>
											</div>
											<div class="form-group col-sm-4 yj">
												<label for="" class="col-sm-4 control-label">药价</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="${prescription.drugprice}" disabled="disabled">
												</div>
											</div>
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">挂号</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="${prescription.registrationcode}" disabled="disabled">
												</div>
											</div>
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">编号</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="${prescription.prescriptioncode}" disabled="disabled">
												</div>
											</div>
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">收款人</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="${prescription.prescriptioncode}" disabled="disabled">
												</div>
											</div>
										</div>
									</div>
									<div class="dy dy2">
										<button type="button" class="btn btn-info btn-sm addBtn">打印</button>
									</div>
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
   	
   	<script type="text/javascript" src="<%=basePath%>/dataTables/js/jquery.dataTables.js"></script>
   	<script type="text/javascript" src="<%=basePath%>/dataTables/js/dataTables.bootstrap.js"></script>
   	<script type="text/javascript">
		$(document).ready(function () {
	        var t = $('#table').DataTable({
	            "processing": true,
	            'searching': false,
	            "paging": false,
        		// "ajax": "dataTables/info.txt",

        		//插件的汉化
		        "oLanguage": {
		            "sLengthMenu": "每页显示 _MENU_ 条记录",
		            "sZeroRecords": "抱歉， 没有找到",
		            "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
		            "sInfoEmpty": "没有数据",
		            "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
		            "oPaginate": {
		                "sFirst": false,
		                "sPrevious": false,
		                "sNext": false,
		                "sLast": false
		            },
		            "sZeroRecords": "没有检索到数据",
		            "sProcessing": "<img src='' />",
		            "sSearch": "搜索"
		        },
	        });
	        var t2 = $('#table2').DataTable({
	            "processing": true,
	            'searching': false,
        		// "ajax": "dataTables/info.txt",

        		//插件的汉化
		        "oLanguage": {
		            "sLengthMenu": "每页显示 _MENU_ 条记录",
		            "sZeroRecords": "抱歉， 没有找到",
		            "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
		            "sInfoEmpty": "没有数据",
		            "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
		            "oPaginate": {
		                "sFirst": false,
		                "sPrevious": false,
		                "sNext": false,
		                "sLast": false
		            },
		            "sZeroRecords": "没有检索到数据",
		            "sProcessing": "<img src='' />",
		            "sSearch": "搜索"
		        },
	        });

	        // 点击打印
	        $('.dy').on('click', function() {
                $(".cfd").print({
                    //Use Global styles
                    globalStyles : true,
                    //Add link with attrbute media=print
                    mediaPrint : true,
                    printContainer: true,
                    importCSS: true,
                    //Print in a hidden iframe
                    iframe : false,
                    //Don't print this
                    noPrintSelector : ".dataTables_length, .dataTables_info, .paging_simple_numbers",
                    //Add this at top
                    //Log to console when printing is done via a deffered callback
                    deferred: $.Deferred().done(function() { console.log('Printing done', arguments); })
                });
            });
			
	    });
	</script>

</body>
</html>