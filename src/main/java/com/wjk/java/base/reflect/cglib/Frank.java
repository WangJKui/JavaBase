package com.wjk.java.base.reflect.cglib;

/**
 * 定义业务类，被代理的类没有实现任何接口
 * 由于JDK只能针对实现了接口的类做动态代理，而不能对没有实现接口的类做动态代理，所以cgLib横空出世！
 * @author h
 *
 */
public class Frank {
	public void submit(String proof) {
		System.out.println(String.format("老板欠薪跑路，证据如下：%s",proof));
	}
	public void defend() {
		System.out.println(String.format("铁证如山，%s还Frank血汗钱","马旭"));
	}
}
