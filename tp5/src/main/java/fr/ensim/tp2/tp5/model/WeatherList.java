package fr.ensim.tp2.tp5.model;

import java.util.ArrayList;

public class WeatherList {
	private Main main;
	private ArrayList <Weather> weather=new ArrayList <Weather>();
	private String dt_txt;
	
	public WeatherList() {
		
	}
	
	/**
	 * @return the main
	 */
	public Main getMain() {
		return main;
	}
	/**
	 * @param main the main to set
	 */
	public void setMain(Main main) {
		this.main = main;
	}
	/**
	 * @return the weather
	 */
	public ArrayList <Weather> getWeather() {
		return weather;
	}
	/**
	 * @param weather the weather to set
	 */
	public void setWeather(ArrayList <Weather> weather) {
		this.weather = weather;
	}
	/**
	 * @return the dt_txt
	 */
	public String getDt_txt() {
		return dt_txt;
	}
	/**
	 * @param dt_txt the dt_txt to set
	 */
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
}
