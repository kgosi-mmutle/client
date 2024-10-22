package com.client.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
/*
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 * 
 * @Setter
 * 
 * @Getter
 * 
 * @ToString
 */
	public class Client {
	@NotEmpty
	@NotNull
	private String firstName;
	@NotEmpty
	@NotNull
	private String lastName;
	@NotEmpty
	@NotNull
	private long mobileNumber;
	@NotEmpty
	@NotNull
	private long idNumber;
	@NotEmpty
	@NotNull
	private String physicalAddress;

	public Client() {
	}

	public Client(String firstName, String lastName, long mobileNumber, long idNumber, String physicalAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.idNumber = idNumber;
		this.physicalAddress = physicalAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", idNumber=" + idNumber + ", physicalAddress=" + physicalAddress + "]";
	}

}
