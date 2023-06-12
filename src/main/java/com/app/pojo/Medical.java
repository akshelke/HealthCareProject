package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="medical")
public class Medical extends BaseEntity{
  private String ShopkeeperName;
  private String Shopname;
  private String OpenTime;
  private String CloseTime;
  private String Mob_no;
  private String Address;
  private String Pincode;
  
	public Medical() {
	super();

	}
	public Medical(String shopkeeperName, String shopname, String openTime, String closeTime, String mob_no,
			String address, String pincode) {
		super();
		ShopkeeperName = shopkeeperName;
		Shopname = shopname;
		OpenTime = openTime;
		CloseTime = closeTime;
		Mob_no = mob_no;
		Address = address;
		Pincode = pincode;
	}

	public String getShopkeeperName() {
		return ShopkeeperName;
	}

	public void setShopkeeperName(String shopkeeperName) {
		ShopkeeperName = shopkeeperName;
	}

	public String getShopname() {
		return Shopname;
	}

	public void setShopname(String shopname) {
		Shopname = shopname;
	}

	public String getOpenTime() {
		return OpenTime;
	}

	public void setOpenTime(String openTime) {
		OpenTime = openTime;
	}

	public String getCloseTime() {
		return CloseTime;
	}

	public void setCloseTime(String closeTime) {
		CloseTime = closeTime;
	}

	public String getMob_no() {
		return Mob_no;
	}

	public void setMob_no(String mob_no) {
		Mob_no = mob_no;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPincode() {
		return Pincode;
	}

	public void setPincode(String pincode) {
		Pincode = pincode;
	}


	

}