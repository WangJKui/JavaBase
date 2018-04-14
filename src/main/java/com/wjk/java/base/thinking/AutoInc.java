package com.wjk.java.base.thinking;

public class AutoInc {

	public static void main(String[] args) {

		int i = 1;
		//++i 先运算后赋值，前缀式
		System.out.println("i = "+ i);
		System.out.println("++i = "+ ++i);
		System.out.println("i = "+ i);

		//i++先赋值后运算，后缀式
		System.out.println("i++ = "+ i++);
		System.out.println("i = "+ i);

		//--i 先运算后赋值，前缀式
		System.out.println("--i = "+ --i);
		System.out.println("i = "+ i);
		
		//i--先赋值后运算，后缀式
		System.out.println("i-- = "+ i--);
		System.out.println("i = "+ i);

		
	}

}
