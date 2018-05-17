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
									<li><a href="javascript:;">病例管理</a></li>|
									<li><a href="javascript:;">新增病例</a></li>
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
							<div class="panel panel-title">新增病例</div>
							<div class="panel-body">
								<div class="addCase">
									<form class="form-horizontal" id="editCaseForm">
										<input type="text" placeholder="" name="id" id="id" hidden="hidden">
										<div class="col-sm-12">
											<div class="form-group col-sm-3">
												<label for="" class="col-sm-4 control-label">卡号</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" value="" name="iccardnum" id="iccardnum">
												</div>
											</div>
											<div class="form-group col-sm-3">
												<label for="" class="col-sm-4 control-label">姓名</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" value="" name="paname" id="paname">
												</div>
											</div>
											<div class="form-group col-sm-3">
												<label for="" class="col-sm-4 control-label">性别</label>
												<div class="col-sm-8">
													<select class="form-control" name="pasex" id="pasex">
														<option value="A">男</option>
														<option value="B">女</option>
													</select>
												</div>
											</div>
											<div class="form-group col-sm-3">
												<label for="" class="col-sm-4 control-label">年龄</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" value="" name="paage" id="paage">
												</div>
											</div>
										</div>
										<div class="col-sm-12">
											<div class="form-group">
												<label for="" class="col-sm-2 control-label">主述</label>
												<div class="col-sm-9">
													<textarea class="form-control" name="selfReported" id="selfReported"></textarea>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-2 control-label">现病史</label>
												<div class="col-sm-9">
													<textarea class="form-control" name="nowMedicalRecord" id="nowMedicalRecord"></textarea>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-2 control-label">诊断</label>
												<div class="col-sm-9">
													<textarea class="form-control" name="diagnosis" id="diagnosis"></textarea>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-2 control-label">备注</label>
												<div class="col-sm-9">
													<textarea class="form-control" name="remark" id="remark"></textarea>
												</div>
											</div>
											<!-- <div class="form-group"> -->
												<div class="form-group col-sm-5">
													<label for="" class="col-sm-5 control-label">医生</label>
													<div class="col-sm-7">
														<input class="form-control" type="text" value="" placeholder="" name="physician" id="physician">
													</div>
												</div>
												<!-- <div class="form-group col-sm-5">
													<label for="" class="col-sm-5 control-label">诊断时间</label>
													<div class="col-sm-7">
														<input class="form-control" type="datetime" name="" value="" placeholder="">
													</div>
												</div> -->

										</div>

										<div class="col-sm-12 text-center btnOpen">
											<button type="button" class="btn btn-info" id="editCase">确定</button>
											<!-- <button type="button" class="btn btn-defalut fh">返回</button> -->
										</div>
									</form>
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
			//添加或编辑药品
	         $('#editCase').on('click', function(){
	        	var params = $("#editCaseForm").serialize();
	        	/* params.createtime = new Date();
	        	console.log(params.createtime); */
	        	if(confirm("是否确认编辑这条数据")){
	        		$.ajax({
						url:'<%=basePath%>/mere/edit.abc',
			    		type :'post',
			    		data:params,
			    		timeout:"3000",
		                cache:false,
		                async:false,
			    		success:function(res){
			    			if(res.message == '修改成功!'){
			    				alert(res.message);
			    			}else if(res.message =='添加成功!'){
			    				alert(res.message);
			    				var id = res.data['id']
			    				window.location.href="<%=basePath%>/mere/getMeRe.abc?id="+id;
			    			}else{
			    				alert(res.message);
			    			}
			    		},
			    		error:function(err){
			                alert("获取数据失败");
			            }
			        }); 
		        }
	        	//$('#editCaseForm input').val('');
        		//$('#editCaseForm textarea').val('');
        		//$('#editCaseForm select').val('');	//手动清除form表单
        		
			});
	      	//点击返回
			$(".fh").on('click', function() {
	               var iccardnum = $('#iccardnum').val();
	               window.location.href="<%=basePath%>/mere/list.abc?icCardNum="+iccardnum;
	        });
	    });
	</script>
</body>
</html>