package com.example.ems.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="locations")
public class Location implements DomainObject {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOC_SEQ")
	@SequenceGenerator(name="LOC_SEQ", sequenceName="LOCATIONS_SEQ")
	@Column(name="location_id")
	private Integer locationId;
	
	@Column(name="street_address")
	private String streetAddress;
	
	@Column(name="postal_Code")
	private String postalCode;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state_province")
	private String stateProvince;
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country country;

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
