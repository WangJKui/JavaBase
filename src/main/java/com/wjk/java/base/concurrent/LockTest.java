package com.wjk.java.base.concurrent;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LockTest {

	//成员变量线程不安全
	StringBuilder  sb = new StringBuilder();
	//StringBuffer  sb = new StringBuffer();
	
	public static void main(String[] args) {

		//testTherd();
		
		//testStringBulider();
		
		testStringJoin();
	}

	
	public static void testStringBulider() {
		LockTest t = new LockTest();

		new Thread(){
			public void run() {
				t.synchronizedStringbuilderTest("a");
			};
		}.start();

		new Thread(){
			public void run() {
				t.synchronizedStringbuilderTest("b");
			};
		}.start();

	}


	@Test
	public static void testTherd() {
		LockTest t = new LockTest();

		new Thread(){
			public void run() {
				t.synchronizedTest("1111");
			};
		}.start();

		new Thread(){
			public void run() {
				t.synchronizedTest("1111");
			};
		}.start();

		new Thread(){
			public void run() {
				t.synchronizedTest("1111");
			};
		}.start();

		new Thread(){
			public void run() {
				t.synchronizedTest("2222");
			};
		}.start();
		
	}


	public void synchronizedTest(String id) {

		synchronized(id.intern()) {
			System.out.println(id);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}


	}
	
	//synchronized
	public  void synchronizedStringbuilderTest(String id) {
		System.out.println(id);

		//在方法内，局部变量，线程安全，
		//StringBuilder  sb = new StringBuilder();
		//StringBuffer  sb = new StringBuffer();
//		sb.append("a");
//		sb.append("c");
//		sb.append("d");
//		sb.append("e");
//		sb.append("q");
//		sb.append("r");
//		sb.append("t");
		for (int i = 0; i < 1000; i++) {
			sb.append("id = "+id+i+",");
		}
		System.out.println(sb.toString());
	}
	
	public static  void  testStringJoin(){
		String[] a = {"1","2","3","4"};
		List<String> list = Arrays.asList(a);
		StringBuilder  ssb = new StringBuilder();
		//判断字段数量添加查询语句
//		for (int i = 0; i < list.size(); i++) {
//			ssb.append(" cuoid = " + list.get(i));
//			if (i < list.size()-1) {
//				ssb.append(" or ");
//			}
//		}
		
		System.out.println(ssb.toString());

		String sj = " cuoid ="+String.join(" cuoid = ", list);
		
		 sj = String.join(" or ", sj);

		System.out.println(sj.toString());

	}
}
