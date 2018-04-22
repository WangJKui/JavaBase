package com.wjk.java.base.head.first.wrapper;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip ";
	}

	@Override
	public double cost() {
//		return beverage.cost() + 0.44;
//		return new BigDecimal(0.44).add(new BigDecimal(beverage.cost())).doubleValue();

		BigDecimal a = new BigDecimal(0.44);
		BigDecimal b = new BigDecimal(beverage.cost());
		
		a = a.add(b);
		
		double d = a.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		
		return d;
	}

}
