package data.service;

import data.dto.LoginDto;

public interface LoginServiceInter {
	public void insertLogin(LoginDto dto);
	//���̵�� ����� �´��� üũ
	public boolean isCheckPass(String user_email, String user_pass);
	public LoginDto idReturn(String user_email);
}
