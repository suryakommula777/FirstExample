package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping("/hi")
	String home(ModelMap modal) {
		System.out.println("testing incoming changes..!");
		System.out.println("testing outgoing changes");
		System.out.println("merge test");
		return "hello";
	}
}
