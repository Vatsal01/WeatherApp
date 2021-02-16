package com.example.weatherAPI.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


//To handle any kind of error, an error page is displayed with link to redirect to homepage
//It can mostly be due to a spelling mistake in the name of the city

@Controller
public class ErrorHandleClass implements  ErrorController {
	
	 @RequestMapping("/error")
	 
	    public ModelAndView handleError() {
		 
	        ModelAndView modelAndView = new ModelAndView();
	     
	        modelAndView.setViewName("error");
	        
	        return modelAndView;
	    }
	 
	    @Override
	    public String getErrorPath() {
	    	
	        return "/error";
	    }
}
