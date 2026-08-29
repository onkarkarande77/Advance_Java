package com.rest.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.PaymentRequest;
import com.bean.PaymentResponse;

 

@RestController
@RequestMapping("payment")
public class PaymentConttroler {
	private static final String SUCCESS_STATUS="success";
	private static final String DECLINED_STATUS="failure";
	 
	
	
	
	@PostMapping("pay")            //(@requstparam("custId") String custId)
	public PaymentResponse checkUPI(@ModelAttribute("payment") PaymentRequest req) {
		
		PaymentResponse pres=new PaymentResponse();
		
		if(req.getCustId().equals("123"))
		{
			pres.setAuth_status(SUCCESS_STATUS);
		}
		else {
			pres.setAuth_status(DECLINED_STATUS);
		}
		
		
		return pres;
	}
	
//	@PostMapping("pay")
//	public String status(@ModelAttribute("payment") PaymentRequest pr) {
//		 if(pr.getCustId().equals("123")) {
//			 return "auth done";
//		 }
//		 else {
//		   return "failure";
//		 
//		 }
//		 }
		
		 
	}
	
	
 

