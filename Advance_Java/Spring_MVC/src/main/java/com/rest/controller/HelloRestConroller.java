package com.rest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Greeting;

//@Controller
@RestController  //is combination of two, one is controller and responseBody
@RequestMapping("/test")
public class HelloRestConroller {
	
//@ResponseBody

	 @GetMapping("/hello")
	 public String getHello() {
		 return "welcome to REST API";
	 }
	 
	 @GetMapping("/greet")
	 public Greeting getMsg() {
		 Greeting g=new Greeting();
		 g.setId(1);
		 g.setMessage("hello ");
		 
		 return g;
	 }
	 
	 @GetMapping("/name/{id}/{name}")
	 public String getName(@PathVariable String id,@PathVariable String name) {
		 return "Welcome to Spring -"+id+" "+name;
	 }


}
