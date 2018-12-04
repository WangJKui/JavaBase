package com.wjk.java.mockito;

public class ThirdTest extends SecondTest {

	private String thirdName = "";

	public String getThirdName() {
		return thirdName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	
	public String getName() {
		return "ThirdTest";
	}
	
	public static void main(String[] args) {
		ThirdTest t = new ThirdTest();
		t.out();
	}

	private void out() {
		this.setFirstName("f");
		this.setSecondName("s");
		this.setThirdName("t");
		
		
		System.out.println(getFirstName());
		System.out.println(this.getSecondName());
		System.out.println(this.getThirdName());
		
		System.out.println(getName());
		System.out.println(this.getName());
		
		//直接父类存在这个方法，测调用直接父类//SecondTest
		//如果直接父类不存在，测调用父类的父类//FirstTest
		System.out.println(super.getName());

		
	}
	
}
