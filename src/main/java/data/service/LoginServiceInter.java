package data.service;

import data.dto.LoginDto;

public interface LoginServiceInter {
	public void insertLogin(LoginDto dto);
	//아이디와 비번이 맞는지 체크
	public boolean isCheckPass(String user_email, String user_pass);
	public LoginDto idReturn(String user_email);
}
