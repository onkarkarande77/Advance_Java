package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.StudentBean;
import com.service.StudentService_I;

@Controller
//@RestController
public class HomeController {
	@Autowired
	StudentService_I serv;
	
	
	
  @GetMapping("/")
  public String homePage() {
	  return "index";
  }
  
  @GetMapping("pay")
  public String payPage() {
	  return "payment";
  }
  
  @GetMapping("signup")
  public String stdSignUp() {
	  
	  return "stdsignup";
  }
  
  @ResponseBody
  @GetMapping("auth")
  public String payAuth(@RequestParam("acctId") String id,Model m) {
	  String id1="123";
	  
	  if(id.equals(id1))
		  return "auth success";
	  
	  else
		  return "fail to authentication";
  }
  
  
  @ResponseBody
  @GetMapping("senddata")
  public String stdSignUpData(@RequestParam("stdId") Integer stdId,@RequestParam("stdName") String stdName,@RequestParam("city") String city) {
	    StudentBean stdb=new StudentBean(stdId, stdName, city);
	    
	    if(serv.create(stdb)) {
	    	return "Data send SuccessFully into the DB";
	    }
	    else {
	  return "Fail To Send Data";
	    }
  }
  
  
}
