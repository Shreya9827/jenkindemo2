package com.sj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/hi")
	public String sayHi() {
			
		return "hii.. everyone";

	}
	public String sayGreet() {
		 return "Greet ";
	}

}
