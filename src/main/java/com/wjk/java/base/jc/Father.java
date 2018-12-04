package com.wjk.java.base.jc;

public class Father {

	protected String name="父亲属性";  

	
	public String getName() {
		return name;
	}


	public void method() {  
		System.out.println("父类方法，对象类型：" + this.getClass());  
	}

	public void methodFather() {  
		System.out.println("methodFather父类方法，对象类型：" + this.getClass());  
	}

	
	
}
