package com.lanou.bean;

import java.io.Serializable;

public class FactoryBean implements Serializable {
	
	private String factory_name;
	
	private int countnum;

	public String getFactory_name() {
		return factory_name;
	}

	public void setFactory_name(String factory_name) {
		this.factory_name = factory_name;
	}

	public int getCountnum() {
		return countnum;
	}

	public void setCountnum(int countnum) {
		this.countnum = countnum;
	}
	 
	
	
}
