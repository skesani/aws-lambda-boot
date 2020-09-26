package com.aws.lambda.controller;

import com.aws.lambda.dto.GreetingDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	public GreetingDto sayHello(@RequestParam String name) {
		String message = "Hello " + name;
		GreetingDto dto = new GreetingDto();
		dto.setMessage(message);
		return dto;
	}
}
