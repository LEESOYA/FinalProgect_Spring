package data.dao;

import java.util.HashMap;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import data.dto.LoginDto;


@Repository
public class LoginDao extends SqlSessionDaoSupport implements LoginDaoInter{

	@Override
	public void insertLogin(LoginDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().insert("insertOfLogin",dto);
	}

	@Override
	public int isCheckPass(String user_email, String user_pass) {
		// TODO Auto-generated method stub
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("user_email", user_email);
		map.put("user_pass", user_pass);
		return getSqlSession().selectOne("checkPassOfLogin",map);
	}

	@Override
	public LoginDto idReturn(String user_email) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("checkPassOfLogin2", user_email);
	}


}
