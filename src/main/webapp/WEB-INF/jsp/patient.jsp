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
							<div class="panel panel-title">患者管理</div>
							<div class="panel-body">
								<div class="tableBox">
									<div class="searchList">
										<div class="searchType ">
											<label>卡号</label>
											<input type="tel" name="" value="" class="form-control">
										</div>
										<div class="searchType">
											<label>姓名</label>
											<input type="text" name="" value="" class="form-control">
										</div>
										<div class="searchType">
											<label>手机号</label>
											<input type="tel" name="" value="" class="form-control">
										</div>
										<div class="searchType">
											<label>状态</label>
											<select class="form-control">
												<option>正常</option>
												<option>冻结</option>
											</select>
										</div>
										<div class="cx"><button type="button" class="btn btn-info btn-sm">查询</button></div>
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
				                            </tr>
				                        </thead>
				                        <tbody>
				                        	<!-- <tr>
				                        		<td>0001</td>
								                <td>刘云</td>
								                <td>17602150333</td>
								                <td>29</td>
								                <td>女</td>
								                <td>341.00</td>
								                <td>正常</td>
								                <td>
								                	<a href="javascript:;">详情</a>
								                	<a href="javascript:;">病例查询</a>
								                	<a href="javascript:;">处方查询</a>
								                </td>
				                        	</tr>
				                        	<tr>
				                        		<td>0002</td>
								                <td>李凯</td>
								                <td>17602150193</td>
								                <td>22</td>
								                <td>男</td>
								                <td>109.00</td>
								                <td>正常</td>
								                <td>
								                	<a href="javascript:;">详情</a>
								                	<a href="javascript:;">病例查询</a>
								                	<a href="javascript:;">处方查询</a>
								                </td>
				                        	</tr>
				                        	<tr>
				                        		<td>0003</td>
								                <td>赵宇</td>
								                <td>17602150191</td>
								                <td>26</td>
								                <td>男</td>
								                <td>101.00</td>
								                <td>正常</td>
								                <td>
								                	<a href="javascript:;">详情</a>
								                	<a href="javascript:;">病例查询</a>
								                	<a href="javascript:;">处方查询</a>
								                </td>
				                        	</tr> -->
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
		<div class="sidebar-menu">
			<header class="logo1">
				<a href="javascript:;" class="sidebar-icon"><span class="fa fa-bars"></span></a> 
			</header>
			<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
               <div class="menu">
					<ul id="menu" >
						<li><a href="openUser.html" title="开户"><i class="fa fa-tachometer"></i> <span>开户</span></a></li>
						<li><a href="closeUser.html" title="销户"><i class="fa fa-file-text-o"></i> <span>销户</span></a></li>
						<li class="active"><a href="patient.html" title="患者管理"><i class="fa fa-user-md"></i> <span>患者管理</span></a></li>
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

   	<script type="text/javascript">
		$(document).ready(function () {
	        var t = $('#table').DataTable({
	            "processing": true,
	            'searching': false,
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
	            	{"data": null}
	            ], 
	            "columnDefs":[{
		            "targets": 7,
		            "defaultContent": "<a href='#' id='info'>详情</a><a href='#' id='record'>病例查询</a><a href='#' id='prescription'>处方查询</a>" 
		        }],
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


	    });
	</script>
</body>
</html>