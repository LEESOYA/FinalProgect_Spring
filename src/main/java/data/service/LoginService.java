package data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dao.LoginDao;
import data.dto.LoginDto;

@Service
public class LoginService implements LoginServiceInter{

	@Autowired
	private LoginDao dao;

	@Override
	public void insertLogin(LoginDto dto) {
		// TODO Auto-generated method stub
		dao.insertLogin(dto);
	}

	@Override
	public boolean isCheckPass(String user_email, String user_pass) {
		// TODO Auto-generated method stub
		return dao.isCheckPass(user_email, user_pass)==0?false:true;
	}

	@Override
	public LoginDto idReturn(String user_email) {
		// TODO Auto-generated method stub
		return dao.idReturn(user_email);
	}


	
	
}
