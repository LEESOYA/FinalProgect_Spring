package data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dao.SellerDaoInter;
import data.dto.SellerDto;

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

//	@Override
//	public void insertSellerCompany(SellerCompanyDto dto) {
//		// TODO Auto-generated method stub
//		dao.insertSellerCompany(dto);
//	}
}
