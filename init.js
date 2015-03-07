$(document).ready(function(){
	$("h3").css("background-color","green");
	var $dl = $("h1").next().find("dl").first().attr("id", "dl");
//	var $dl = $("#dl");	
	$dl.find("h3").next().hide();
	$dl.find("h3").click(function(){
		var that = this;
		$dl.find("h3").each(function(){
			if(that != this){  //防止关闭自身时出现“先关闭又打开”的情况
				$(this).next().slideUp();	
			}
		});
		$(this).next().slideToggle();
	});
	//为<a>添加target=blank
	$("a").attr("target", "_blank");
	//
	$("h3").mouseout(function(){
			$(this).css("background-color","red");
	});
	$("h3").mouseover(function(){
			$(this).css("background-color","green");
	});
});
