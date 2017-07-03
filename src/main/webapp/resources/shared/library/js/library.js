var fc_thumb, fc_thumb_src;
$(document).ready(function(){

	// tạo background cho ảnh
	if($('.fc-thumb').length){
		$('.fc-thumb').each(function(){
			fc_thumb = $(this);
			fc_thumb_src = fc_thumb.children('img').attr('src');
			fc_thumb.attr('style', 'background-image:url('+fc_thumb_src+')');
			fc_thumb_src = fc_thumb.children('img').css({'display': 'none'});
		});
	}

    $('#edit-button').click(function(){
		$('#body-2 .myprofile-form .input').addClass("border");
		$('#body-2 .myprofile-form select').addClass("border");
		$('#body-2 .myprofile-form .input').prop("disabled", false);
		$('#body-2 .myprofile-form select').prop("disabled", false);
		$('#body-2 .myprofile-form .input-password').show();
		$('#body-2 .myprofile-form #edit-button').hide();
		$('#body-2 .myprofile-form #save-button').show();
		$('#cancel-button').show();
    });
    
    $('#cancel-button').click(function(){
		$('#body-2 .myprofile-form .input').removeClass("border");
		$('#body-2 .myprofile-form select').removeClass("border");
		$('#body-2 .myprofile-form .input').prop("disabled", true);
		$('#body-2 .myprofile-form select').prop("disabled", true);
		$('#body-2 .myprofile-form #edit-button').show();
		$('#body-2 .myprofile-form #save-button').hide();
		$('#body-2 .myprofile-form .input-password').hide();
		$(this).hide();
    });
});