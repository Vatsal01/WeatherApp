package com.example.weatherAPI.model;

public class WeatherData {
	private String city ;
	private Byte unit;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Byte getUnit() {
		return unit;
	}
	public void setUnit(Byte unit) {
		this.unit = unit;
	}

}
