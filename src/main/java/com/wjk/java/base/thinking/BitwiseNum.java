package com.wjk.java.base.thinking;

public class BitwiseNum {

	public static void main(String[] args) {
		
		int a = 4;
		//a的十进制：4,a的二进制：100
		System.out.println("a的十进制："+a+",a的二进制："+Integer.toBinaryString(a));
		
		int b = 6;
		//b的十进制：6,b的二进制：110
		System.out.println("b的十进制："+b+",b的二进制："+Integer.toBinaryString(b));

		//按位与运算： 两个操作数中位都为1，结果才为1，否则结果为0
		int c = a & b;
		//c的十进制：4,c的二进制：100
		System.out.println("c的十进制："+c+",c的二进制："+Integer.toBinaryString(c));

		//按位或运算 ： 两个操作数中位都为1，结果才为1，否则结果为0
		int d = a | b;
		//d的十进制：6,d的二进制：110
		System.out.println("d的十进制："+d+",d的二进制："+Integer.toBinaryString(d));

		//按位非 运算  ：如果位为0，结果是1，如果位为1，结果是0
		int e = ~1;
		//e的十进制：-2,e的二进制：11111111111111111111111111111110
		System.out.println("e的十进制："+e+",e的二进制："+Integer.toBinaryString(e));

		int f = ~(-1);
		//f的十进制：0,f的二进制：0
		System.out.println("f的十进制："+f+",f的二进制："+Integer.toBinaryString(f));

		//按位异或  ：两个操作数的位中，相同则结果为0，不同则结果为1
		int g = a ^ b;
		//g的十进制：2,g的二进制：10
		System.out.println("g的十进制："+g+",g的二进制："+Integer.toBinaryString(g));

	}

}
