package com.wjk.java.base.head.first.observer;

/**
 * 主题
 * @author admin
 *
 */
public interface Subject {

	/**
	 * 注册观察者
	 * @param o
	 */
	void registerObserver(Observer o);
	
	/**
	 * 移除观察者
	 * @param o
	 */
	void removeObserver(Observer o);
	
	/**
	 * 主题状态改变时，调用此方法通知观察者
	 */
	void notifyObservers();
}
