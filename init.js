$(document).ready(function(){
	var $dl = $("#dl");	
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
});
