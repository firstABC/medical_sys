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
	<script type="text/javascript">
	$(document).ready(function () {
		//查询卡号患者信息
         $('#searchButton').on('click', function(){
        	var icCardNum = $('#icCardNum').val();
        	//var icCardNum = document.getElementById("icCardNum").value
        	alert(icCardNum);
        	$.ajax({
        		url:"<%=basePath%>/ic/search.abc",
        		type:"post",
        		data:{num:icCardNum},
        		dataType:"json",
        		headers:{"ClientCallMode" : "ajax"}, 
        		success:function(data){
        			if(data.status == '-2'){
						alert(data.message);
						$("#paName").val("");
						$("#paSex").val("");
						$("#paAge").val("");
					}else{
						//将数据填充到标签里
						//$("#paSex").val(data.data.icbalance);
						$("#paName").val(data.data.paname);
						$("#paAge").val(data.data.paage);
						alert(data.data.pasex);
						if(data.data.pasex=='A'){
							$("#paSex").val("男");
						}else{
							$("#paSex").val("女");
						}
					}
        		}
        	});
		});
	})
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
									<li><a href="javascript:;">处方管理</a></li>|
									<li><a href="javascript:;">开处方</a></li>
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
							<div class="panel panel-title">开处方</div>
							<div class="panel-body">
								<div class="tableBox tableCf">
								<form id="searchForm" name="searchForm">
									<div class="searchList">
										<div class="searchType">
											<label>卡号</label>
											<input type="tel" name="icCardNum" id="icCardNum"  class="form-control">
										</div>
										<div class="searchType"><button type="button" id="searchButton" class="btn btn-info btn-sm" onc>查询</button></div>
										<div class="fr dy"><button type="button" class="btn btn-default btn-sm">打印</button></div>
									</div>
								</form>
									<div class="cfd">
										<!-- 根据卡号查到的患者信息 -->
										<div class="info">
											<h4 class="text-center">北京东城宗喀藏医诊所<br/>处方单</h4>
											<form class="form-horizontal">
												<div class="form-group col-sm-3">
													<label for="" class="col-sm-4 control-label">姓名</label>
													<div class="col-sm-8">
														<input type="text" class="form-control" value="" id="paName" disabled="disabled">
													</div>
												</div>
												<div class="form-group col-sm-3">
													<label for="" class="col-sm-4 control-label" id="uiIdcardNumber">性别</label>
													<div class="col-sm-8">
														<input type="text" class="form-control" value="" id="paSex" disabled="disabled">
													</div>
												</div>
												<div class="form-group col-sm-3">
													<label for="" class="col-sm-4 control-label">年龄</label>
													<div class="col-sm-8">
														<input type="tel" class="form-control" value="" id="paAge" disabled="disabled">
													</div>
												</div>
												<div class="form-group col-sm-3">
													<label for="" class="col-sm-4 control-label">日期</label>
													<div class="col-sm-8">
														<input type="data" class="form-control" value="2017.9.18" disabled="disabled">
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
						                                <th>数量</th>
						                                <th>单位</th>
						                                <th>用法</th>
						                                <th>操作</th>
						                            </tr>
						                        </thead>
						                        <tbody>
						                        	<tr>
										                <td>头孢颗粒</td>
										                <td>2</td>
										                <td>盒</td>
										                <td><input type="text" class="form-control" name="" value="" placeholder="一日三次，每次两粒"></td>
										                <td>
										                	<a href="javascript:;">删除</a>
										                </td>
						                        	</tr>
						                        </tbody>
								    		</table>
											<div class="tj"><button type="button" class="btn btn-info btn-sm addBtn">添加药品</button></div>
										</div>
										<div class="other form-horizontal">
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">医师</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="">
												</div>
											</div>
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">司药</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" value="">
												</div>
											</div>
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">药价</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="">
												</div>
											</div>
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">挂号</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="">
												</div>
											</div>
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">编号</label>
												<div class="col-sm-8">
													<input type="tel" disabled="disabled" class="form-control" value="${prescriptionCode }">
												</div>
											</div>
											<div class="form-group col-sm-4">
												<label for="" class="col-sm-4 control-label">收款人</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="">
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- 药品弹框 -->
			<div class="bg addDrug">
				<div class="itemBox">
					<div class="panel panel-title text-center">添加药品<a href="javascript:;" class="closeAdd fr"><i class="glyphicon glyphicon-remove" data-bv-icon-for="num" style=""></i></a></div>

					<div class="searchList listDrug">
						<div class="searchType ">
							<label>药名</label>
							<input type="text" name="" value="" class="form-control">
						</div>
						<div class="searchType">
							<label>编号</label>
							<input type="tel" name="" value="" class="form-control">
						</div>
						<div class="searchType"><button type="button" class="btn btn-info btn-sm">查询</button></div>
					</div>

					<table class="table-bordered table-striped table-hover" id="table2" width="100%" border="0" cellspacing="0" cellpadding="2">
		    			<thead>
	                        <tr>
	                            <th>药名</th>
	                            <th>编号</th>
	                            <th>单位</th>
	                            <th>单价</th>
	                            <th>操作</th>
	                        </tr>
	                    </thead>
	                    <tbody>
	                    	<tr>
				                <td>头孢颗粒</td>
				                <td>0001</td>
				                <td>盒</td>
				                <td>43</td>
				                <td>
				                	<div class="amount_box">
		                            	<a href="javascript:;" class="reduce">-</a><input class="sum" name="" type="text" value="1" disabled="disabled"><a href="javascript:;" class="plus">+</a>
			                        </div>
				                	<a href="javascript:;">添加</a>
				                </td>
	                    	</tr>
	                    	<tr>
				                <td>阿莫西林</td>
				                <td>0002</td>
				                 <td>盒</td>
				                <td>43</td>
				                <td>
				                	<div class="amount_box">
		                            	<a href="javascript:;" class="reduce">-</a><input class="sum" name="" type="text" value="1" disabled="disabled"><a href="javascript:;" class="plus">+</a>
			                        </div>
				                	<a href="javascript:;">添加</a>
				                </td>
	                    	</tr>
	                    </tbody>
		    		</table>

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

			// 添加药品
			$('.addBtn').click(function(){
				$('.bg.addDrug').show();
			})
			$('.closeAdd').click(function(){
				$('.bg.addDrug').hide();
			})

			// 药品数量加减
			$(".plus").click(function() {
				var t = $(this).parent().find('input[class*=sum]');
				t.val(parseInt(t.val()) + 1);
			})
			$(".reduce").click(function() {
				var t = $(this).parent().find('input[class*=sum]');
				t.val(parseInt(t.val()) - 1)
				if(parseInt(t.val()) < 1) {
					t.val(1);
				}
			})

	        // 点击打印
			$(".dy").on('click', function() {
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
                    noPrintSelector : ".addBtn, .dataTables_length, .dataTables_info, .paging_simple_numbers, #table tr th:last-child, #table tr td:last-child",
                    //Add this at top
                    //Log to console when printing is done via a deffered callback
                    deferred: $.Deferred().done(function() { console.log('Printing done', arguments); })
                });
            });
			
	    });
	</script>

</body>
</html>