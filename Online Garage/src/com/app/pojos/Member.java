package com.app.pojos;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name="member_info")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	private int memberId;
	
	//@NotEmpty
	private String firstName;
	
	//@NotEmpty
	private String lastName;
	

	@NotEmpty(message="email can't be blank")
	@Email(message="not a valid format for email")
	private String email;

	@NotEmpty
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{3,20})", message = "Blank or Invalid Format")
	private String password;
	
	//@NotEmpty
	private String memberShipType;
	
	//@NotNull
	private BigInteger phone;
		
	//@NotNull
	private BigInteger alterphone;
		
	@Column(name = "date")
	private Date dateOfMembership= new Date();
		
	private Address addressInfo;

	public Member() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

/*
	public int getVehicleRegNo() {
		return vehicleRegNo;
	}


	public void setVehicleRegNo(int vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}

*/
	public BigInteger getAlterphone() {
		return this.alterphone;
	}

	public void setAlterphone(BigInteger alterphone) {
		this.alterphone = alterphone;
	}


	@Temporal(TemporalType.DATE)
	
	public Date getDateOfMembership() {
		return this.dateOfMembership;
	}

	public void setDateOfMembership(Date dateOfMembership) {
		this.dateOfMembership = dateOfMembership;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(length=30,name="first_name")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

@Column(length=30,name="last_name")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public BigInteger getPhone() {
		return this.phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}
	
	public String getMemberShipType() {
		return memberShipType;
	}


	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}
/*
	//bi-directional many-to-one association to Bill
	@OneToMany(mappedBy="memberInfo")
	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Bill addBill(Bill bill) {
		getBills().add(bill);
		bill.setMemberInfo(this);

		return bill;
	}

	public Bill removeBill(Bill bill) {
		getBills().remove(bill);
		bill.setMemberInfo(null);

		return bill;
	}
*/
/*
	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="memberInfo")
	public List<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setMemberInfo(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setMemberInfo(null);

		return transaction;
	}

*/
	//bi-directional one-to-one association to Address
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="memberId", referencedColumnName="m_id")
	public Address getAddressInfo() {
		return this.addressInfo;
	}

	public void setAddressInfo(Address addressInfo) {
		this.addressInfo = addressInfo;
	}

/*	//bi-directional many-to-one association to Vehical
	@OneToMany(mappedBy="memberInfo")
	@PrimaryKeyJoinColumn
	public List<Vehicle> getVehicles() {
		return this.vehicles;
	}


	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}*/
/*
	public Vehicle addVehicle(Vehicle vehicle) {
		getVehicles().add(vehicle);
		vehicle.setMemberInfo(this);

		return vehicle;
	}

	public Vehicle removeVehicle(Vehicle vehicle) {
		getVehicles().remove(vehicle);
		vehicle.setMemberInfo(null);

		return vehicle;
	}
*/	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", alterphone=" + alterphone
				+ ", dateOfMembership=" + dateOfMembership + ", email=" + email
				+ ", firstName=" + firstName + ", lastname=" + lastName
				+ ", memberShipType=" + memberShipType + ", password="
				+ password + ", phone=" + phone + "House Number = "+"]";//+addressInfo.getHousenumber()+ "City ="+addressInfo.getCity()+"]";
	}
}