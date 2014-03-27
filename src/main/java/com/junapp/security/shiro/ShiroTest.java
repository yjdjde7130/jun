package com.junapp.security.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//shiro测试类
public class ShiroTest {

	private static Logger logger = LoggerFactory.getLogger(ShiroTest.class);

	public static void main(String[] args) {
		try {
			Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(
					"classpath:shiro.ini");

			org.apache.shiro.mgt.SecurityManager securityManager = factory
					.getInstance();
			SecurityUtils.setSecurityManager(securityManager);

			Subject user = SecurityUtils.getSubject();

			UsernamePasswordToken token = new UsernamePasswordToken("liupei",
					"123456");

			user.login(token);

			logger.info("User is authenticated:  " + user.isAuthenticated());

		} catch (IncorrectCredentialsException e) {
			logger.error("用户登录:  {}", "失败");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

	}
}
