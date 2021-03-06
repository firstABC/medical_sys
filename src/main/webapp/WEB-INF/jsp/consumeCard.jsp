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

	<link rel="stylesheet" type="text/css" href="<%=basePath%>/dataTables/css/jquery.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/dataTables/css/dataTables.tableTools.min.css">

	<link href="<%=basePath%>/css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="<%=basePath%>/js/jquery-1.10.2.min.js"></script>
   	<script src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
   	<script src="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.js"></script>
   	<script type="text/javascript">
   		function selectExpenseRecord(){
   			var icCardNum = $('#icCardNum').val();
   			var beginTime = $('#beginTime').val();
   			var endTime = $('#endTime').val();
   			window.location.href="<%=basePath%>/tr/consumeCard.abc?icCardNum="+icCardNum+"&beginTime="+beginTime+"&endTime="+endTime;
   			
   		}
   	</script>

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
									<li><a href="javascript:;">医疗卡管理</a></li>|
									<li><a href="javascript:;">医疗卡消费记录</a></li>
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
							<div class="panel panel-title">医疗卡消费记录</div>
							<div class="panel-body">
								<div class="tableBox tableDrug">

									<div class="searchList listDrug">
										<div class="searchType">
											<label>卡号</label>
											<input type="text" name="icCardNum" id="icCardNum" value="${icCardNum }" class="form-control">
										</div>
										<div class="searchType searchType2">
											<label>日期</label>
											<input type="date" name="beginTime" id="beginTime" value="${beginTime }" class="form-control"> - <input type="date" name="endTime" id="endTime" value="${endTime }" class="form-control">
										</div>
										<div class="searchType"><button type="button" class="btn btn-info btn-sm" onclick="selectExpenseRecord();">查询</button></div>
									</div>

									<table class="table-bordered table-striped table-hover" id="table" width="100%" border="0" cellspacing="0" cellpadding="2">
						    			<thead>
				                            <tr>
				                                <th>序号</th>
				                                <th>卡号</th>
				                                <th>类型</th>
				                                <th>金额</th>
				                                <th>余额</th>
				                                <th>日期</th>
				                            </tr>
				                        </thead>
				                        <tbody>
					                        	<c:forEach items="${msgDTO.data}" var="it" varStatus="idx">
						                        	<tr>
						                        		<td>${idx.index+1}</td>
										                <td>${it.iccardnum }</td>
										                <td>${it.trtype=="A"?"存入":"支出" }</td>
										                <td>${it.trmoney }</td>
										                <td>${it.trbalance }</td>
										                <td><fmt:formatDate value="${it.trtime}" pattern="yyyy.MM.dd"/></td>
						                        	</tr>
						                        </c:forEach>
				                        </tbody>
						    		</table>

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

	        // 药品补录
	        $('.bl').on('click', function(){
	        	$('.blBox').show();
	        })
			$('.closeAdd').click(function(){
				$('.bg').hide();
			})
			// 预警
	        $('.yj').on('click', function(){
	        	$('.yjBox').show();
	        })
	    });
	</script>
</body>
</html>