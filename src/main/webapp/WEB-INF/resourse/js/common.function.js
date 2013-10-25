function show_mask_loading(){
    jQuery('#mask_loading').height(jQuery(document).height()).css('opacity', '0.5').show() ;
    jQuery('#text_loading').css('top', jQuery(window).height()/2+jQuery(document).scrollTop()+'px').show() ;
}

function hide_mask_loading(){
    jQuery('#mask_loading').hide() ;
    jQuery('#text_loading').hide() ;
}

function getRect(obj){
    var ret = {left: obj.offset().left, top: obj.offset().top, height: obj.height(), width: obj.width()} ;
    return ret ;
}
function inRect(point, rect){
    if(point.x >= rect.left && point.x <= rect.left + rect.width && point.y >= rect.top && point.y <= rect.top + rect.height ){
        return true ;
    }else{
        return false ;
    }
}