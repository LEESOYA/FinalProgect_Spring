package spring.form.acorn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import data.dao.LoginDaoInter;
import data.dto.LoginDto;
import data.service.LoginServiceInter;


@RestController
@CrossOrigin
public class LoginController {
	
	@Autowired
	private LoginDaoInter dao;
	@Autowired
	private LoginServiceInter service;
	
	@GetMapping("/login/test")
	public void test()
	{
		System.out.println("react>>test");
	}
	
	
	@PostMapping("/login/add")
	public void insert(@RequestBody LoginDto dto)
	{
		System.out.println("react>>add");
		System.out.println(dto);
		dao.insertLogin(dto);
	}
	
	
	@PostMapping("/login/join")
	public LoginDto join(@RequestBody LoginDto dto)
	{
		System.out.println("react>>join");
		System.out.println(dto.getUser_email());
		System.out.println(dto.getUser_pass());
		String user_email=dto.getUser_email();
		
		
		
//		if(service.isCheckPass(dto.getUser_email(),dto.getUser_pass()) == true)
//		{
//			
//		}
		
		return service.idReturn(user_email);
			
	}
}

