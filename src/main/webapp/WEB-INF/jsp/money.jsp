<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
	<title>医疗系统</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<link href="bootstrap/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
	<link href="bootstrapValidator/bootstrapValidator.min.css" rel='stylesheet' type='text/css' />
	<link href="css/font-awesome.css" rel="stylesheet">

	<link href="css/style.css" rel='stylesheet' type='text/css' />
	
	<script src="js/jquery-1.10.2.min.js"></script>
   	<script src="bootstrap/js/bootstrap.min.js"></script>
   	<script src="bootstrapValidator/bootstrapValidator.min.js"></script>

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
						<li class="active"><a href="money.html" title="财务统计"><i class="fa fa-cny"></i> <span>财务统计</span></a></li>
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

	<!-- demo -->
   	<script type="text/javascript" src='js/js.js'></script>
   	<!-- 柱形图 -->
   	<script type="text/javascript" src="js/echarts/echarts.min.js"></script>
    <script type="text/javascript" src="js/echarts/echarts-gl.min.js"></script>
    <script type="text/javascript" src="js/echarts/ecStat.min.js"></script>
    <script type="text/javascript" src="js/echarts/dataTool.min.js"></script>
    <script type="text/javascript" src="js/echarts/china.js"></script>
    <script type="text/javascript" src="js/echarts/world.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=ZUONbpqGBsYGXNIYHicvbAbM"></script>
    <script type="text/javascript" src="js/echarts/bmap.min.js"></script>
    <script type="text/javascript" src="js/echarts/simplex.js"></script>
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