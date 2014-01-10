package net.jun.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import net.jun.service.ISimpleService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SuppressWarnings("unchecked")
public class HelloWorld {

	@Resource(name = "simpleService")
	private ISimpleService simpleService;

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
		// model.addAttribute("liu", userId);
		return "hello";
	}

	// @ModelAttribute(value="liu")
	// public String populateModel(@RequestParam String userId) {
	// System.out.println("执行populateModel");
	// return userId;
	// }

	@RequestMapping(value = "/hello2")
	@ResponseBody
	public String hello() {
		Map map = new HashMap();
		map.put("1", 3);
		map.put("2", 2);
		simpleService.getUserInfo(map);
		return "pepe";
	}
}
