package com.wjk.java8.base;

import java.util.Optional;

import org.junit.Test;

public class TestOptional {

	
	@Test
	public void test1() {
		Optional<String> op = Optional.of(new String("123"));
		
		String s = op.get();
		
		System.out.println(s);
	}
}
