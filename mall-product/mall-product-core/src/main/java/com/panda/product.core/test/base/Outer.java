package com.panda.product.core.test.base;

public class Outer {

	private Inner inner;
	
	public final class Inner{
		
		private String name;
		private Integer age;
		
		
		public Inner() {
			super();
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
	}
	
	public Inner getInner(){
		
		return inner != null ? inner : (inner = new Inner());
	}
	
	public void addInner(Inner inner){
		this.inner = inner;
	}
}
