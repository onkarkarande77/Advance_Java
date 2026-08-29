package com.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.PaymentRequest;

@RestController
@RequestMapping("payment")
public class PayRestController {
  public static final  String SUCCESS_STATUS="success";
  public static final String DECLIEND_STATUS="Failure";
  
  @GetMapping("hello")
    public String sayHello() {
	 
	  return "Hello to resp Project";
  }
  
  @PostMapping("pay")
  public  PaymentResponse checkUPI(@ModelAttribute("payment") PaymentRequest pr){
	    
	   PaymentResponse pres=new PaymentResponse();
	    
	   if(pr.getCustId().equals("123")) {
		   pres.setAuth_status(SUCCESS_STATUS);
		   System.out.println("done");
	   } 
	   else {
		   pres.setAuth_status(DECLIEND_STATUS);
	   }
		   
	  return pres;  
	   
	  
  }
}
