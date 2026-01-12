package com.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.AccountBean;

@Controller
public class HomeController {
  //@RequestMapping(value="/",method=RequestMethod.GET)
  @GetMapping("/")
  public String myHomePage() {
	  return "index";
  }
	//to map newacct url 
  @GetMapping("newacct")
  public String getNewAcctPage() {
	  return "register";
  }
  //map request to capture values from the form
 // @RequestMapping(value ="submitform",method =RequestMethod.POST)
  @PostMapping("submitform")
  //public String getNewAccDetails(HttpServletRequest req,Model m) {
	   //get the values from the client
       //String acctId=req.getParameter("acctId");
       //String acctName=req.getParameter("acctName");
    
  public String getNewAcct(@RequestParam("acctId")Integer id,@RequestParam("acctName")String name,Model m) { 
	//injection the capture data into the spring model object
	AccountBean ab=new AccountBean();
    ab.setId(id);
    ab.setName(name);
                    //key      value
    m.addAttribute("acctId",ab.getId());
    m.addAttribute("acctName",ab.getName());
    m.addAttribute("acct",ab); 
     
     return "showdata";
  
  }
  
  @GetMapping("/*")
  public String getToFail(){
	  return "failstart";
  }

}
