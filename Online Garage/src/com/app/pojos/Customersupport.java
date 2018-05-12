package com.app.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customersupport database table.
 * 
 */
@Entity
@NamedQuery(name="Customersupport.findAll", query="SELECT c FROM Customersupport c")
public class Customersupport implements Serializable {
	private static final long serialVersionUID = 1L;
	private int csId;
	private String password;
	private String username;

	public Customersupport() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCsId() {
		return this.csId;
	}

	public void setCsId(int csId) {
		this.csId = csId;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}