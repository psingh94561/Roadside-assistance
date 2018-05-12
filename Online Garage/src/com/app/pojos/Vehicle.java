package com.app.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vehical database table.
 * 
 */
@Entity
@Table(name="vehicles_table")
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;
	private int vehiclereg;
	private String company;
	private int model;
	private String vehiclename;
	private int version;
	private int yearOfManufacturing;
	private Member memberInfo;


	public Vehicle() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getVehiclereg() {
		return this.vehiclereg;
	}

	public void setVehiclereg(int vehiclereg) {
		this.vehiclereg = vehiclereg;
	}


	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}


	public int getModel() {
		return this.model;
	}

	public void setModel(int model) {
		this.model = model;
	}


	public String getVehiclename() {
		return this.vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}


	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	public int getYearOfManufacturing() {
		return this.yearOfManufacturing;
	}

	public void setYearOfManufacturing(int yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}

	
	//bi-directional many-to-one association to Member
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="memberId")
	public Member getMemberInfo() {
		return this.memberInfo;
	}

	public void setMemberInfo(Member memberInfo) {
		this.memberInfo = memberInfo;
	}


	@Override
	public String toString() {
		return "[vehiclereg=" + vehiclereg + ", company=" + company
				+ ", model=" + model + ", vehiclename=" + vehiclename
				+ ", version=" + version + ", yearOfManufacturing="
				+ yearOfManufacturing + ", MemberID=" +memberInfo.getMemberId()+ "]";
	}


}