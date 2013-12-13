package net.jun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping("/hello/{paramId}")
	public String hello(@PathVariable String paramId, Model model) {
		System.out.println(paramId);
		model.addAttribute("liu", "pepe");
		return "hello";
	}
}
