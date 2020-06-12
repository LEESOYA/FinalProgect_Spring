package data.seller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dto.SellerDto;
import data.seller.dao.SellerDaoInter;

@Service
public class SellerService implements SellerServiceInter {

	@Autowired
	SellerDaoInter dao;

	@Override
	public void insertSeller(SellerDto dto) {
		// TODO Auto-generated method stub
		dao.insertSeller(dto);
		dao.insertSellerCompany(dto);
	}
}
