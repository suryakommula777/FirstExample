package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping("/hi")
	String home(ModelMap modal) {
		System.out.println("incoming changes");
		System.out.println("outgoing changes");
		System.out.println("merge operations");
		System.out.println("all done");
		return "hello";
	}
}
