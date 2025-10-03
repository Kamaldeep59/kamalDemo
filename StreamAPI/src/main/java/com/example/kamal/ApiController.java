package com.example.kamal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@GetMapping("hello")
	public String m1() {
		
		return "abc";
		
	}
	

	
}
