package net.jun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

	@RequestMapping("/hello/{userId}")
	public String hello(@PathVariable String userId, Model model) {
		System.out.println(userId);
		model.addAttribute("liu", "pepe");
		return "hello";
	}

	@RequestMapping("/hello1")
	public String hello1(
			@RequestParam(value = "userId", required = false) Object userId,
			Model model) {
		System.out.println("执行hello1");
		//model.addAttribute("liu", userId);
		return "hello";
	}
	
//	@ModelAttribute(value="liu")
//    public String populateModel(@RequestParam String userId) {  
//		System.out.println("执行populateModel");
//		return userId;
//    }
	
	@RequestMapping(value = "/hello2", method = RequestMethod.PUT)
	@ResponseBody
	public String hello(){
		return "pepe";
	}
}
