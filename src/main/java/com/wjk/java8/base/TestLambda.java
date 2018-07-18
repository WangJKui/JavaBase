package com.wjk.java8.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/*
 * 函数式 四大内置接口 
 */
public class TestLambda {

	/**
	 * 消费型接口  con.accept(T t)，有参接口(m) ->
	 */
	@Test
	public void testConsumer(){
		happy(1000, (m) -> System.out.println("消费"+m+"yuan"));
	}

	public void happy(double money,Consumer<Double> con) {
		con.accept(money);
	}


	/**
	 * 供给型接口  sup.get()，无参接口() ->
	 */
	@Test
	public void testSupplier() {
		List<Integer> list = getNumList(10,() -> (int)(Math.random()*100));
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	public List<Integer> getNumList(int num,Supplier<Integer> sup){
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			list.add(sup.get());
		}
		return list;
	}
	
	/**
	 * Function<T,R>,T:传入参数类型，R：返回参数类型。函数型接口
	 */
	@Test
	public void testFunction() {
		
		System.out.println(setHandler("qweqweq", (str) -> str.length()));
	}
	
	
	public Integer setHandler(String str,Function<String, Integer> fun) {
		return fun.apply(str);
	}
	
	
	/**
	 * 断言型接口  Predicate(T t)
	 */
	@Test
	public void testPredicate() {
		
		List<String> list = Arrays.asList("a","b","qwe1","wf2g","iu2w","11v");
		
		List<String> strlist = filterStr(list, (s) -> s.length()>=3);
		
		System.out.println(strlist.toString());
		
		for (String string : strlist) {
			System.out.println(string);
		}
	}
	
	
	public List<String> filterStr(List<String> list,Predicate<String> pred){
		List<String> strList = new ArrayList<>();
		
		for (String string : list) {
			if(pred.test(string)) {
				strList.add(string);
			}
		}
		
		return strList;
	}
}

