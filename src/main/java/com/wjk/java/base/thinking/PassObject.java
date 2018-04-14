package com.wjk.java.base.thinking;

class Letter{
	char c;
}

public class PassObject {

	public static void f(Letter y) {
		y.c = 'z';
	}
	
	//s 是s1的副本，先指向hello，然后重新指向world
	public static void f(String s) {
		s = new String("world");
	}
	
	public static void f(int i) {
		i = 10;
	}
	public static void main(String[] args) {

		Letter l = new Letter();
		
		l.c = 'a';
		
		//l.c = a
		System.out.println("l.c = " + l.c);
		
		f(l);
		
		//l.c = z
		System.out.println("l.c = " + l.c);	
		
		String s1 = new String("hello");
		
		//hello
		System.out.println(s1);
		
		f(s1);
		
		//hello
		System.out.println(s1);

		int i1 = 110;
		
		//110
		System.out.println(i1);
		
		f(i1);
		
		//110
		System.out.println(i1);
	}

}
