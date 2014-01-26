package com.junapp.test;

import org.activiti.engine.RuntimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class App extends TestCase {

	public void test1() {

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		RuntimeService rs = (RuntimeService) ac.getBean("runtimeService");
		
		rs.startProcessInstanceByKey("process123");

	}
}