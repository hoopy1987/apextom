package com.ezizoo.framework.domain;

/**
 * Created with IntelliJ IDEA. User: 陆凤良 Date: 13-10-12 Time: 上午10:07 To change this template use File | Settings | File
 * Templates.
 */
public class DataRow extends BaseObj
{
    /**
     * 
     */
    private static final long serialVersionUID = -6641373956128823301L;
    private String field;
    private String title;
    private int width = 120;
    private String align = "center";
    private boolean sortable;
    private boolean hidden = false;
    
    public String getField()
    {
        return field;
    }
    
    public void setField(String field)
    {
        this.field = field;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public String getAlign()
    {
        return align;
    }
    
    public void setAlign(String align)
    {
        this.align = align;
    }
    
    public boolean isSortable()
    {
        return sortable;
    }
    
    public void setSortable(boolean sortable)
    {
        this.sortable = sortable;
    }
    
    public boolean isHidden()
    {
        return hidden;
    }
    
    public void setHidden(boolean hidden)
    {
        this.hidden = hidden;
    }
    
}
