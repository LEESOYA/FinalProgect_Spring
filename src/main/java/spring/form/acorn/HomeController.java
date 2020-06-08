package spring.form.acorn;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import data.dto.TestDto;
import data.service.TestServiceInter;

@Controller
public class HomeController {

	@Autowired
	TestServiceInter service;
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String home() {
		return "test/main";
	}
	//1. 시리얼라이즈 
	@PostMapping("/process.do")
	@ResponseBody
	public String test1(TestDto dto) {
		
		return dto.getName()+"---"+dto.getAge();
	}
	
	//2. JSON으로 받기
	@PostMapping("/process.do2")
	@ResponseBody
	public Object test2(@RequestBody TestDto dto) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		map.put("name", dto.getName());
		map.put("age", dto.getAge());
		
		return map;
	}
	
	
}
