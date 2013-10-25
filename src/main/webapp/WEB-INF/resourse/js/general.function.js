function set_cookie ( name, value, exp_y, exp_m, exp_d, path, domain, secure ){
  var cookie_string = name + "=" + escape ( value );

  if (exp_y){
    var expires = new Date ( exp_y, exp_m, exp_d );
    cookie_string += "; expires=" + expires.toGMTString();
  }

  if (path){
      cookie_string += "; path=" + escape ( path );
  }
  if (domain){
      cookie_string += "; domain=" + escape ( domain );
  }
  if (secure){
      cookie_string += "; secure";
  }

  document.cookie = cookie_string;
}

function get_cookie(cookie_name){
  var results = document.cookie.match(cookie_name + '=(.*?)(;|$)');
  if(results){
      return (unescape(results[1]));
  }else{
      return null;
  }
}

function delete_cookie( cookie_name ){
  var cookie_date = new Date ( );  // current date & time
  cookie_date.setTime ( cookie_date.getTime() - 1 );
  document.cookie = cookie_name += "=; expires=" + cookie_date.toGMTString();
}

function changTextareaSize(sID, bFlag){
	var editor=document.getElementById(sID);

	var h = 0 ;
	if(editor.style.height == ''){
		h = editor.style.height ;
	}else{
		h = parseInt(editor.style.height) ;
	}

	if((!bFlag) && (h<=100)){
	    return ;
	}
	h=bFlag?(h+100):(h-100);
	editor.style.height=h+'px';
}

function checkAllBox(obj,sName){
    if(obj.checked == true){
        selectAllBox(sName) ;
    }else{
        clearAllBox(sName) ;
    }
}
function selectAllBox(sName){
	var i=0;
	var checkBox=document.getElementsByName(sName);
	for(i=0;i<checkBox.length;i++){
		checkBox[i].checked = true;
	}
}

function clearAllBox(sName){
	var i=0;
	var checkBox=document.getElementsByName(sName);
	for(i=0;i<checkBox.length;i++){
		checkBox[i].checked = false;
	}
}

function disableAllBox(sName){
	var i=0;
	var checkBox=document.getElementsByName(sName);
	for(i=0;i<checkBox.length;i++){
		checkBox[i].disabled = true;
	}
}

function enableAllBox(sName){
	var i=0;
	var checkBox=document.getElementsByName(sName);
	for(i=0;i<checkBox.length;i++){
		checkBox[i].disabled = false;
	}
}

function getCheckedBox(sName){
	var n=0;
	var checkBox=document.getElementsByName(sName);
	for(i=0;i<checkBox.length;i++){
		checkBox[i].checked?(n++):n;
	}
	return n;
}

function popup_window(url, width, height){
	var iTop  = (window.screen.height - height) / 2; 
	var iLeft = (window.screen.width - width) / 2;
	window.open(url,"Popup","scrollbars=yes,alwaysRaised=yes,toolbar=no,location=0,status=0,direction=no,resizable=0 nor resizable=false,Width="+width+",Height="+height+",top="+iTop+",left="+iLeft) ;
}

function input_number(e){
    var keyCode;
    var evt;
    if(isIE()){
        keyCode = window.event.keyCode;
        evt = window.event;
    }else{
        keyCode = e.which;
        evt = e;
    } 
	if ((keyCode!=13 && keyCode!=8) && (keyCode<48 || keyCode>57)){
        if(isIE()){
		    evt.returnValue=false ;
        }else{
            evt.preventDefault();
        }
	}
}

function is_email(value){
	if( value.match( /^[A-z0-9-_\.]+@[A-z0-9-_\.]+$/i ) ){
        return true ;
    }

	return false ;
}

function is_image(value){
	if(value.match(/^[^\.]+.*\.+JPEG|JPG|GIF|PNG|BMP+$/i)){
		return true ;
	}

	return false ;
}

function is_http(value){
	if( value.match( /^http:\/\/.*/i) ){
        return true ;
    }

	return false ;
}

function get_browser_language(){
	var lang = navigator.language || navigator.browserLanguage ; 
	
	return lang.toLowerCase() ;
}

function isIE(){
	var isIE = (document.all && window.ActiveXObject && !window.opera) ? true : false;
	
	return isIE ;
}

