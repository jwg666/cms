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
<link rel="stylesheet" href="../resources/img/ui/index.css">

<script src="../resources/js/jquery-1.8.3.min.js"></script>
<script src="../resources/js/HoorayLibs/hooraylibs.js"></script>
<script src="../resources/js/Validform_v5.3/Validform_v5.3_min.js"></script>
<script>
$(function(){
	//IE6,7升级提示
	if($.browser.msie && $.browser.version < 8){
		if($.browser.version < 7){
			//虽然不支持IE6，但还是得修复PNG图片透明的问题             
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
	$('#regiter_btn').click(function(){
		$('#loginForm').hide();
		$('#registerForm').show();
	});
	$('#backToLogin_btn').click(function(){
		$('#registerForm').hide();
		$('#loginForm').show();
	});
	var dropdownReset = function(){
		$('#dropdown_btn').removeClass('checked');
		$('#dropdown_list').fadeOut();
	};
	$(document).click(function(){
		dropdownReset();
	});
	$('#dropdown_btn').click(function(){
		$(this).addClass('checked');
		$('#dropdown_list').fadeIn();
		return false;
	});
	$('#rememberPswd').click(function(){
		if($(this).attr('checked') !== 'checked'){
			$('#autoLogin').attr('checked', false);
		}
	});
	$('#autoLogin').click(function(){
		if($(this).attr('checked') === 'checked'){
			$('#rememberPswd').attr('checked', true);
		}
	});
	//下拉列表选择用户
	$('#dropdown_list').on('click', '.user', function(){
		var id = $(this).attr('data-id');
		var userlist = $.parseJSON($.cookie('userlist'));
		$(userlist).each(function(){
			if(this.id == id){
				$('#avatar').attr('src', this.avatar);
				$('#username').val(this.username);
				$('#password').val(this.password);
				$('#rememberPswd').prop('checked', this.rememberPswd ? true : false);
				$('#autoLogin').prop('checked', this.autoLogin ? true : false);
				return false;
			}
		});
	});
	//下拉列表删除用户
	$('#dropdown_list').on('click', '.del', function(){
		var id = $(this).parents('.user').attr('data-id');
		var userlist = $.parseJSON($.cookie('userlist'));
		$(userlist).each(function(i){
			if(this.id == id){
				userlist.splice(i, 1);
				return false;
			}
		});
		$.cookie('userlist', $.toJSON(userlist), {expires : 365});
		if($.parseJSON($.cookie('userlist')) == ''){
			$('#dropdown_btn').hide();
			$('#dropdown_list').hide();
		}
		$(this).parents('.user').remove();
		return false;
	});
	//表单登录初始化
	var loginForm = $('#loginForm').Validform({
		btnSubmit: '#submit_login_btn',
		postonce: false,
		showAllError: false,
		tipSweep: true,
		//msg：提示信息;
		//o:{obj:*,type:*,curform:*}, obj指向的是当前验证的表单元素（或表单对象），type指示提示的状态，值为1、2、3、4， 1：正在检测/提交数据，2：通过验证，3：验证失败，4：提示ignore状态, curform为当前form对象;
		//cssctl:内置的提示信息样式控制函数，该函数需传入两个参数：显示提示信息的对象 和 当前提示的状态（既形参o中的type）;
		tiptype: function(msg, o){
			if(!o.obj.is('form')){//验证表单元素时o.obj为该表单元素，全部验证通过提交表单时o.obj为该表单对象;
				var B = o.obj.parent('.input_box').children('.tip');
				var T = B.find('p');
				if(o.type == 2){
					B.hide();
					T.text('');
				}else{
					B.show();
					T.text(msg);
				}
			}
		},
		ajaxPost: true,
		beforeSubmit: function(){
			$('#submit_login_btn').addClass('disabled').prop('disabled', true);
		},
		callback: function(data){
			$('#submit_login_btn').removeClass('disabled').prop('disabled', false);
			if(data.status == 'y'){
				location.href = '../portal/index';
			}else{
				alert('登录失败，请检查用户名或密码是否正确');
			}
		}
	});
	//初始化登录用户列表
	
	//表单注册初始化
	var registerForm = $('#registerForm').Validform({
		btnSubmit: '#submit_register_btn',
		postonce: true,
		showAllError: false,
		tipSweep: true,
		//msg：提示信息;
		//o:{obj:*,type:*,curform:*}, obj指向的是当前验证的表单元素（或表单对象），type指示提示的状态，值为1、2、3、4， 1：正在检测/提交数据，2：通过验证，3：验证失败，4：提示ignore状态, curform为当前form对象;
		//cssctl:内置的提示信息样式控制函数，该函数需传入两个参数：显示提示信息的对象 和 当前提示的状态（既形参o中的type）;
		tiptype: function(msg, o){
			if(!o.obj.is('form')){//验证表单元素时o.obj为该表单元素，全部验证通过提交表单时o.obj为该表单对象;
				var B = o.obj.parent('.input_box').children('.tip');
				var T = B.find('p');
				if(o.type == 2){
					B.hide();
					T.text('');
				}else{
					B.show();
					T.text(msg);
				}
			}
		},
		ajaxPost: true,
		beforeSubmit: function(){
			$('#submit_register_btn').addClass('disabled').prop('disabled', true);
		},
		callback: function(data){
			$('#submit_register_btn').removeClass('disabled').prop('disabled', false);
			registerForm.resetStatus();
			if(data.status == 'y'){
				$('#registerForm').hide();
				$('#loginForm').show();
				$('#avatar').attr('src', '../resources/img/ui/avatar_120.jpg');
				$('#username').val(data.info);
				$('#password').val('');
				$('#rememberPswd, #autoLogin').prop('checked', false);
				$('#reg_username, #reg_password, #reg_checkpassword').val('');
			}else{
				alert('注册失败');
			}
		}
	});
	$('.loading').fadeOut(750, function(){
		$('.login').fadeIn(750);
	});
});
</script>
</head>

<body>
<div class="loginmask"></div>
<div class="loading"></div>
<div class="login">
	<div class="loginbox">
		<div class="top">
			登录
		</div>
		<form action="login" method="post" id="loginForm">
			<div class="middle"> 
				<div class="left">
					<img src="../resources/img/ui/avatar_120.jpg" id="avatar">
				</div>
				<div class="right">
					<div class="input_box username">
						<input type="input" name="username" id="username" autocomplete="off" placeholder="请输入用户名" tabindex="1" datatype="s6-18" nullmsg="请您输入用户名后再登录" errormsg="用户名长度为6-18个字符">
						<a href="javascript:;" class="down" id="dropdown_btn"></a>
						<div class="tip">
							<div class="text">
								<span class="arrow">◆</span>
								<span class="arrow arrow1">◆</span>
								<p></p>
							</div>
						</div> 
						<button type="button" id="regiter_btn">注册账号</button>
						<div class="dropdown" id="dropdown_list"></div>
					</div>
					<div class="input_box password">
						<input type="password" name="password" id="password" placeholder="请输入密码" tabindex="2" datatype="*6-18" nullmsg="请您输入密码后再登录" errormsg="密码长度在6~18位之间">
						<div class="tip">
							<div class="text">
								<span class="arrow">◆</span>
								<span class="arrow arrow1">◆</span>
								<p></p>
							</div>
						</div> 
						<label><input type="checkbox" name="rememberPswd" id="rememberPswd">记住密码</label>
						<label style="left:100px"><input type="checkbox" name="autoLogin" id="autoLogin">自动登录</label>
					</div>
				</div>
			</div>
			<div class="bottom">
				<button type="submit" id="submit_login_btn" tabindex="3">登　　录</button>
			</div>
		</form>
		<form action="ajax.php" method="post" id="registerForm" style="display:none">
			<input type="hidden" name="ac" value="register">
			<div class="middle"> 
				<div class="right all">
					<div class="input_box username">
						<input type="input" name="reg_username" id="reg_username" autocomplete="off" placeholder="请输入用户名" tabindex="1" datatype="s6-18" ajaxurl="ajax?ac=checkUsername" nullmsg="请输入用户名" errormsg="用户名长度为6-18个字符">
						<div class="tip">
							<div class="text">
								<span class="arrow">◆</span>
								<span class="arrow arrow1">◆</span>
								<p></p>
							</div>
						</div> 
						<button type="button" id="backToLogin_btn">返回登录</button>
					</div>
					<div class="input_box password">
						<input type="password" name="reg_password" id="reg_password" placeholder="请输入密码" tabindex="2" datatype="*6-18" nullmsg="请输入密码" errormsg="密码长度在6~18位之间">
						<div class="tip">
							<div class="text">
								<span class="arrow">◆</span>
								<span class="arrow arrow1">◆</span>
								<p></p>
							</div>
						</div> 
					</div>
					<div class="input_box password">
						<input type="password" name="reg_checkpassword" id="reg_checkpassword" placeholder="请确认密码" tabindex="3" datatype="*" recheck="reg_password" nullmsg="请再输入一次密码" errormsg="两次输入的密码不一致">
						<div class="tip">
							<div class="text">
								<span class="arrow">◆</span>
								<span class="arrow arrow1">◆</span>
								<p></p>
							</div>
						</div> 
					</div>
				</div>
			</div>
			<div class="bottom" style="margin-top:100px">
				<button type="submit" id="submit_register_btn" tabindex="4">注　　册</button>
			</div>
		</form>
	</div>
</div>


</body>
</html>