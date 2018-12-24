package com.wjk.java.base.reflect.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * 4定义动态代理工厂，生成动态代理
 * @author h
 *https://blog.csdn.net/ShuSheng0007/article/details/80864854
 */
public class ProxyFactory {

	public static Object getGcLibDynProxy(Object target){
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(new CgLibDynProxyLawyer());
		Object targetProxy= enhancer.create();
		return targetProxy;
	}
	
	//客户端调用
	public static void main(String[] args) {
        Frank cProxy= (Frank) ProxyFactory.getGcLibDynProxy(new Frank());
        cProxy.submit("工资流水在此");
        cProxy.defend();
    }
}
