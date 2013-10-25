//Dropdown list plugins
jQuery.fn.setDropDown = function(sub_obj, parent_hover_class)
{	
	if(sub_obj.length <=0 ){alert('Popup Object can\'t be null') ;return ;}
	sub_obj.css({top: jQuery(this).offset().top + jQuery(this).height()+14, left:jQuery(this).offset().left, 'z-index': 10000000,'position':'absolute'}).show() ;
	var parent_obj = jQuery(this) ;
	jQuery(document).unbind('mousemove').bind('mousemove', function(event){
		var sub_rect = getRect(sub_obj) ;
		var parent_rect = getRect(parent_obj) ;

		var pt = {x: event.clientX, y: event.clientY+(document.documentElement.scrollTop + document.body.scrollTop)} ;
		
		if(inRect(pt, parent_rect) || inRect(pt, sub_rect)){
			if(parent_hover_class != null && typeof parent_hover_class != 'undefined'){
				parent_obj.addClass(parent_hover_class) ;
			}
		}else{
			if(parent_hover_class != null && typeof parent_hover_class != 'undefined'){
				parent_obj.removeClass(parent_hover_class) ;
			}
			sub_obj.hide() ;
		}
	}) ;

	//Global function
	function getRect(obj){
		var ret = {left: obj.offset().left, top: obj.offset().top, height: obj.height()+14, width: obj.width()} ;
		return ret ;
	}
	function inRect(point, rect){
		if(point.x >= rect.left && point.x <= rect.left + rect.width && point.y >= rect.top && point.y <= rect.top + rect.height ){
			return true ;
		}else{
			return false ;
		}
	}
}