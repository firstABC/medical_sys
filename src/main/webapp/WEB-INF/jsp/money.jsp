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
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<link href="<%=basePath %>/bootstrap/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
	<link href="<%=basePath %>/bootstrapValidator/bootstrapValidator.min.css" rel='stylesheet' type='text/css' />
	<link href="<%=basePath %>/css/font-awesome.css" rel="stylesheet">

	<link href="<%=basePath %>/css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="<%=basePath %>/js/jquery-1.10.2.min.js"></script>
   	<script src="<%=basePath %>/bootstrap/js/bootstrap.min.js"></script>
   	<script src="<%=basePath %>/bootstrapValidator/bootstrapValidator.min.js"></script>

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
									<li><a href="javascript:;">财务统计</a></li>
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
							<div class="panel panel-title">财务统计</div>
							<div class="panel-body">
								<div class="tableBox tableDrug">

									<div class="searchList listDrug">
										<div class="searchType searchType2">
											<label>日期</label>
											<input type="date" name="" value="" class="form-control"> - <input type="date" name="" value="" class="form-control">
										</div>
										<div class="searchType"><button type="button" class="btn btn-info btn-sm">查询</button></div>
									</div>
									<!-- 柱形图 -->
									<div id="ech"></div>

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
   	<script type="text/javascript" src='<%=basePath %>/js/js.js'></script>
   	<!-- 柱形图 -->
   	<script type="text/javascript" src="<%=basePath %>/js/echarts/echarts.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/js/echarts/echarts-gl.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/js/echarts/ecStat.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/js/echarts/dataTool.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/js/echarts/china.js"></script>
    <script type="text/javascript" src="<%=basePath %>/js/echarts/world.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=ZUONbpqGBsYGXNIYHicvbAbM"></script>
    <script type="text/javascript" src="<%=basePath %>/js/echarts/bmap.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/js/echarts/simplex.js"></script>
    <script type="text/javascript">
        var dom = document.getElementById("ech");
        var myChart = echarts.init(dom);
	  	var app = {};
	  	option = null;
	 	option = {
	 		color: ['rgba(3,169,244,.7)'],
	      	title: {
	          	text: '',
	      	},
	      	tooltip : {
	          	trigger: 'axis',
	          	axisPointer : {            // 坐标轴指示器，坐标轴触发有效
	              type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
	          	},
	          	formatter: function (params) {
	              	var tar = params[1];
	              	return tar.name + '<br/>' + tar.seriesName + ' : ' + tar.value;
	          	}
	      },
	     	xAxis: {
	          	type : 'category',
	          	splitLine: {show: false},
	          	data : ['总费用','充值','药品收入','开户收入','销户支出']
	      	},
	      yAxis: {
	          type : 'value'
	      },
	      series: [
	          {
	              type: 'bar',
	              stack:  '总量',
	              itemStyle: {
	                  normal: {
	                      barBorderColor: 'rgba(0,0,0,0)',
	                      color: 'rgba(0,0,0,0)'
	                  },
	                  emphasis: {
	                      barBorderColor: 'rgba(0,0,0,0)',
	                      color: 'rgba(0,0,0,0)'
	                  }
	              },
	              data: [0, 0, 0, 0, 0]
	          },
	          {
	              name: '财务统计',
	              type: 'bar',
	              stack: '总量',
	              label: {
	                  normal: {
	                      show: true,
	                      position: 'inside'
	                  }
	              },
	              data:[2100, 2000, 300, 200, 400]
	          }
	      ]
	  };
	  ;
        if (option && typeof option === "object") {
            myChart.setOption(option, true);
        }
   </script>
</body>
</html>