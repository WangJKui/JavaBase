package com.wjk.java.base.head.first.observer;

import java.io.Serializable;

public class WeatherVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6723240088700470342L;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	
}
