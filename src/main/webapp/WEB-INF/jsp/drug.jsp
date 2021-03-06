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
											<input type="text" name="" value="" class="form-control" id="drugnameC">
										</div>
										<div class="searchType">
											<label>药品编号</label>
											<input type="tel" name="" value="" class="form-control" id="drugcodeC">
										</div>
										<div class="searchType">
											<button type="button" class="btn btn-info btn-sm" id="selectBtn">模糊查询</button>
											<!-- <button type="button" class="btn btn-info btn-sm" id="selectAllBtn">查询全部</button> -->
										</div>
										
									</div>

									<table class="table-bordered table-striped table-hover" id="table" width="100%" border="0" cellspacing="0" cellpadding="2">
						    			<thead>
				                            <tr>
				                                <th>编号</th>
				                                <th>名称</th>
				                                <th>数量</th>
				                                <th>单价</th>
				                                <th>单位</th>
				                                <th>备注</th>
				                                <th>时间</th>
				                                <th>操作</th>
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
			<!-- 药品补录弹框 -->
			<div class="bg blBox">
				<div class="itemBox">
					<div class="panel panel-title text-center">药品补录<a href="javascript:;" class="closeAdd fr"><i class="glyphicon glyphicon-remove" data-bv-icon-for="num" style=""></i></a></div>

					<div class="blForm"> 
						<form class="form-horizontal" id="editDrugForm">
							<input type="text" placeholder="" name="drugid" id="drugid" hidden="hidden">
							<div class="col-sm-12">
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">编号<span class="text-muted">*</span></label>
									<div class="col-sm-4">
										<input type="text" class="form-control" placeholder="" name="drugcode" id="drugcode">
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">药品名称<span class="text-muted">*</span></label>
									<div class="col-sm-4">
										<input type="text" class="form-control" placeholder="" name="drugname" id="drugname">
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">数量</label>
									<div class="col-sm-4">
										<input type="tel" class="form-control" placeholder="" name="drugnum" id="drugnum">
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">单位</label>
									<div class="col-sm-4">
										<select class="form-control" name="drugunit" id="drugunit">
											<option value ="A">盒</option>
											<option value ="B">瓶</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">单价</label>
									<div class="col-sm-4">
										<div class=" input-group">
											<input type=tel class="form-control" name="drugprice" id="drugprice">
											<span class="input-group-addon">元</span>
										</div>
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-4 control-label">备注</label>
									<div class="col-sm-4">
										<textarea class="form-control" name="drugremark" id="drugremark"></textarea>
									</div>
								</div>
							</div>
							<div class="col-sm-12 text-center">
								<button type="button" class="btn btn-info" id="editDrug">确定</button>
							</div>
						</form>
					</div>

		    	</div>
			</div>
			<!-- 预警设置 -->
			<div class="bg yjBox">
				<div class="itemBox">
					<div class="panel panel-title text-center">预警设置<a href="javascript:;" class="closeAdd fr"><i class="glyphicon glyphicon-remove" data-bv-icon-for="num" style=""></i></a></div>
					<input class="form-control" type="tel" name="id" value="" placeholder="" id="ewId">
					<div class="yjForm"> 
						<div class="yjText text-center">当药品数量 < 
						<input class="form-control" type="tel" name="minnum" value="" placeholder="" id="ewNum"> 时，预警</div>
						<div class="col-sm-12 text-center">
							<button type="button" class="btn btn-info" id="updateEWNum">确定</button>
						</div>
					</div>

		    	</div>
			</div>
		</div> 

		<!--/sidebar-menu-->
		<jsp:include page="menu.jsp" flush="true"></jsp:include>
	  	<div class="clearfix"></div>	
	</div>

   	<script type="text/javascript" >
   	$(document).ready(function () {
   		//初始化预警数
   		getEW();
   		
   		//console.log($('#ewNum').val());
		var drugnameC = $('#drugnameC').val();
			var drugcodeC = $('#drugcodeC').val();
			var url = '<%=basePath%>/drug/list.abc?drugname='+drugnameC+'&drugcode='+drugcodeC;
			
        var t = $('#table').DataTable({
            "processing": true,
            //'searching': false,
    		// "ajax": "dataTables/info.txt",
			ajax: {
               //指定数据源
        	   url:url,
        	   type:'GET',
        	   dataType:'json',
        	   
           },
		    columns: [
		    	{"data": "drugcode"},
            	{"data": "drugname"},
            	{"data": "drugnum"},
            	{"data": "drugprice"},
            	{"data": "drugunit",
            		render:function(drugunit){
                        if(drugunit=="A"){
                            return "盒";
                        }else if(drugunit=="B"){
                            return "瓶";
                        }else{
                        	return null;
                        }
                	}
            	},
            	{"data": "drugremark"},
            	{"data": "createtime",
            		render:function(createtime){
            			return getMyDate(createtime);
                	}	
            	},
            	{"data": null}
            ], 
            "columnDefs":[{
	            "targets": 7,
	            "defaultContent": "<a href='#' id='editrow'>编辑</a><a href='#' id='delrow'>删除</a>" 
	        }],
	        "fnRowCallback": function(nRow, aData, iDisplayIndex, iDisplayIndexFull ) { 
            	//改行满足的条件
            	var n = aData['drugnum'];
            	var ewNum = $('#ewNum').val();
            	if(n < ewNum){
            		//设置满足条件行的字体颜色
            		//$(nRow).css("background", "red");		//datatable默认隔行控制
            		$(nRow).children('td').css("color", "red");
            	}
            },
           
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
        /*编辑按钮*/
	    $('#table tbody').on( 'click', 'a#editrow', function () {
	    	$('.blBox').show();
	    	var data = t.row( $(this).parents('tr') ).data();
	    	for (var key in data ){
	    		if(key =="drugid"){
	    			$("#"+key).hide();
	    		}
	    		$("#"+key).val(data[key]);
	    	}

	    });
        /*删除按钮*/
	    $('#table tbody').on( 'click', 'a#delrow', function () {
	        var data = t.row( $(this).parents('tr') ).data();
	        if(confirm("是否确认删除这条数据")){
	            $.ajax({
	                url:'<%=basePath%>/drug/delete.abc',
	                type:'post',
	                data: {"drugId": data.drugid}, 
	                timeout:"3000",
	                cache:"false",
	                async:false,
	                success:function(res){
	                    if(res.status == 0){
	                        //t.row().remove();	//删除这行的数据
	                        alert(res.message);
	                    }else{
	                    	alert(res.message);
	                    }
	                },
	                error:function(err){
	                    alert("获取数据失败");
	                }
	            });
	        }
	        t.ajax.reload();	//刷新datatable
	    });
        //添加或编辑药品
         $('#editDrug').on('click', function(){
        	var params = $("#editDrugForm").serialize();
        	if(confirm("是否确认编辑这条数据")){
        		$.ajax({
					url:'<%=basePath%>/drug/edit.abc',
		    		type :'post',
		    		data:params,
		    		timeout:"3000",
	                cache:"false",
	                async:false,
		    		success:function(res){
		    			if(res.message == '修改成功!'){
		    				alert(res.message);
		    			}else if(res.message =='添加成功!'){
		    				alert(res.message);
		    			}else{
		    				alert(res.message);
		    			}
		    		},
		    		error:function(err){
		                alert("获取数据失败");
		            }
		        });
	        }
        	t.ajax.reload();		//刷新datatable
        	$('#editDrugForm input').val('');	//手动清除form表单
    		$('#drugremark').val('');
    		$('#drugunit').val('');
    		$('.bg').hide();			//关闭编辑框
		});
        /*查询药品（基于名称和编号）*/
 		$('#selectBtn').on('click', function(){
 			drugnameC = $('#drugnameC').val();
  			drugcodeC = $('#drugcodeC').val();
  			//url = '<%=basePath%>/drug/list.abc?drugname='+drugnameC+'&drugcode='+drugcodeC;
  		  	t.column(0).search(drugcodeC, false, false).draw();
  			t.column(1).search(drugnameC, false, false).draw();

 		});
 		//查询全部药品
 		$('#selectAllBtn').on('click', function(){
 			$('#drugnameC').val('');
  			$('#drugcodeC').val('');
  			drugnameC = $('#drugnameC').val();
  			drugcodeC = $('#drugcodeC').val();
  			t.column(0).search(drugcodeC, false, false).draw();
  			t.column(1).search(drugnameC, false, false).draw();
 		});
	       
        // 药品补录
        $('.bl').on('click', function(){
        	$('.blBox').show();
        })
		$('.closeAdd').click(function(){
			$('.bg').hide();
		})
		// 获取预警数
        $('.yj').on('click', function(){
        	
        	$('.yjBox').show();
        })
      	//修改预警数
        $('#updateEWNum').on('click', function(){
			var id=$('#ewId').val();
			var num = $('#ewNum').val();
     		$.ajax({
				url:'<%=basePath%>/drug/updateNum.abc?id='+id+'&num='+num,
	    		type :'post',
	    		timeout:"3000",
                cache:"false",
                async:false,
	    		success:function(res){
	    			if(res.message == '修改成功!'){
	    				$('#ewNum').val(res.total);
	    			}
	    		},
	    		error:function(err){
	                alert("获取数据失败");
	            }
	        }); 
	       	t.ajax.reload();		//刷新datatable
	   		$('.bg').hide();			//关闭编辑框
		});
        function getEW(){
        	$.ajax({
				url:'<%=basePath%>/drug/getNum.abc',
	    		type :'get',
	    		timeout:"3000",
                cache:"false",
                async:false,
	    		success:function(res){
	    			var ew = res.data; 
	    			$('#ewId').val(ew.id);
	    			$('#ewNum').val(res.total);
	    		},
	    		error:function(err){
	                alert("获取数据失败");
	            }
	        });
        }
    });
  	//将时间戳格式化 
   	function getMyDate(time){  
   	    if(typeof(time)=="undefined"){
   	        return "";
   	    }
   	    var oDate = new Date(time),  
   	     oYear = oDate.getFullYear(),  
   	     oMonth = oDate.getMonth()+1,  
   	     oDay = oDate.getDate(),  
   	     oHour = oDate.getHours(),  
   	     oMin = oDate.getMinutes(),  
   	     oSen = oDate.getSeconds(),  
   	     oTime = oYear +'-'+ getzf(oMonth) +'-'+ getzf(oDay) +' '+ getzf(oHour) +':'+ getzf(oMin) +':'+getzf(oSen);//最后拼接时间  
   	            
   	     return oTime;  
   	    };
   	    
 	 //补0操作,当时间数据小于10的时候，给该数据前面加一个0  
	 function getzf(num){  
	     if(parseInt(num) < 10){  
	          num = '0'+num;  
	     }  
	     return num;  
	}
   	</script>
</body>
</html>