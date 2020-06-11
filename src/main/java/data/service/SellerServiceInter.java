package data.service;

import data.dto.SellerDto;

public interface SellerServiceInter {
	//판매자  회원가입 - 기본 정보 등록
	public void insertSeller(SellerDto dto);
	
//	//판매자 회원가입 - 사업자 정보 등록
//	public void insertSellerCompany(SellerDto dto);
}
