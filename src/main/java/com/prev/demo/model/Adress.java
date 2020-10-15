package com.prev.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Adress {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	@JsonIgnore
	private Integer id;
	private String city;
	private String neighborhood;
	private String zipCode;
	
	
	
	public Adress() {
		super();
	}
	
	
	public Adress(Integer id, String city, String neighborhood, String zipCode) {
		super();
		this.id = id;
		this.city = city;
		this.neighborhood = neighborhood;
		this.zipCode = zipCode;
	}


	public Adress(String city, String neighborhood, String zipCode) {
		super();
		this.city = city;
		this.neighborhood = neighborhood;
		this.zipCode = zipCode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", city=" + city + ", neighborhood=" + neighborhood + ", zipCode=" + zipCode + "]";
	}
	
	
	
	
	
}
