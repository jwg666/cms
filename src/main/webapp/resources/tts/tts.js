$(function () {
    $('a[href]').mouseenter(function () {
       // alert("0000");
        var str = "链接" + $(this).html();
        //alert(str);
        readText(str);
    });

});
function readText(str) {
    //alert(id);
    //var obj = document.getElementById(id);
    //var str = obj.innerHTML;
    if (str != null) {
        //alert(str);
        var TTS = document.getElementById("tts");
        TTS.startRead(str);
    } else {
        //alert("-----");
    }


}