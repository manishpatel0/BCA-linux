function fn60sec() {
	var pname=$('#pagename').val();	
	$.ajax({
		type:'post',
		url:mainEncode+'ajax_cookie.php',
		success:function(data)
		{
			 
			if(data==1)
			{
				
					$('#coockieCheckDiv').css('display','block');
					$('#fade').css('display','block');
						$("#msgdata").css('display','block');
						$("#msgdata1").css('display','none');
				
			}
			else if(data==2)
			{
				
				$('#coockieCheckDiv').css('display','block');
					$('#fade').css('display','block');
					$("#msgdata1").css('display','block');
						$("#msgdata").css('display','none');
			}
			
		}
	});
}
/*fn60sec();
setInterval(fn60sec, 60*1000);*/
