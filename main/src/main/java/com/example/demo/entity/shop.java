package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Shop_Details")
public class shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shopId;
	@Column(name = "ShopEmployee_ID")
	private int shopEID;
	@Column
	private String Shopnm;
	@Column
	private String ShopOwner;
	
	public shop() {
		
	}
	
	
	
	public shop(int shopEID, String shopnm, String shopOwner) {
		super();
		this.shopEID = shopEID;
		Shopnm = shopnm;
		ShopOwner = shopOwner;
	}




	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public int getShopEID() {
		return shopEID;
	}
	public void setShopEID(int shopEID) {
		this.shopEID = shopEID;
	}
	public String getShopnm() {
		return Shopnm;
	}
	public void setShopnm(String shopnm) {
		Shopnm = shopnm;
	}
	public String getShopOwner() {
		return ShopOwner;
	}
	public void setShopOwner(String shopOwner) {
		ShopOwner = shopOwner;
	}
	@Override
	public String toString() {
		return "shop [shopId=" + shopId + ", shopEID=" + shopEID + ", Shopnm=" + Shopnm + ", ShopOwner=" + ShopOwner
				+ "]";
	}
	
	
	
	
}
