package net.jun.controller.login;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {

	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		UsernamePasswordToken token = new UsernamePasswordToken(username,
				password);
		token.setRememberMe(true);
		Subject user = SecurityUtils.getSubject();
		try {
			user.login(token);
		} catch (IncorrectCredentialsException e) {
			System.out.println("ÃÜÂë²»ÕýÈ·!"); 
		}
		
		return "redirect:test";
	}
	
	@RequestMapping("/test")
	public String test(){
		return "test/test";	
	}
	//
	// @RequestMapping("/login")
	// public String login() {
	// UsernamePasswordToken token = new UsernamePasswordToken("yjdjde",
	// "1234");
	// token.setRememberMe(true);
	// Subject user = SecurityUtils.getSubject();
	// user.login(token);
	// return "test/test";
	// }
	//
	// @RequestMapping("/logout")
	// public String logout() {
	// Subject user = SecurityUtils.getSubject();
	// user.logout();
	// return "login/login";
	// }

}
