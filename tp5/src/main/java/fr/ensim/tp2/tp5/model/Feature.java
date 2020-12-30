package fr.ensim.tp2.tp5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Feature {
	private String type;
	private String version;
	private Geometry geometry;
	
	public Feature() {
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version=version;
	}
	
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry=geometry;
	}
	
	@Override
	public String toString() {
		return "type="+type+"\n"+"Version="+version+"\n"+"Feature{"+"\n"+geometry;
	}
}
