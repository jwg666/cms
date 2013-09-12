//window.onerror = function(){return true;}
function $(objStr){return document.getElementById(objStr);}
String.prototype.trim = function(){ return this.replace(/(^\s*)|(\s*$)/g, "");}
function _f()
{
	window.external.AddFavorite(location.href,document.title);
}
function _h(aa)
{
	aa.style.behavior="url(#default#homepage)";
	aa.setHomePage(location.href);
}

function ImageZoom(Img,width,height)
{ 
	if(Img.width>width)
	{
		Img.width = width;
		var w=Img.width/width; 
		Img.height=parseInt(Img.height/w);
	}
}

function ImageOpen(Img)
{
	window.open(Img.src);
}

function Ok3w_Search(frm)
{
	if(frm.q.value.trim()=="")
	{
		alert("«Î ‰»Î≤È—Øπÿº¸¥ °£");
		frm.q.focus()
		return false;
	}
	frm.action = "search.asp";
	frm.bntSub.disabled = true;
	frm.submit();
}

function Ok3w_insertFlash(base_url, focus_width, focus_height, swf_height, text_height, pics, links, texts)
{
	document.write('<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,2 9,0" width="'+ focus_width +'" height="'+ swf_height +'">');
	 document.write('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="images/focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#FFFFFF">');
	 document.write('<param name="allowFullScreen" value="true">');
	 document.write('<param name="FlashVars" value="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'">');
	 document.write('<embed src="images/focus.swf" width="'+ focus_width +'" height="'+ swf_height +'" quality="high" FlashVars="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'" allowfullscreen="true" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer"></embed>');
	 document.write('</object>');
}


function Ok3w_Marquee(RndID,Width,Height,Speed)
{
	StrGD = $("objGD").innerHTML;
	document.write('<div id="'+RndID+'" style="overflow:hidden;height:'+Height+'px;width:'+Width+'px;">');
	document.write('<table border="0" cellspacing="0" cellpadding="0">');
	document.write('  <tr>');
	document.write('    <td id="'+RndID+'1" height="'+Height+'">'+StrGD+'</td>');
	document.write('    <td id="'+RndID+'2" height="'+Height+'"></td>');
	document.write('  </tr>');
	document.write('</table>');
	document.write('</div>');
	
	if(Speed==0)
		return;
	var speed = Speed;
	var pro = document.getElementById(RndID);
	var pro1 = document.getElementById(RndID+"1");
	var pro2 = document.getElementById(RndID+"2");
	pro2.innerHTML=pro1.innerHTML;
	var MyMar=setInterval(Marquee,speed) 
	pro.onmouseover=function() {clearInterval(MyMar)} 
	pro.onmouseout=function() {MyMar=setInterval(Marquee,speed)} 
	function Marquee()
	{ 
		var mm_mo = pro.offsetWidth - pro1.offsetWidth;
		if(mm_mo<0) mm_mo=0;
		if(pro2.offsetWidth-pro.scrollLeft<=mm_mo) 
			pro.scrollLeft-=pro1.offsetWidth;
			else
				pro.scrollLeft+=5;
	} 
}

function Ok3w_PlayImg()
{
	var swf_height=show_text==1?pic_height+20:pic_height;
	var pics="", links="", texts="";
	for(var i=1; i<imag.length; i++){
		pics=pics+("|"+imag[i]);
		links=links+("|"+link[i]);
		texts=texts+("|"+text[i]);
	}
	pics=pics.substring(1);
	links=links.substring(1);
	texts=texts.substring(1);
	
	document.writeln('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cabversion=6,0,2 9,0" width="'+ pic_width +'" height="'+ swf_height +'">');
	document.writeln('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="'+flashdns+'js/focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#FFFFFF">');
	document.writeln('<param name="allowFullScreen" value="true">');
	document.writeln('<param name="FlashVars" value="pics='+pics+'&links='+links+'&texts='+texts+'&pic_width='+pic_width+'&pic_height='+pic_height+'&show_text='+show_text+'&txtcolor='+txtcolor+'&bgcolor='+bgcolor+'&button_pos='+button_pos+'&stop_time='+stop_time+'">');
	document.writeln('<embed src="'+flashdns+'js/focus.swf" FlashVars="pics='+pics+'&links='+links+'&texts='+texts+'&pic_width='+pic_width+'&pic_height='+pic_height+'&show_text='+show_text+'&txtcolor='+txtcolor+'&bgcolor='+bgcolor+'&button_pos='+button_pos+'&stop_time='+stop_time+'" quality="high" width="'+ pic_width +'" height="'+ swf_height +'" allowfullscreen="true" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer"></embed>');
	document.writeln('</object>');
}



function Get_ValidCode(dns)
{
	var obj = document.getElementById("strValidCode");
	obj.src = dns+"inc/validcode.asp?rnd="+Math.random();
}