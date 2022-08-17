package com.spring.web.app.entity;

import lombok.Data;

@Data
public class ClientEntity {
	
	
	private int id;
	private String firtsName;
	private String lastName;
	private int typeDocument;
	private int numberDocument;
	private int country;
	private int cityId;
	private String mail;
	private String address;
	private String phone;
	private String creationDate;
	private String updateDate;
	private int userIdCreation;
	private int userIdUpdate;
	private int positionId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(int typeDocument) {
		this.typeDocument = typeDocument;
	}
	public int getNumberDocument() {
		return numberDocument;
	}
	public void setNumberDocument(int numberDocument) {
		this.numberDocument = numberDocument;
	}
	public int getCountry() {
		return country;
	}
	public void setCountry(int country) {
		this.country = country;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public int getUserIdCreation() {
		return userIdCreation;
	}
	public void setUserIdCreation(int userIdCreation) {
		this.userIdCreation = userIdCreation;
	}
	public int getUserIdUpdate() {
		return userIdUpdate;
	}
	public void setUserIdUpdate(int userIdUpdate) {
		this.userIdUpdate = userIdUpdate;
	}
	public int getPositionId() {
		return positionId;
	}
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
		
	
}
