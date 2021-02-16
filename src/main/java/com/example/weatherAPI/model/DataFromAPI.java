package com.example.weatherAPI.model;

public class DataFromAPI {
	
	
	
	//Model for the data we get after API call will be stored here
	private double temp ;
	
	private double flike ;
	
	private double tmin;
	
	private double tmax;
	
	private long pressure;
	
	private long humidity;
	
	private String cweather ;
	
	private String iconID ;
	
	
	
	
	
	
	
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getFlike() {
		return flike;
	}
	public void setFlike(double flike) {
		this.flike = flike;
	}
	public double getTmax() {
		return tmax;
	}
	public void setTmax(double tmax) {
		this.tmax = tmax;
	}
	public double getTmin() {
		return tmin;
	}
	public void setTmin(double tmin) {
		this.tmin = tmin;
	}
	public long getPressure() {
		return pressure;
	}
	public void setPressure(long pressure) {
		this.pressure = pressure;
	}
	public long getHumidity() {
		return humidity;
	}
	public void setHumidity(long humidity) {
		this.humidity = humidity;
	}
	public String getCweather() {
		return cweather;
	}
	public void setCweather(String cweather) {
		this.cweather = cweather;
	}
	public String getIconID() {
		return iconID;
	}
	public void setIconID(String iconID) {
		this.iconID = iconID;
	}

}
