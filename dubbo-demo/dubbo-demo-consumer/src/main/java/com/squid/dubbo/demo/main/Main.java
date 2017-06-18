package com.squid.dubbo.demo.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.squid.dubbo.demo.service.GreetingService;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		GreetingService greetingService = (GreetingService) context.getBean("greetingService");
		String greetMessage = greetingService.hello("Eric");
		System.err.println("Consumer ==> " + greetMessage);
		context.destroy();
	}
}