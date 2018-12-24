package com.wjk.java.base;

import java.time.LocalDate;
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
		
		
		LocalDate localDate = LocalDate.parse("2018-01-27").minusMonths(1).plusDays(1);
		
	//	+"-12"+LocalDate.parse("2018-01-27").getDayOfMonth()
		
		
		String startYearDate = LocalDate.parse("2018-12".substring(0, 4)+"-12-26").minusYears(1).plusDays(1).toString();
		System.out.println(startYearDate);

		System.out.println(localDate.toString());
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
