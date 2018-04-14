package com.wjk.java.base.foreach;

import org.junit.Test;

import com.wjk.java.base.dev;

public class JavaBreakTest {

	@Test
	public void testBreak() {
		for (int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println("测试break,i="+i);
		}
		System.out.println("测试break,for循环结束。");
	}

	@Test
	public void testContinue() {
		for (int i = 0; i < 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println("测试continue,i="+i);
		}
		System.out.println("测试continue,for循环结束。");
	}

	@Test
	public void testReturn() {
		for (int i = 0; i < 5; i++) {
			if(i == 3) {
				return;
			}
			System.out.println("测试return,i="+i);
		}
		System.out.println("测试return,for循环结束。");
	}

	@Test
	public void testBreakForIJ() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if(j == 3) {
					break;
				}
				System.out.println("测试break多重循环的使用,i="+i+",j="+j);
			}
		}
		System.out.println("测试break多重循环的使用,for循环结束。");
	}



	@Test
	public void testBreakFor() {

		lable:
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {
					if(j == 3) {
						break lable;
					}
					System.out.println("测试break和标签的使用,i="+i+",j="+j);
				}
			}
	System.out.println("测试break和标签的使用,for循环结束。");
	}

	@Test
	public void testContinueFor() {

		lable:
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {
					if(j == 3) {
						continue lable;
					}
					System.out.println("测试continue和标签的使用,i="+i+",j="+j);
				}
			}
	System.out.println("测试continue和标签的使用,for循环结束。");
	}





	@Test
	public void testBreak2() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("测试break和标签的使用,i="+i+",j="+j);
			}
			if(i == 1) {
				break;
			}
			System.out.println("测试breakbreakbreak和标签的使用,i="+i);
		}
		System.out.println("测试break和标签的使用,for循环结束。");
	}



	public void syssysys() {
		dev d = new dev();
	}

	void testprotected() {
		System.out.println("测试break和标签的使用,for循环结束。");
	}




	public void sys() {
		System.out.println("JavaBreakTest:sys()");

	}

	public static void testStatic(Person p,JavaBreakTest t) {
		p.sys();
		t.sys();
	}

	public static void main(String[] args) {

		Person p = new Person();
		JavaBreakTest.testStatic(p,new JavaBreakTest());
	}
}
