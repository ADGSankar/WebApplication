package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {  
	

	@RequestMapping(value="/login")
	public String sayHello()
	{
		return "login";
//		return "/WEB-INF/views/"+"welcome"+".jsp"; we can do this also without adding a bean to append /WEB-INF/views/ as prefix and .jsp as suffix
	}
}
