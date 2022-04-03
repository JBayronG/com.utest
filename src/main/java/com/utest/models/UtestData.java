package com.utest.models;

public class UtestData {
	
	private String firstName;
	private String lastName;
	private String email;
	private String city;
	private String postalCode;
	private String srcPais;
	private String password;
	private String confPassword;
	private String strTitle;
	
	public String getFirtsName() {
		return firstName;
	}
	public void setFirtsName(String firtsName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCityS(String city) {
		this.city= city;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getSrcPais() {
		return srcPais;
	}

	public void setSrcPais(String srcPais) {
		this.srcPais = srcPais;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfPassword() {
		return confPassword;
	}
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}

}
