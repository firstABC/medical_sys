<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
	<title>医疗系统</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
	<link href="${pageContext.request.contextPath}/bootstrapValidator/bootstrapValidator.min.css" rel='stylesheet' type='text/css' />
	<link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet">

	<link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
   	<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
   	<script src="${pageContext.request.contextPath}/bootstrapValidator/bootstrapValidator.min.js"></script>

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
									<li><a href="javascript:;">开户</a></li>
								</ul>
							</div>
							<jsp:include page="currentUser.jsp"></jsp:include>
							<div class="clearfix"></div>
						</div>
						
					</div>
					<div class="clearfix"></div>
				</div>
				<!-- content -->
				<div class="content">
					<div class="monthly-grid">
						<div class="panel-widget">
							<div class="panel panel-title">开户信息</div>
							<div class="panel-body">
								<div class="content-user">
									<form class="form-horizontal openForm">
										<div class="col-sm-6">
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">卡号<span class="text-muted">*</span></label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" placeholder="" name="num" data-bv-trigger="blur" data-bv-message="卡号不能为空" required data-bv-notempty-message="长号不能为空">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label" id="uiIdcardNumber">身份证号</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" name="uiIdcardNumber" placeholder="" data-bv-trigger="blur" data-bv-message="身份证号不能为空" required data-bv-notempty-message="身份证号不能为空">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">年龄</label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" placeholder="">
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">婚姻</label>
												<div class="col-sm-8">
													<select class="form-control">
														<option>未婚</option>
														<option>已婚</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">开户人</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" placeholder="">
												</div>
											</div>
										</div>

										<div class="col-sm-6">
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">姓名<span class="text-muted">*</span></label>
												<div class="col-sm-8">
													<input type="text" class="form-control" name="username" data-bv-trigger="blur" data-bv-message="姓名不能为空" required data-bv-notempty-message="姓名不能为空" />
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">电话<span class="text-muted">*</span></label>
												<div class="col-sm-8">
													<input type="tel" class="form-control" name="phone"  data-bv-trigger="blur" data-bv-message="电话不能为空" required data-bv-notempty-message="电话不能为空"/>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">性别</label>
												<div class="col-sm-8">
													<select class="form-control">
														<option>男</option>
														<option>女</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label for="" class="col-sm-4 control-label">住址</label>
												<div class="col-sm-8">
													<input type="text" class="form-control" placeholder="">
												</div>
											</div>
										</div>

										<div class="col-sm-12 text-center btnOpen">
											<button type="button" class="btn btn-info" id="validateBtn">开户</button>
											<button type="button" class="btn btn-default" id="resetBtn">重置</button>
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
		<jsp:include page="menu.jsp"></jsp:include>
	  	<div class="clearfix"></div>	

	</div>


	<!-- demo -->
   	<script type="text/javascript" src='${pageContext.request.contextPath}/js/js.js'></script>

	<script>
		$(function(){
			// 验证身份证号和手机号
			$('.openForm').bootstrapValidator({
		　   	message: 'This value is not valid',
		        feedbackIcons: {
		            valid: 'glyphicon glyphicon-ok',
		            invalid: 'glyphicon glyphicon-remove',
		            validating: 'glyphicon glyphicon-refresh'
		        },
	            fields: {
				    phone:{
					    validators:{
					      	notEmpty:{
						       	message:'手机号码不能为空'
					      	},
					      	stringlength:{
					       		min: 11,
					      		max: 11,
					       		message:'请输入11位手机号码'
					      	},
					      	regexp:{
					       		regexp:/^1[3|5|8]{1}[0-9]{9}$/,
					       		message:'请输入正确的手机号码'
					      	}
					    }
				    },
	                uiIdcardNumber: {
	                    message:'身份证验证失败',
	                    validators: {
	                        notEmpty: {
	                            message: '身份证不能为空'
	                        },
	                        stringLength: {
	                            min: 18,
	                            max: 18,
	                            message: '请输入18位身份证号码'
	                        },
	                        regexp: {
	                            regexp: /^[1-9]{1}[0-9]{16}[xX1-9]{1}$/,
	                            message: '请输入正确的身份证号码'
	                        }
	                    }
	                }
	           	}
	        });
		    // 开户
		    $('#validateBtn').click(function() {
		        $('.openForm').bootstrapValidator('validate');
		    });
			// 重置
		    $('#resetBtn').click(function() {
		        $('.openForm').data('bootstrapValidator').resetForm(true);
		    });
	    });

	</script>

</body>
</html>