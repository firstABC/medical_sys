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
									<li><a href="javascript:;">库房管理</a></li>|
									<li><a href="javascript:;">药品管理</a></li>
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
							<div class="panel panel-title">药品管理</div>
							<div class="panel-body">
								<div class="tableBox tableDrug">
									<div class="btnsDrug">
										<button type="button" class="btn btn-info btn-sm bl">药品补录</button>
										<button type="button" class="btn btn-info btn-sm yj">预警设置</button>
									</div>

									<div class="searchList listDrug">
										<div class="searchType ">
											<label>药品名称</label>
											<input type="text" name="" value="" class="form-control">
										</div>
										<div class="searchType">
											<label>药品编号</label>
											<input type="tel" name="" value="" class="form-control">
										</div>
										<div class="searchType"><button type="button" class="btn btn-info btn-sm">查询</button></div>
									</div>

									<table class="table-bordered table-striped table-hover" id="table" width="100%" border="0" cellspacing="0" cellpadding="2">
						    			<thead>
				                            <tr>
				                                <th>编号</th>
				                                <th>名称</th>
				                                <th>数量</th>
				                                <th>单价</th>
				                                <th>备注</th>
				                                <th>操作</th>
				                            </tr>
				                        </thead>
				                        <tbody>
				                        	<!-- <tr>
				                        		<td>0001</td>
								                <td>头孢颗粒</td>
								                <td>176</td>
								                <td>29</td>
								                <td>治疗感冒</td>
								                <td>
								                	<a href="javascript:;">编辑</a>
								                </td>
				                        	</tr>
				                        	<tr>
				                        		<td>0002</td>
								                <td>头孢颗粒</td>
								                <td>176</td>
								                <td>29</td>
								                <td>治疗感冒</td>
								                <td>
								                	<a href="javascript:;">编辑</a>
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
			<!-- 药品补录弹框 -->
			<div class="bg blBox">
				<div class="itemBox">
					<div class="panel panel-title text-center">药品补录<a href="javascript:;" class="closeAdd fr"><i class="glyphicon glyphicon-remove" data-bv-icon-for="num" style=""></i></a></div>

					<div class="blForm"> 
						<form class="form-horizontal">
							<div class="col-sm-12">
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">编号<span class="text-muted">*</span></label>
									<div class="col-sm-4">
										<input type="tel" class="form-control" placeholder="">
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">药品名称<span class="text-muted">*</span></label>
									<div class="col-sm-4">
										<input type="text" class="form-control" name="" placeholder="">
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">数量</label>
									<div class="col-sm-4">
										<input type="tel" class="form-control" placeholder="">
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">单位</label>
									<div class="col-sm-4">
										<select class="form-control">
											<option>盒</option>
											<option>瓶</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">单价</label>
									<div class="col-sm-4">
										<div class=" input-group">
											<input type="tel" class="form-control">
											<span class="input-group-addon">元</span>
										</div>
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">备注</label>
									<div class="col-sm-4">
										<textarea class="form-control"></textarea>
									</div>
								</div>
							</div>
							<div class="col-sm-12 text-center">
								<button type="button" class="btn btn-info">确定</button>
							</div>
						</form>
					</div>

		    	</div>
			</div>
			<!-- 预警设置 -->
			<div class="bg yjBox">
				<div class="itemBox">
					<div class="panel panel-title text-center">预警设置<a href="javascript:;" class="closeAdd fr"><i class="glyphicon glyphicon-remove" data-bv-icon-for="num" style=""></i></a></div>

					<div class="yjForm"> 
						<div class="yjText text-center">当药品数量 < <input class="form-control" type="tel" name="" value="" placeholder=""> 时，预警</div>
						<div class="col-sm-12 text-center">
							<button type="button" class="btn btn-info">确定</button>
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
						<li class="menu-academico active">
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
   	<script type="text/javascript" src='<%=basePath%>/js/js.js'></script>


   	<script type="text/javascript" src="<%=basePath%>/dataTables/js/jquery.dataTables.js"></script>
   	<script type="text/javascript" src="<%=basePath%>/dataTables/js/dataTables.bootstrap.js"></script>
   	<script type="text/javascript">
		$(document).ready(function () {
	        var t = $('#table').DataTable({
	            "processing": true,
	            'searching': false,
        		// "ajax": "dataTables/info.txt",
				ajax: {
	               //指定数据源
	        	   url:'<%=basePath%>/drug/list',
	        	   type:'GET',
	        	   dataType:'json',
	           },
			    columns: [
			    	{"data": "drugcode"},
	            	{"data": "drugname"},
	            	{"data": "drugnum"},
	            	{"data": "drugprice"},
	            	{"data": "drugremark"},
	            	{"data": null}
	            ], 
	            "columnDefs":[{
		            "targets": 5,
		            "defaultContent": "<a href='#' id='editrow'>编辑</a><a href='#' id='delrow'>删除</a>" 
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