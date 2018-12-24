package com.wjk.java.base.reflect;

/**
 * 刘德华实现Person接口，那么刘德华会唱歌和跳舞了
 * @author h
 *
 */
public class LiuDeHua implements Person {

	@Override
	public String sing(String name) {
		System.out.println("刘德华唱"+name+"歌！！");
		return "歌唱完了，谢谢大家！";
	}

	@Override
	public String dance(String name) {
		System.out.println("刘德华跳"+name+"舞！！");
		return "舞跳完了，多谢各位观众！";
	}

}
