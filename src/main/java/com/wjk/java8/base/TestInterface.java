package com.wjk.java8.base;

public interface TestInterface {

	default String getName() {
		return "TestInterface default getName 默認方法";
	}
	
	
}
