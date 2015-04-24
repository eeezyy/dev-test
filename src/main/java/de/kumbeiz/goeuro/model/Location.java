package de.kumbeiz.goeuro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

	@JsonProperty("_id")
	private long id;
	private Object key;
	private String name;
	private String fullName;
	private String iata_airport_code;
	private String type;
	private String country;
	private GeoPosition geo_position;
	private long locationId;
	private boolean inEurope;
	private String countryCode;
	private boolean coreCountry;
	private double distance;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIata_airport_code() {
		return iata_airport_code;
	}

	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public GeoPosition getGeo_position() {
		return geo_position;
	}

	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public boolean isInEurope() {
		return inEurope;
	}

	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isCoreCountry() {
		return coreCountry;
	}

	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", key=" + key + ", name=" + name
				+ ", fullName=" + fullName + ", iata_airport_code="
				+ iata_airport_code + ", type=" + type + ", country=" + country
				+ ", geo_position=" + geo_position + ", locationId="
				+ locationId + ", inEurope=" + inEurope + ", countryCode="
				+ countryCode + ", coreCountry=" + coreCountry + ", distance="
				+ distance + "]";
	}

	
}
