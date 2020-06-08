package spring.form.acorn;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import data.dto.TestDto;

@RestController
public class TestController {

	@PostMapping("/restcontroller.do")
	public Object test(@RequestBody TestDto dto) {
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i=0; i<5;i++) {
			list.add(dto.getName()+"-"+i);
		}
		
		return list;
	}
}
