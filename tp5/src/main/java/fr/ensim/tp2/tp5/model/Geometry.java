package fr.ensim.tp2.tp5.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {
	private String type;
	private ArrayList <Float> coordinates=new ArrayList<Float>();
	
	public Geometry() {
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	
		
	@Override
	public String toString() {
		return "geometry{\n"+"type="+type+"\nCoordinates=\n"+"Lon="+coordinates.get(0)+"\nLat="+coordinates.get(1);
	}	
	public ArrayList <Float> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(ArrayList <Float> coordinates) {
		this.coordinates = coordinates;
	}
}
