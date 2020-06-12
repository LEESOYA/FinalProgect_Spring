package data.seller.service;

import data.dto.SellerDto;

public interface SellerServiceInter {
	//판매자  회원가입 - 기본 정보 등록
	public void insertSeller(SellerDto dto);
}
