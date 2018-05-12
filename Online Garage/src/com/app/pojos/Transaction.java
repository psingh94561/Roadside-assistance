package com.app.pojos;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the transaction database table.
 * 
 */
@Entity
@Table(name="transaction")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int transactionId;
	
	private Partner partner;
	
	private Member memberInfo;
	
	private boolean mechanical_fault;
	private boolean battery_jump_start;
	private boolean flat_tyre;
	private boolean key_lock;
	private boolean towing;
	private boolean fuel;
	private boolean vehicle_service;
	private Integer bill;
	//@NotEmpty
	private String lat;
	
	//@NotEmpty
	private String lng;


	public Transaction() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	

	//bi-directional many-to-one association to Partner
	@ManyToOne
	@JoinColumn(name="partnerId")
	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}


	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="memberId")
	public Member getMemberInfo() {
		return this.memberInfo;
	}

	public void setMemberInfo(Member memberInfo) {
		this.memberInfo = memberInfo;
	}
	public Integer getBill() {
		return bill;
	}


	public void setBill(Integer bill) {
		this.bill = bill;
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


	public boolean isFuel() {
		return fuel;
	}


	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}


	public boolean isVehicle_service() {
		return vehicle_service;
	}


	public void setVehicle_service(boolean vehicle_service) {
		this.vehicle_service = vehicle_service;
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
}