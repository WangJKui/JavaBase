package com.wjk.java.base.head.first.observer;

/**
 * 观察者
 * @author admin
 *
 */
public interface Observer {

	/**
	 * 当气象站策略值改变时，
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	void update(float temperature,float humidity,float pressure);
}
