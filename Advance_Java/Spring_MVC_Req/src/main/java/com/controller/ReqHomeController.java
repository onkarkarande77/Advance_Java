package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bean.PaymentRequest;

@Controller
public class ReqHomeController {
	
	@GetMapping("/")
	public String myHomePage() {
		return "index";
	}
	
	@GetMapping("pay")
	public String payReqPage(Model m) {
		PaymentRequest req=new PaymentRequest();
		
		m.addAttribute("payment",req);
		
		return "payment_request";
	}

}
