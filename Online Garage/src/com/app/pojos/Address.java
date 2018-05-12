package com.app.pojos;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * The persistent class for the address_info database table.
 * 
 */
@Entity
@Table(name="address_info")
public class Address implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private int m_id;
	@NotNull(message="Enter an Integer Value")
	private int housenumber;
	
	@NotEmpty(message="Enter a String")
	private String city;
	
	@NotEmpty
	private String country;
	
	@NotEmpty
	private String state;
	
	@NotEmpty
	private String streetname;
	
	@NotNull
	private int zipcode;
	private Member memberInfo;

	public Address() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getM_id() {
		return m_id;
	}


	public void setM_id(int m_id) {
		this.m_id = m_id;
	}


	public int getHousenumber() {
		return this.housenumber;
	}

	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}


	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public String getStreetname() {
		return this.streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}


	public int getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	//bi-directional one-to-one association to Member
	@OneToOne(mappedBy="addressInfo")
	public Member getMemberInfo() {
		return this.memberInfo;
	}
	public void setMemberInfo(Member memberInfo) {
		this.memberInfo = memberInfo;
	}

}