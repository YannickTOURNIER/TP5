package fr.ensim.tp2.tp5.model;

import java.util.ArrayList;

public class FeatureCollection {
	private String type;
	private String version;
	ArrayList < Feature > features = new ArrayList < Feature > ();
	private String attribution;
	private String licence;
	private String query;
	private float limit;
	
	public FeatureCollection() {
		
	}
	
	public ArrayList<Feature> getFeature(){
		return features;
	}
	public void setFeatures(ArrayList <Feature> features) {
		this.features=features;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAttribution() {
		return attribution;
	}
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	/**
	 * @return the limit
	 */
	public float getLimit() {
		return limit;
	}
	/**
	 * @param limit the limit to set
	 */
	public void setLimit(float limit) {
		this.limit = limit;
	}
}
