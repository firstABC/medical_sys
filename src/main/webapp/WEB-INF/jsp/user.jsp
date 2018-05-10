<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.User" %>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.lang.String" %>
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
									<li><a href="javascript:;">权限管理</a></li>|
									<li><a href="javascript:;">用户管理</a></li>
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
							<div class="panel panel-title">用户管理</div>
							<div class="panel-body">
								<div class="tableBox">
									<div class="searchList">
										<div class="searchType">
											<label>用户名</label>
											<input type="text" name="" value="" class="form-control">
										</div>
										<div class="searchType"><button type="button" class="btn btn-info btn-sm">搜索</button></div>
										<div class="cx fr"><button type="button" class="btn btn-info btn-sm" onclick="window.location.href='<%=basePath%>/switch/addUser.abc'">新增</button></div>
									</div>

									<table class="table-bordered table-striped table-hover" id="table" width="100%" border="0" cellspacing="0" cellpadding="2">
						    			<thead>
				                            <tr>
				                                <th>账号</th>
				                                <th>创建时间</th>
				                                <th>最后登录时间</th>
				                                <th>状态</th>
				                                <th>操作</th>
				                            </tr>
				                        </thead>
				                        <tbody>
				                        <%
				                        	List<User> ltUser = (List<User>)request.getAttribute("ltUser");
				                        	if(ltUser!=null){
				                        		for(User user:ltUser){
				                        			SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				                        			Date createTime = user.getCreatetime();
				                        			String createTimeStr =createTime==null?"":dateFormater.format(createTime);
				                        			Date lastTime = user.getLasttime();
				                        			String lastTimeStr =lastTime==null?"":dateFormater.format(lastTime);
				                        %>			
				                        	<tr>
								                <td><%=user.getUseraccount() %></td>
								                <td><%=createTimeStr %></td>
								                <td><%=lastTimeStr %></td>
								                <td><%="A".equals(user.getStatus())?"正常":"冻结" %></td>
								                <td>
								                	<a href="javascript:;">编辑</a>
								                </td>
				                        	</tr>
				                         <%
				                        		}
				                        	}
				                        %>
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


	    });
	</script>
</body>
</html>