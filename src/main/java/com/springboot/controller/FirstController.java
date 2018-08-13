package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping("/hi")
	String home(ModelMap modal) {
		System.out.println("testing in first line");
		System.out.println("testing with second line");
		System.out.printlnl("added third line");
		return "hello";
	}
}
