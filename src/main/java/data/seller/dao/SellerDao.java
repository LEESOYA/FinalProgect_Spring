package data.seller.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import data.dto.SellerDto;

@Repository
public class SellerDao extends SqlSessionDaoSupport implements SellerDaoInter {

	//판매자  회원가입 - 기본 정보 등록
	@Override
	public void insertSeller(SellerDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().insert("insertOfSeller", dto);
	}

	//판매자 회원가입 - 사업자 정보 등록
	@Override
	public void insertSellerCompany(SellerDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().insert("insertOfSellerCompany", dto);
	}
}
