package com.itheima.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Autowired
	private Environment environment;
	
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	@ResponseBody
	@GetMapping("/hello")
	public String hello(){
		
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("url"));
		
		System.out.println(name + "======" + url);
		return "Hello World";
	}
	
	@GetMapping("/index")
	public String user(){
		return "index.html";
	}
}
