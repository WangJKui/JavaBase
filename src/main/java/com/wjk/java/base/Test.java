package com.wjk.java.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/*System.out.println("teseta");
		System.out.println("master");

		System.out.println("dev分支");
		System.out.println("dev分支");

		*/
		
		
		Set<String> masids = new HashSet<>();

		List<String> list = new ArrayList<>();

		
		for (int i = 0; i < 10; i++) {
			masids.add(String.valueOf(i));
			list.add(String.valueOf(i));
		}
		
		Object[] o = masids.toArray();
		Object[] listo = list.toArray();

		method(o);
		method(listo);
		
	//	method("121","qe");

//		String[] a={"121","qe"};
		//method(a);  //这两种使用方法输出同样的结果，所以不定项参数兼容数组

//		List<String> asList = Arrays.asList(a);
//		method(asList);
	}
	
	
	
	
	public static void method(Object...arg){
//		for (Object i : arg) {
//			System.out.println(i);
//		}
		List<Object> asList = Arrays.asList(arg);
		/*for (Object object : asList) {
			System.out.println(object);
		}*/
		asList.forEach(a -> {
			String b = (String) a;
			System.out.println(b);
		});
		
		
	}
	
	
}
