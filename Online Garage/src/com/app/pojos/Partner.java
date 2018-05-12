package com.app.pojos;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.mapping.Set;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the partner database table.
 * 
 */
@Entity
@Table(name="Partner")
public class Partner implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int partnerId;
	
	/*@NotEmpty
	@Email
	*/
	private String email;

	/*@NotEmpty
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{3,20})", message = "Blank or Invalid Format")*/
	private String password;
	
	//@NotEmpty
	private String ownerName;
	
	//@NotEmpty
	private String phone;

	//@NotNull
	private String alterphone;
	
	private boolean mechanical_fault;
	private boolean battery_jump_start;
	private boolean flat_tyre;
	private boolean key_lock;
	private boolean towing;
	private boolean fuel;
	private boolean vehicle_service;

/*	private String mechanical_fault;
	private String battery_jump_start;
	private String flat_tyre;
	private String key_lock;
	private String towing;
	private String fuel;
	private String vehicle_service;
*/
	//@NotNull
	private int shopnumber;
	
	//@NotEmpty
	private String streetname;
	
	//@NotEmpty
	private String city;
	
	//@NotEmpty
	private String country;
	
	//@NotEmpty
	private String state;
	
	//@NotNull
	private int zipcode;
	
	//@NotEmpty
	private String lat;
	
	//@NotEmpty
	private String lng;

	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	//private List<Transaction> transactions;
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isFuel() {
		return fuel;
	}


	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}

	public boolean isMechanical_fault() {
		return mechanical_fault;
	}


	public void setMechanical_fault(boolean mechanical_fault) {
		this.mechanical_fault = mechanical_fault;
	}


	public boolean isBattery_jump_start() {
		return battery_jump_start;
	}


	public void setBattery_jump_start(boolean battery_jump_start) {
		this.battery_jump_start = battery_jump_start;
	}


	public boolean isFlat_tyre() {
		return flat_tyre;
	}


	public void setFlat_tyre(boolean flat_tyre) {
		this.flat_tyre = flat_tyre;
	}


	public boolean isKey_lock() {
		return key_lock;
	}


	public void setKey_lock(boolean key_lock) {
		this.key_lock = key_lock;
	}


	public boolean isTowing() {
		return towing;
	}


	public void setTowing(boolean towing) {
		this.towing = towing;
	}


	public boolean isVehicle_service() {
		return vehicle_service;
	}


	public void setVehicle_service(boolean vehicle_service) {
		this.vehicle_service = vehicle_service;
	}


	public Partner() {
	}

	@Column(length=11,name="AlterPhone")
	public String getAlterphone() {
		return this.alterphone;
	}

	public void setAlterphone(String alterphone) {
		this.alterphone = alterphone;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getShopnumber() {
		return shopnumber;
	}


	public void setShopnumber(int shopnumber) {
		this.shopnumber = shopnumber;
	}


	public String getStreetname() {
		return streetname;
	}


	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	public String getLat() {
		return lat;
	}


	public void setLat(String lat) {
		this.lat = lat;
	}


	public String getLng() {
		return lng;
	}


	public void setLng(String lng) {
		this.lng = lng;
	}


	@Override
	public String toString() {
		return "Partner [partnerId=" + partnerId + ", alterphone=" + alterphone
				+ ", email=" + email + ", password=" + password
				+ ", ownerName=" + ownerName + ", phone=" + phone
				+ ", mechanical_fault=" + mechanical_fault
				+ ", battery_jump_start=" + battery_jump_start + ", flat_tyre="
				+ flat_tyre + ", key_lock=" + key_lock + ", towing=" + towing
				+ ", fule=" + fuel + ", vehicle_service=" + vehicle_service
				+ ", shopnumber=" + shopnumber + ", streetname=" + streetname
				+ ", city=" + city + ", country=" + country + ", state="
				+ state + ", zipcode=" + zipcode + ", lat=" + lat + ", lng="
				+ lng + "]";
	}

}