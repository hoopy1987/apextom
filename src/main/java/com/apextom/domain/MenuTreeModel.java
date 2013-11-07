package com.apextom.domain;

import java.util.List;
import java.util.Map;

public class MenuTreeModel extends BaseObj{

	/*
	according to easyUI-api
	id: An identity value bind to the node.
	text: Text to be showed.
	iconCls: The css class to display icon.
	checked: Whether the node is checked.
	state: The node state, 'open' or 'closed'.
	attributes: Custom attributes bind to the node.
	target: Target DOM object.
	*/
	
	private static final long serialVersionUID = 1L;

	private String id = "";
	
	private String text = "";
	
	private String iconCls;
	
	private String checked;
	
	private String state;
	
	private String target;
	
	private String pid;
	
	private Map<String,String> attributes;
	
	private List<MenuTreeModel> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public List<MenuTreeModel> getChildren() {
		return children;
	}

	public void setChildren(List<MenuTreeModel> children) {
		this.children = children;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	
}
