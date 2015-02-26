$(document).ready(function(){
	var $dl = $("#dl");	
	$dl.find("h3").next().hide();
	$dl.find("h3").click(function(){
		$(this).next().slideToggle();
	});
});

