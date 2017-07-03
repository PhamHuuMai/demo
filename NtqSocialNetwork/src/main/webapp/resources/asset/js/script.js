$(document).ready(function() {
	$('#toTop').click(function(event) {
		event.preventDefault();
		$('html, body').animate({scrollTop: 0},500)
	});
});
$(window).scroll(function() {
	var hTop = $(this).scrollTop();
	if(hTop > 200) {
		$('#toTop').stop().animate({right:'10px'},1000);
	}else {$('#toTop').stop().animate({right:'-50px'},1000);}
});

