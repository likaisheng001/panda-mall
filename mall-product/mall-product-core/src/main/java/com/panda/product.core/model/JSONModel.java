package com.panda.product.core.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name","sex","nullStr","age"})
public class JSONModel {
	
	private Integer age;
	private String name;
	private String sex;
	private String nullStr;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		
		return (name == null || "".equals(name.trim())) ? null : name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return (sex == null || "".equals(sex.trim())) ? null : sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNullStr() {
		return nullStr;
	}
	public void setNullStr(String nullStr) {
		this.nullStr = nullStr;
	}
	
}
