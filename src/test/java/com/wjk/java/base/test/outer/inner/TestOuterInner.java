package com.wjk.java.base.test.outer.inner;

/**
 *
 * @author h
 *
 */
class Outer{
	private String msg = "Hello world";
	
	// 1方法普通内部类
	/*public void fun(int num) {//jdk 1.8之后不需要加final
		
		double score = 99.9;//jdk 1.8之后不需要加final
		
		class Inner {
			public void print() {
				System.out.println("num = " + num);
				System.out.println("score = " + score);
				System.out.println("msg = " + msg);

			}
		}
		
		new Inner().print();
	}*/
	
	//2普通内部类
	/*class Inner{
		
		public void print() {
			System.out.println("msg = " + msg);
		}
	}
	
	public void fun() {
		new Inner().print();
	}*/
	
	//3静态内部类
	private static String smsg = "static Hello world";

	static class Inner{

		public void print() {
			System.out.println("smsg = " + smsg);
		}
	}
	public void fun() {
		new Inner().print();
	}
}

public class TestOuterInner {
	public static void main(String[] args) {
		//new Outer().fun(100);方法普通内部类
		
		//new Outer().fun();//普通内部类
		//Outer.Inner in = new Outer().new Inner();
		//in.print();
		
		//new Outer().fun();//静态内部类
		Outer.Inner in = new Outer.Inner();
		in.print();
	}
}
