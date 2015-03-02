$(document).ready(function(){
	var $dl = $("#dl");	
	$dl.find("h3").next().hide();
	$dl.find("h3").click(function(){
		$(this).next().addClass(".clicked");
		var $other = $dl.find("h3").next().not(".clicked");
		$other.slideUp();
		$(this).next().slideToggle();
		$(this).next().removeClass(".clicked");
	});
});

