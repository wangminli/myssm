$(document).ready(function(){
	var $dl = $("#dl");	
	$dl.find("h3").next().hide();
	$dl.find("h3").click(function(){
		$(this).next().addClass(".clicked");
		$dl.find("h3").next().each(function(){
			if(!$(this).hasClass("clicked")){
				$(this).next().slideUp();
			};
		});
		$(this).next().slideToggle();
		$(this).next().removeClass(".clicked");
	});
});
