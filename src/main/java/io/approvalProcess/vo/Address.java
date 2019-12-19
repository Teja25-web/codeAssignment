package io.approvalProcess.vo;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import io.approvalProcess.constraint.AddressHistoryConstraint;

@AddressHistoryConstraint(fromDate = "fromDate", toDate = "toDate")
public class Address {

	private String addressLineOne;
	private String addressLineTwo;
	@NotNull
	private String city;
	@NotNull
	private String country;
	@NotNull
	private String postCode;
	@NotNull
	private LocalDate fromDate;
	@NotNull
	private LocalDate toDate;
	
	public Address() {
		
	}
	
	public Address(String addressLineOne, String addressLineTwo, String city, String country, String postCode,
			LocalDate fromYear, LocalDate toYear) {
		super();
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.city = city;
		this.country = country;
		this.postCode = postCode;
		this.fromDate = fromYear;
		this.toDate = toYear;
	}
	
	public LocalDate getFromYear() {
		return fromDate;
	}
	public void setFromYear(LocalDate fromYear) {
		this.fromDate = fromYear;
	}
	public LocalDate getToYear() {
		return toDate;
	}
	public void setToYear(LocalDate toYear) {
		this.toDate = toYear;
	}
	public String getAddressLineOne() {
		return addressLineOne;
	}
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}
	public String getAddressLineTwo() {
		return addressLineTwo;
	}
	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
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
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	
}
