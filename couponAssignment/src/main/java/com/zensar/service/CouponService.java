package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zensar.dto.CouponDto;
import com.zensar.entity.Coupon;

public interface CouponService {
	
	public CouponDto getCoupon(int couponId);
	public List<CouponDto> getAllCoupons();
	public void updateCouponId(int couponId, CouponDto couponDto);
	public CouponDto insertCoupon(CouponDto couponDto);
	public void deleteCoupon(int couponId);
	
}
