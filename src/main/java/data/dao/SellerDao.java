package data.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import data.dto.SellerCompanyDto;
import data.dto.SellerDto;

@Repository
public class SellerDao extends SqlSessionDaoSupport implements SellerDaoInter {

	@Override
	public void insertSeller(SellerDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().insert("insertOfSeller", dto);
	}

	@Override
	public void insertSellerCompany(SellerDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().insert("insertOfSellerCompany", dto);
	}
	
}
