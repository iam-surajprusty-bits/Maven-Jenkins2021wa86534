package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Hello from Suraj Prusty (2021wa86534)";
	}

}
