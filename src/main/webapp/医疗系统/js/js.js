// 当前时间
setInterval(function() {
    var now = (new Date()).toLocaleString();
    $('.current-time').text(now);
}, 1000);

// sidebar-menu
var toggle = true;		
$(".sidebar-icon").click(function() {                
  	if (toggle) {
		$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
		$("#menu span").css({"position":"absolute"});
  	}
  	else {
		$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
		setTimeout(function() {
		  $("#menu span").css({"position":"relative"});
		}, 400);
  	}		
	toggle = !toggle;
});