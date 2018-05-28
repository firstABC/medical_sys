<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

	<link rel="stylesheet" type="text/css" href="<%=basePath%>/dataTables/css/jquery.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/dataTables/css/dataTables.tableTools.min.css">

	<link href="<%=basePath%>/css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="<%=basePath%>/js/jquery-1.10.2.min.js"></script>
   	<script src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
   	<script src="<%=basePath%>/bootstrapValidator/bootstrapValidator.min.js"></script>
	<!-- demo -->
   	<script type="text/javascript" src='<%=basePath%>/js/js.js'></script>
   	<script type="text/javascript" src="<%=basePath%>/dataTables/js/jquery.dataTables.js"></script>
   	<script type="text/javascript" src="<%=basePath%>/dataTables/js/dataTables.bootstrap.js"></script>

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
									<li><a href="javascript:;">患者管理</a></li>
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
							<div class="panel panel-title">患者管理</div>
							<div class="panel-body">
								<div class="tableBox">
									<div class="searchList">
										<div class="searchType ">
											<label>卡号</label>
											<input type="tel" name="" value="" class="form-control" id="iccardnumC">
										</div>
										<div class="searchType">
											<label>姓名</label>
											<input type="text" name="" value="" class="form-control" id="panameC">
										</div>
										<div class="searchType">
											<label>手机号</label>
											<input type="tel" name="" value="" class="form-control" id="paphoneC">
										</div>
										<div class="searchType">
											<label>状态</label>
											<select class="form-control" id="isstatusC">
												<option></option>
												<option>正常</option>
												<option>冻结</option>
											</select>
										</div>
										<div class="cx"><button type="button" class="btn btn-info btn-sm" id="selectBtn">查询</button></div>
									</div>

									<table class="table-bordered table-striped table-hover" id="table" width="100%" border="0" cellspacing="0" cellpadding="2">
						    			<thead>
				                            <tr>
				                                <th>卡号</th>
				                                <th>姓名</th>
				                                <th>手机号</th>
				                                <th>年龄</th>
				                                <th>性别</th>
				                                <th>卡余额</th>
				                                <th>状态</th>
				                                <th>操作</th>
				                                <th style="hidden:'hidden'">编号</th>
				                            </tr>
				                        </thead>
				                        <tbody>
				                        	
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

   	<script type="text/javascript">
		$(document).ready(function () {
	        var t = $('#table').DataTable({
	            "processing": true,
	            //'searching': false,
        		// "ajax": "dataTables/info.txt",
				ajax: {
	               //指定数据源
	        	   url:'<%=basePath%>/pa/list.abc',
	        	   type:'GET',
	        	   dataType:'json',
	           },
			    columns: [
			    	{"data": "iccardnum"},
	            	{"data": "paname"},
	            	{"data": "paphone"},
	            	{"data": "paage"},
	            	{"data": "pasex",
	            		render:function(pasex){
	                        if(pasex=="B"){
	                            return "女";
	                        }else{
	                            return "男";
	                        }
                    	}
	            	},
	            	{"data": "icbalance"},
	            	{"data": "isstatus",
	            		render:function(isstatus){
	                        if(isstatus=="C"){
	                            return "销户";
	                        }else if(isstatus=="B"){
	                            return "冻结";
	                        }else{
	                        	return "正常"
	                        }
                    	}
	            	},
	            	{"data": null},
	            	{"data": "patientid"},
	            ], 
	            "columnDefs":[
	                {
		            	"targets": 7,
		            	"defaultContent": "<a href='#' id='info'>详情</a><a href='#' id='record'>病历查询</a><a href='#' id='prescription'>处方查询</a>" 
		        	},
	                {
		            	"targets": 8,
		            	"visible": false
		        	}
	            ],
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
	        /*详情*/
		    $('#table tbody').on( 'click', 'a#info', function () {
		    	var data = t.row( $(this).parents('tr') ).data();
		    	var patientid = data['patientid'];
	            window.location.href="<%=basePath%>/pa/getPatient.abc?patientId="+patientid;
		    });
		    /*病历查询*/
		    $('#table tbody').on( 'click', 'a#record', function () {
		    	var data = t.row( $(this).parents('tr') ).data();
		    	var iccardnum = data['iccardnum'];
	            window.location.href="<%=basePath%>/mere/list.abc?icCardNum="+iccardnum;
		    });
		    /*处方查询*/
		    $('#table tbody').on( 'click', 'a#prescription', function () {
		    	var data = t.row( $(this).parents('tr') ).data();
		    	var iccardnum = data['iccardnum'];
		    	window.location.href="<%=basePath%>/pp/pr.abc?icCardNum="+iccardnum+"&physician="
		    });
		    /*查询信息（基于卡号姓名手机号状态）*/
	 		$('#selectBtn').on('click', function(){
	 			var iccardnumC = $('#iccardnumC').val();
	 			var panameC = $('#panameC').val();
	 			var paphoneC = $('#paphoneC').val();
	 			var isstatusC = $('#isstatusC').val();
	  		  	t.column(0).search(iccardnumC, false, false).draw();
	  			t.column(1).search(panameC, false, false).draw();
	  			t.column(2).search(paphoneC, false, false).draw();
	  			t.column(6).search(isstatusC, false, false).draw();
	 		});
		});
	</script>
</body>
</html>