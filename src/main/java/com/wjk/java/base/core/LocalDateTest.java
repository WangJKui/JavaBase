package com.wjk.java.base.core;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.Test;


public class LocalDateTest {

	/**
	 * 国外日历表
	 */
	@Test
	public void testLocalDate() {

		LocalDate localDate = LocalDate.now();

		int month = localDate.getMonthValue();

		int today = localDate.getDayOfMonth();

		localDate = localDate.minusDays(today - 1);

		DayOfWeek dayOfWeek = localDate.getDayOfWeek();

		int value = dayOfWeek.getValue();

		System.out.println("Mon Tue Wed Thu Fri Sat Sun");

		for (int i = 1; i < value; i++) {
			System.out.print("    ");
		}

		while (localDate.getMonthValue() == month) {

			System.out.printf("%3d",localDate.getDayOfMonth());

			if (localDate.getDayOfMonth() == today) 
				System.out.print("*");
			else 
				System.out.print(" ");

			localDate = localDate.plusDays(1l);
			if (localDate.getDayOfWeek().getValue() == 1)
				System.out.println();
		}
		if (localDate.getDayOfWeek().getValue()!= 1) 
			System.out.println();
	}
	
	/**
	 * 国内日历表
	 */
	@Test
	public void testLocalDateCN() {

		LocalDate localDate = LocalDate.now();

		int month = localDate.getMonthValue();

		int today = localDate.getDayOfMonth();

		localDate = localDate.minusDays(today - 1);//将date重置为这个月的月初

		// 获取月初的那一天是星期几，取模运算还是厉害啊！
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();

		int value = dayOfWeek.getValue();

		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		// 打印第一行的缩进部分
		for (int i = 0; i < value%7; i++) {
			System.out.print("    ");
		}

		while (localDate.getMonthValue() == month) {

			System.out.printf("%3d",localDate.getDayOfMonth());

			// 给今天的日期打上标记*
			if (localDate.getDayOfMonth() == today) 
				System.out.print("*");
			else 
				System.out.print(" ");

			// 每当遇到星期6换行
			if (localDate.getDayOfWeek().getValue() == 6)
				System.out.println();
			
			// 当前天往后移动1天
			localDate = localDate.plusDays(1);
		}
		if (localDate.getDayOfWeek().getValue()!= 1) 
			System.out.println();
	}
}
