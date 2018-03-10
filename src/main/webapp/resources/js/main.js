$(document).ready(function() {
	$('.main-container').css({ opacity: '1'});
});

$('#audioSlider').slider({
    orientation: "vertical",
    value: audio1.volume,
    min: 0,
    max: 1,
    range: 'min',
    animate: true,
    step: .1,
    slide: function(e, ui) {
        audio1.volume = ui.value;
        $('.user-action-sound').html(ui.value*100+'%');
    }
});



$('#registration-link').click(function(){
	ajax('registration', 'GET', null);
});

$('.user-action-sound').live('hover',function(){
	$('#audioSlider').animate({ opacity: '1'},500);
	
});

$('.user-action-bar').live('mouseleave',function(){
	$('#audioSlider').animate({ opacity: '0'},500);
	
});

$('.list-content-item').live('click',function(){
	$('.list-content-item').removeClass('list-content-item-selected');
	$(this).addClass('list-content-item-selected');
	
});

$('#close-dialog-button').live('click',function(){
	$('.main-container').css({ opacity: '1'});
	$('#new-game-dialog').animate({ opacity: '0'},666);
	$('.dialogs-wrapper').hide();
	$('#new-game-dialog').hide();
});

$('#create-game-button').click(function(){
	$('.main-container').css({ opacity: '0.4'});
	$('.dialogs-wrapper').show();
	$('#new-game-dialog').show();
	$('#new-game-dialog').animate({ opacity: '1'},666);
});


function ajax(url, method, data){
	$.ajax({
	  type: method,
	  url: url,
	  data: data,
	}).done(function( mdata ) {
	$('#main-container-wrapper').empty();
	$('#main-container-wrapper').append(data);
	});
};
