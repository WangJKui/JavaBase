package com.wjk.java.base.test;

import org.junit.Test;

public class APP {

	public static void main(String[] args) {
		System.out.println("app");
	}

	@Test
	public void testSwitch() {

		String str = "123";

		switch (str) {
		case "123":
			System.out.println("123");
			break;
		case "1":
			System.out.println("1");
			break;
		default:
			System.out.println("default");

			break;
		}
	}
}
