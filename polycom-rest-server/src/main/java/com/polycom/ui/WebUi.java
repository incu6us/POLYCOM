package com.polycom.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebUi {
	
	@RequestMapping("/")
	public String redirectingToIndex(){
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String makePage(){
		return "index";
	}

}
