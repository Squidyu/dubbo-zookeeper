package com.squid.dubbo.demo.service.impl;

import java.util.Date;

import com.squid.dubbo.demo.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {

	public String hello(String name) {
		System.out.println("Hello Service is calling : " + new Date());
		String greetMessage = "Hello, " + name;
		return greetMessage;
	}

}