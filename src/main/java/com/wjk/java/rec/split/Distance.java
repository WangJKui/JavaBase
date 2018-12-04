package com.wjk.java.rec.split;

import java.util.Arrays;

import org.junit.Test;

public class Distance {

	private int _primaryForce;
	private int _mass;
	private int _delay;
	private int _secondaryForce;

	
	private final String name;
	
	public Distance(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}


	/**
	 * 重构：分解临时变量
	 */
	@Test
	public void testDistanceTravelled() {
		//System.out.println(getDistanceTravelled(10));
		
//		int o = 3;
		//3+16+27
//		o += 2*8 + 3*9;
//		System.out.println(o);
		
		String a = "abcde";
		
		byte[] b = a.getBytes();
		
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(Arrays.toString(b));
	
		
		
		
	}

	/**
	 * 原始代码
	 * @param time
	 * @return
	 */
	private double getDistanceTravelled(int time) {

		double result;
		double acc = getPrimaryAcc();
		
		int primaryTime = mathMin(time);
		
		result = 0.5 * acc * primaryTime * primaryTime;
		
		int secondaryTime = getSecondaryTime(time);
		if (secondaryTime > 0) {
			double primaryVel = acc *  _delay;
			
			acc = getSecondaryAcc();
			
			result +=primaryVel * secondaryTime + 0.5* acc* secondaryTime*secondaryTime;
			
		}
		
		return result;
	}
	
	
	/**
	 * 1,优化acc变量之后的代码
	 * @param time
	 * @return
	 */
	private double getDistanceTravelledAcc(int time) {

		double result;
		final double primaryAcc = _primaryForce / _mass;
		
		int primaryTime = mathMin(time);
		
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		
		int secondaryTime = getSecondaryTime(time);
		if (secondaryTime > 0) {
			double primaryVel = primaryAcc *  _delay;
			
			final double secondaryAcc = getSecondaryAcc();
			
			result +=primaryVel * secondaryTime + 0.5* secondaryAcc* secondaryTime*secondaryTime;
			
		}
		
		return result;
	}

	
	/**
	 * 2,临时变量改变为查询函数
	 * @param time
	 * @return
	 */
	private double getDistanceTravelledAccQuery(int time) {

		double result = 0.5 * getPrimaryAcc() * mathMin(time) * mathMin(time);
		
		if (getSecondaryTime(time) > 0) {
			
			result +=getPrimaryVel() * getSecondaryTime(time) + 0.5 * getSecondaryAcc() * getSecondaryTime(time) * getSecondaryTime(time);
			
		}

		return result;
	}

	private int getPrimaryVel() {
		return getPrimaryAcc() *  _delay;
	}

	private int getSecondaryAcc() {
		return (_primaryForce + _secondaryForce) / _mass;
	}

	private int getSecondaryTime(int time) {
		return time - _delay;
	}

	private int mathMin(int time) {
		return Math.min(time, _delay);
	}
	private int getPrimaryAcc() {
		return _primaryForce / _mass;
	}
}
