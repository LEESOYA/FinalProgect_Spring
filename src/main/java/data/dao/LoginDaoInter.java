package data.dao;

import java.util.HashMap;

import data.dto.LoginDto;

public interface LoginDaoInter {
	public void insertLogin(LoginDto dto);
	public int isCheckPass(String user_email, String user_pass);
	public LoginDto idReturn(String user_email);
}
