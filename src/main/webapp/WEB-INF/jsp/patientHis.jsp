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
									<li><a href="javascript:;">病历管理</a></li>|
									<li><a href="javascript:;">历史病历</a></li>
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
							<div class="panel panel-title">历史病历</div>
							<div class="panel-body">
								<div class="tableBox">
									<div class="searchList">
										<div class="searchType ">
											<label>卡号</label>
											<c:choose>
												<c:when test="${icCardNum != null && icCardNum != ''}">		
													<input type="text" name="" value="${icCardNum }" class="form-control" id="icCardNumC">
												</c:when>
												<c:otherwise>
													<input type="text" name="" value="" class="form-control" id="icCardNumC">
												</c:otherwise>
											</c:choose>
										</div>
										<div class="searchType"><button type="button" class="btn btn-info btn-sm" id="selectBtn">精确查询</button></div>
									</div>
									<div class="cf col-sm-12">
										<c:choose>
											<c:when test="${msgDTO.data.pageInfo.list != null && fn:length(msgDTO.data.pageInfo.list) gt 0}">
												<c:forEach items="${msgDTO.data.pageInfo.list}" var="it" varStatus="idx">
													
													<div class="col-sm-4">
														<a href="<%=basePath%>/mere/getMeRe.abc?id=${it.id}" class="col-sm-12">
															<h4>病历${idx.index+1}-${it.paname}</h4>
															<h5>时间<input type="text" name="" 
																	value="<fmt:formatDate value="${it.createtime}" pattern="yyyy.MM.dd HH:mm:ss"/>" 
																	placeholder="" disabled="disabled"></h5>
															<h5>医师<input type="text" name="" value="${it.physician}" placeholder="" disabled="disabled"></h5>
														</a>
													</div>
												</c:forEach>
											</c:when>
											<c:otherwise>
												<div class="col-sm-4">
													<h4>没有病历</h4>
												</div>
											</c:otherwise>
										</c:choose>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<c:choose>
								<c:when test="${msgDTO.data.pageInfo.list != null && fn:length(msgDTO.data.pageInfo.list) gt 0}">
								<c:set var="pageInfo" value="${msgDTO.data.pageInfo}"></c:set>
							    <div class="col-md-6">共有${pageInfo.total}条数据,共有${pageInfo.pages}页</div>
							    	<ul class="pagination">
								        <c:if test="${!pageInfo.isFirstPage}">
								            <li><a href="javascript:queryDeviceRecords(${pageInfo.firstPage});">首页</a></li>
								            <li><a href="javascript:queryDeviceRecords(${pageInfo.prePage});">上一页</a></li>
								        </c:if>
								        <c:forEach items="${pageInfo.navigatepageNums}" var="navigatepageNum">
								        
								            <c:if test="${navigatepageNum==pageInfo.pageNum}">
								                <li class="active"><a href="javascript:queryAllDevices(${navigatepageNum});">${navigatepageNum}</a></li>
								            </c:if>
								            <c:if test="${navigatepageNum!=pageInfo.pageNum}">
								                <li><a href="javascript:queryDeviceRecords(${navigatepageNum});">${navigatepageNum}</a></li>
								            </c:if>
								        </c:forEach>
								        <c:if test="${!pageInfo.isLastPage}">
								            <li><a href="javascript:queryDeviceRecords(${pageInfo.nextPage});">下一页</a></li>
								            <li><a href="javascript:queryDeviceRecords(${pageInfo.lastPage});">最后一页</a></li>
								        </c:if>
								    </ul>
							    </div>
						    	</c:when>
									<c:otherwise>
									
									</c:otherwise>
								</c:choose>
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
		//查询卡号病历
         $('#selectBtn').on('click', function(){
        	var icCardNumC = $('#icCardNumC').val();
        	window.location.href="<%=basePath%>/mere/list.abc?icCardNum="+icCardNumC;
		});
	});
	function queryDeviceRecords(pageNum) {
		var icCardNumC = $('#icCardNumC').val();
		window.location.href="<%=basePath%>/mere/list.abc?icCardNum="+icCardNumC+"&pageno=" + pageNum;
    }
	</script>

</body>
</html>