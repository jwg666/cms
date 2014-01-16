<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<!-- IE=edge告诉IE使用最新的引擎渲染网页，chrome=1则可以激活Chrome Frame -->
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>登录</title>
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="../resources/img/ui/index.css?v=120615">

<script src="../resources/js/jquery-1.8.1.min.js"></script>
<script src="../resources/js/HoorayLibs/hooraylibs.js"></script>

<script>
$(document).ready(function(){
	setTimeout(function(){$('#value_1').val('').focus()}, 500);
	//IE6升级提示
	if($.browser.msie && $.browser.version < 8){
		if($.browser.version < 7){
			DD_belatedPNG.fix('.update_browser .browser');
		}
		$('.login').html('<div class="update_browser">'+
			'<div class="subtitle">您正在使用的IE浏览器版本过低，<br>我们建议您升级或者更换浏览器，以便体验顺畅、兼容、安全的互联网。</div>'+
			'<div class="title">选择一款<span>新</span>浏览器吧</div>'+
			'<div class="browser">'+
				'<a href="http://windows.microsoft.com/zh-CN/internet-explorer/downloads/ie" class="ie" target="_blank" title="ie浏览器">ie浏览器</a>'+
				'<a href="http://www.google.cn/chrome/intl/zh-CN/landing_chrome.html" class="chrome" target="_blank" title="谷歌浏览器">谷歌浏览器</a>'+
				'<a href="http://www.firefox.com.cn" class="firefox" target="_blank" title="火狐浏览器">火狐浏览器</a>'+
				'<a href="http://www.opera.com" class="opera" target="_blank" title="opera浏览器">opera浏览器</a>'+
				'<a href="http://www.apple.com.cn/safari" class="safari" target="_blank" title="safari浏览器">safari浏览器</a>'+
			'</div>'+
			'<div class="bottomtitle">[&nbsp;<a href="http://www.theie6countdown.cn" target="_blank">对IE6说再见</a>&nbsp;]</div>'+
		'</div>');
	}

	$(".input .log").bind("keyup",function(e){
		if(e.keyCode == 13){$('.log .submit').click();}
	});


	$('#value_1,#value_2').placeholder({labelMode:true,labelStyle:{left:8,top:3,fontSize:'14px'},labelAlpha:true,labelAcross:true});
	$('.log .submit').click(function(){
		if($('#value_1').val()!="" && $('#value_2').val()!=""){
			$('.log .submit').hide();
			$('.log .check').show();
			$('.log .tip').text('').hide();
			$.ajax({
				type:'POST',
				url:'login',
				data:'username='+$('#value_1').val()+'&password='+$('#value_2').val(),
				dataType :'json',
				success:function(msg){
					$('.log .submit').show();
					$('.log .check').hide();
					//alert(msg);
					if(msg.success){
						$('.loading').hide();
						$('.loginmask').fadeIn(500,function(){
							location.href = '../portal/index';
						});
					}else{
						$('.log .tip').text('用户名或密码错误').show();
					}
				}
			});
		}
	});
	
	$('.loading').fadeOut(500);
	$('.login').show();
});
</script>
</head>

<body>
<!-- 登入界面 -->
<div class="loginmask"></div>
<div class="loading"></div>
<div class="login">
	<div class="logo"></div>
	<div class="input">
		<div class="log">
			<div class="name">
			<input type="text" id="value_1" placeholder="用户名" name="value_1" tabindex="1">
			<!-- <a class="btn" href="javascript:;" style="position:absolute;right:-45px;color:#FFF;width:40px;height:30px;line-height:30px">
			注册
			</a> -->
			</div>
			<div class="pwd">
				<input type="password" id="value_2" placeholder="密码" name="value_2" tabindex="2">
				<input type="button" class="submit" tabindex="3">
				<div class="check"></div>
			</div>
			<div class="tip">
			</div>
		</div>
		<!-- <div class="reg disn">
			<div class="name"><input type="text" id="reg_1" placeholder="用户名" name="reg_1" tabindex="1"><a class="btn" href="javascript:;" style="position:absolute;left:-45px;color:#FFF;width:40px;height:30px;line-height:30px">返回</a></div>
			<div class="pwd"><input type="password" id="reg_2" placeholder="密码" name="reg_2" tabindex="2"></div>
			<div class="pwd"><input type="password" id="reg_3" placeholder="确认密码" name="reg_3" tabindex="3"><input type="button" class="submit" tabindex="4"><div class="check"></div></div>
			<div class="tip"></div>
		</div> -->
	</div>
</div>


</body>
</html>