function is_empty(value){
	if( value == '' || value == null || typeof value == 'undefined'){
		return true ;
	}

	return false ;
}

function getScrollHeight(){
	return document.documentElement.scrollTop + document.body.scrollTop ;
}

function getScrollWidth(){
	return document.documentElement.scrollLeft + document.body.scrollLeft ;
}

function getDocumentHeight(){
    if(isIE()){
        return document.compatMode == "CSS1Compat" ? document.documentElement.clientHeight : document.body.clientHeight;
    }else{
        return self.innerHeight;
    }
}

function getDocumentWidth (){
    if(isIE()){
        return document.compatMode == "CSS1Compat" ? document.documentElement.clientWidth : document.body.clientWidth;
    }else{
        return self.innerWidth;
    }
}

function inArray(element, array){
	for(var i=0;i<array.length;i++){
		if(element == array[i]){
			return true ;
		}
	}
	
	return false ;
}

function getIntersect(array1, array2){
	var _new = new Array() ;
	var k = 0 ;
    if(array1.length >= array2.length){
        for(var i=0;i<array1.length;i++){
            if(!inArray(array1[i], array2)){
                _new[k++] = array1[i];
            }
        }//for
    }else{
        for(var i=0;i<array2.length;i++){
            if(!inArray(array2[i], array1)){
                _new[k++] = array2[i] ;
            }
        }//for
    }
	
	return _new ;
}

function getCurrentPageName(url){
	var strUrl = url ;
    if(is_empty(url)){
	    strUrl=window.location.href;
    }
	var arrUrl=strUrl.split("/");
	
	return arrUrl[arrUrl.length-1];
}

function insert_into_field(element, text){
    document.getElementById(element).value = text ;
}

function append_into_field(element, text, seperator){
	var obj = document.getElementById(element) ;
	if(is_empty(obj.value)){
		obj.value = text ;
	}else if(obj.value.indexOf(text) < 0){
		obj.value = obj.value + seperator + text ;
	}
}

function window_reload(window, url){
    window.location.href = url ;
}

function resize_image(obj, width){
    if(obj.width > width){
        obj.width = width ;
    }
}

function getURLParameter(param){
     var sValue=location.search.match(new RegExp("[\?\&]"+param+"=([^\&]*)(\&?)","i")) ;
     return sValue?sValue[1]:sValue ;
}

function imageZoom(obj, width, height){
    var margin = 0 ;
    var scale = obj.width/obj.height;

    if(obj.width > obj.height && obj.width > width){
        obj.width = width;
        obj.height = parseInt(width / scale);
        margin = parseInt((height - obj.height)/2) ;
        if(margin < 0){
            margin = 0;
        }
        obj.style.marginTop = margin + 'px' ;
        obj.style.width = width + 'px' ;
        obj.style.height = parseInt(width / scale) + 'px' ;
    }else if(obj.width == obj.height && obj.width > width){
         obj.height = height;
         obj.width = scale * height ;
         obj.style.marginTop = '0px' ;
         obj.style.width = (scale * height) + 'px' ;
         obj.style.height = height + 'px' ;
    }else{
        if(obj.height > obj.width && obj.height > height){
            obj.height = height;
            obj.width = scale * height ;
            obj.style.marginTop = '0px' ;
            obj.style.width = (scale * height) + 'px' ;
            obj.style.height = height + 'px' ;
        }else{
            margin = parseInt((height - obj.height)/2) ;
            if(margin < 0){
                margin = 0;
            }
            obj.style.marginTop = margin + 'px' ;
        }
    }
}

function JsLoader(){
    this.load=function(url){
        var ss=document.getElementsByTagName("script");
        for(i=0;i<ss.length;i++){
            if(ss[i].src && ss[i].src.indexOf(url)!=-1){
                this.onsuccess();
                return;
            }
        }

        s=document.createElement("script");
        s.type="text/javascript";
        s.src=url;

        var head=document.getElementsByTagName("head")[0];
        head.appendChild(s);

        var self=this;


        s.onload=s.onreadystatechange=function(){
            if(this.readyState && this.readyState=="loading"){
                return ;
            }
            self.onsuccess();
        }
        s.onerror=function(){
            head.removeChild(s);
            self.onfailure();
        }
    };

    this.onsuccess=function(){};
    this.onfailure=function(){};
}