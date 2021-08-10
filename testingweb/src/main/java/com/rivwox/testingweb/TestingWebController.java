package com.rivwox.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestingWebController {
	@GetMapping("/")
	@ResponseBody
	public String greeting() {
		return "Hello, World!";
	}
}
