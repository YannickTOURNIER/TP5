package fr.ensim.tp2.tp5.model;

import java.util.ArrayList;

public class OpenWeatherMapForecast {
	private String cod;
	private float message;
	private float cnt;
	private ArrayList <WeatherList> featureCollection=new ArrayList <WeatherList>();
	
	public OpenWeatherMapForecast() {
		
	}
	
	
	/**
	 * @return the cod
	 */
	public String getCod() {
		return cod;
	}
	/**
	 * @param cod the cod to set
	 */
	public void setCod(String cod) {
		this.cod = cod;
	}
	/**
	 * @return the message
	 */
	public float getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(float message) {
		this.message = message;
	}
	/**
	 * @return the cnt
	 */
	public float getCnt() {
		return cnt;
	}
	/**
	 * @param cnt the cnt to set
	 */
	public void setCnt(float cnt) {
		this.cnt = cnt;
	}
	/**
	 * @return the featureCollection
	 */
	public ArrayList <WeatherList> getFeatureCollection() {
		return featureCollection;
	}
	/**
	 * @param featureCollection the featureCollection to set
	 */
	public void setFeatureCollection(ArrayList <WeatherList> featureCollection) {
		this.featureCollection = featureCollection;
	}
}
