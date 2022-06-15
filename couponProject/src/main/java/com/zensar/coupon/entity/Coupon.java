package com.zensar.coupon.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	private int couponId;
	private String couponName;
	private int couponPrice;
	
	
	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponName, int couponPrice, String couponDesc) {
		super();
		this.couponId = couponId;
		this.couponName = couponName;
		this.couponPrice = couponPrice;
		
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public int getCouponPrice() {
		return couponPrice;
	}

	public void setCouponPrice(int couponPrice) {
		this.couponPrice = couponPrice;
	}


	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponName=" + couponName + ", couponPrice=" + couponPrice
				+ ", couponDesc="+ "]";
	}
}
