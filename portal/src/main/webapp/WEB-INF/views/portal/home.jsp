<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<!-- IE=edge告诉IE使用最新的引擎渲染网页，chrome=1则可以激活Chrome Frame -->
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>桌面</title>
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="../resources/js/HoorayLibs/hooraylibs.css?v=2.0">
<link rel="stylesheet" href="../resources/img/ui/index.css?v=2.0">
<link rel="stylesheet" href="../resources/img/skins/default.css?v=2.0" id="window-skin">
</head>

<body>
<div class="loading"></div>
<!-- 桌面 -->
<div id="desktop">
	<div id="zoom-tip"><div><i>​</i>​<span></span></div><a href="javascript:;" class="close" onClick="HROS.zoom.close();">×</a></div>
	<div id="desk">
		<div id="desk-1" class="desktop-container"><div class="scrollbar scrollbar-x"></div><div class="scrollbar scrollbar-y"></div></div>
		<div id="desk-2" class="desktop-container"><div class="scrollbar scrollbar-x"></div><div class="scrollbar scrollbar-y"></div></div>
		<div id="desk-3" class="desktop-container"><div class="scrollbar scrollbar-x"></div><div class="scrollbar scrollbar-y"></div></div>
		<div id="desk-4" class="desktop-container"><div class="scrollbar scrollbar-x"></div><div class="scrollbar scrollbar-y"></div></div>
		<div id="desk-5" class="desktop-container"><div class="scrollbar scrollbar-x"></div><div class="scrollbar scrollbar-y"></div></div>
		<div id="dock-bar">
			<div id="dock-container">
				<div class="dock-middle">
					<div class="dock-applist"></div>
					<div class="dock-toollist">
						<a href="javascript:;" class="dock-tool-pinyin" title="QQ拼音输入法"></a>
						<a href="javascript:;" class="dock-tool-style" title="主题设置"></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="task-bar-bg1"></div>
	<div id="task-bar-bg2"></div>
	<div id="task-bar">
		<div id="task-next"><a href="javascript:;" id="task-next-btn" hidefocus="true"></a></div>
		<div id="task-content">
			<div id="task-content-inner"></div>
		</div>
		<div id="task-pre"><a href="javascript:;" id="task-pre-btn" hidefocus="true"></a></div>
	</div>
	<div id="nav-bar">
		<div class="nav-wrapper">
			<div class="nav-container nav-current-1" id="navContainer">
				<div class="indicator indicator-header" id="navbarHeaderImg"><img src="../resources/img/ui/avatar.png" class="indicator-header-img"></div>
				<a class="indicator indicator-1" href="javascript:;" index="1" title="桌面1">
					<span class="indicator-icon-bg"></span>
					<span class="indicator-icon indicator-icon-1">1</span>
				</a>
				<a class="indicator indicator-2" href="javascript:;" index="2" title="桌面2">
					<span class="indicator-icon-bg"></span>
					<span class="indicator-icon indicator-icon-2">2</span>
				</a>
				<a class="indicator indicator-3" href="javascript:;" index="3" title="桌面3">
					<span class="indicator-icon-bg"></span>
					<span class="indicator-icon indicator-icon-3">3</span>
				</a>
				<a class="indicator indicator-4" href="javascript:;" index="4" title="桌面4">
					<span class="indicator-icon-bg"></span>
					<span class="indicator-icon indicator-icon-4">4</span>
				</a>
				<a class="indicator indicator-5" href="javascript:;" index="5" title="桌面5">
					<span class="indicator-icon-bg"></span>
					<span class="indicator-icon indicator-icon-5">5</span>
				</a>
				<a class="indicator indicator-manage" href="javascript:;" title="全局视图"></a>
			</div>
		</div>
	</div>
</div>
<!-- 全局视图 -->
<div id="appmanage">
	<a class="amg_close" href="javascript:;"></a>
	<div id="amg_dock_container"></div>
	<div class="amg_line_x"></div>
	<div id="amg_folder_container">
		<div class="folderItem">
			<div class="folder_bg folder_bg1"></div>
			<div class="folderOuter">
				<div class="folderInner"></div>
				<div class="scrollBar"></div>
			</div>
		</div>
		<div class="folderItem">
			<div class="folder_bg folder_bg2"></div>
			<div class="folderOuter">
				<div class="folderInner"></div>
				<div class="scrollBar"></div>
			</div>
			<div class="amg_line_y"></div>
		</div>
		<div class="folderItem">
			<div class="folder_bg folder_bg3"></div>
			<div class="folderOuter">
				<div class="folderInner"></div>
				<div class="scrollBar"></div>
			</div>
			<div class="amg_line_y"></div>
		</div>
		<div class="folderItem">
			<div class="folder_bg folder_bg4"></div>
			<div class="folderOuter">
				<div class="folderInner"></div>
				<div class="scrollBar"></div>
			</div>
			<div class="amg_line_y"></div>
		</div>
		<div class="folderItem">
			<div class="folder_bg folder_bg5"></div>
			<div class="folderOuter">
				<div class="folderInner"></div>
				<div class="scrollBar"></div>
			</div>
			<div class="amg_line_y"></div>
		</div>
	</div>
</div>
<script src="../resources/js/jquery-1.8.1.min.js"></script>
<script src="../resources/js/HoorayLibs/hooraylibs.js?v=2.0"></script>
<script src="../resources/js/templates.js?v=2.0"></script>
<script src="../resources/js/util.js?v=2.0"></script>
<script src="../resources/js/core.min.js?v=2.0"></script>
<script src="../resources/js/artDialog4.1.6/jquery.artDialog.js?skin=default"></script>

<script>
$().ready(function(){
	//IE下禁止选中
	document.body.onselectstart = document.body.ondrag = function(){return false;}
	
	$('.loading').hide();
	$('#desktop').show();
	//初始化
	HROS.base.init();
	//误删
	art.dialog({
		title: '欢迎使用桌面',
		icon: 'face-smile',
		width: 320,
		content: '欢迎使用桌面'
	});
});
</script>

</body>
</html>