package fr.ensim.tp2.tp5.model;

import java.util.ArrayList;

public class OpenWeatherMap {
	private ArrayList < Weather > weather = new ArrayList < Weather > ();
	private Main main;
	/**
	 * @return the weather
	 */
	public ArrayList < Weather > getWeather() {
		return weather;
	}
	/**
	 * @param weather the weather to set
	 */
	public void setWeather(ArrayList < Weather > weather) {
		this.weather = weather;
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
	
	
}
