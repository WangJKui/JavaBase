package com.wjk.java.base.head.first.observer;

/**
 * 观察者，其中一个
 * @author admin
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("this.temperature = " +this.temperature +",this.humidity = " + this.humidity);

	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		
		display();
	}

}
