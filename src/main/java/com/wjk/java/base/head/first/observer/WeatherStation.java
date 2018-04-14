package com.wjk.java.base.head.first.observer;

/**
 * 气象站测试类
 * @author admin
 *
 */
public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.0f);
	}
}
