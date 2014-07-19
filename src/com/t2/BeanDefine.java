package com.t2;

/**
 * 
 * @ClassName  com.t2.BeanDefine
 * @description
 * @author : qinggang.liu bis@foxmail.com
 * @Create Date : 2014-7-19 下午5:43:49
 */

public class BeanDefine {

	public String id;
	public String className;

	public BeanDefine(String id, String className) {
		this.id = id;
		this.className = className;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
