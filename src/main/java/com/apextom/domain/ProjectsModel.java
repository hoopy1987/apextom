package com.apextom.domain;


/**
 * 栏目信息
 * 
 * @author hoopy
 *
 */
public class ProjectsModel extends BaseObj {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7960401016530214884L;
	
	/**
	 * ID
	 */
	private Integer id;
	
	/**
	 * 栏目名
	 */
	private String pname;
	
	/**
	 * 栏目类型（0：常规栏目，1：课程类）
	 */
	private String ptype;
	
	/**
	 * 顺序
	 */
	private Integer order;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

}
