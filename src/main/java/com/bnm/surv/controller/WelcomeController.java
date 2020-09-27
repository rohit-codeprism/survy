package com.bnm.surv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bnm.surv.service.SurveyService;

@RestController

public class WelcomeController {
	
	    @Autowired
       	public SurveyService surveyService; 
	
           @GetMapping("/welcome")	
 	       public String Message(@RequestParam("name") String  name)
	       {
	    	   return "Welcome"+surveyService.getSurvey(name);
	       }

}
