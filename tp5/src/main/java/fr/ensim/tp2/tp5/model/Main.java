package fr.ensim.tp2.tp5.model;

public class Main {
	private float temp;
	private float feels_like;
	private float temp_min;
	private float temp_max;
	private float pressure;
	private float humidity;
	
	public Main() {
		
	}
	
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(float feels_like) {
		this.feels_like = feels_like;
	}
	public float getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}
	public float getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
}
