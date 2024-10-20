package com.sandyboss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping("/welcome")
	public String hello() {
		return "Hi, My name is Sudhir Khandare I am going to learn  devops";
	}
}
