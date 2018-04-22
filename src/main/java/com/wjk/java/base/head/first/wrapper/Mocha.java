package com.wjk.java.base.head.first.wrapper;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha ";
	}

	@Override
	public double cost() {
//		return beverage.cost() + 0.22;
		
//		return new BigDecimal(0.22).add(new BigDecimal(beverage.cost())).doubleValue();
	
		BigDecimal a = new BigDecimal(0.22);
		BigDecimal b = new BigDecimal(beverage.cost());
		
		a = a.add(b);
		
		double d = a.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		
		return d;
	}

}
