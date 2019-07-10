package com.procurement.seller.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Seller {
	
	@Id
	private String sellerId;
	private String companyName;
	private String registrationNumber;
	private String gstNumber;
	private String supervisor;
	private String contact;
	private String address;
	@Indexed(unique = true)
	private String emailId;
	private String password;
	public Seller(String companyName, String registrationNumber, String gstNumber, String supervisor, String contact,
			String address, String emailId, String password) {
		super();
		this.companyName = companyName;
		this.registrationNumber = registrationNumber;
		this.gstNumber = gstNumber;
		this.supervisor = supervisor;
		this.contact = contact;
		this.address = address;
		this.emailId = emailId;
		this.password = password;
	}
	public String getSellerId() {
		return sellerId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "| "+sellerId+"| "+companyName+"| "+registrationNumber+
				"| "+gstNumber+"| "+supervisor+
				"| "+contact+"| "+address+"| "+emailId+"| "+password;
	}
}
