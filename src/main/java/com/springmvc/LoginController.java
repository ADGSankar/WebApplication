package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.first_webapp.UserValidationService;

@Controller
public class LoginController {  
	
	UserValidationService checkUser=new UserValidationService();
	
	@RequestMapping(value="/login",method=RequestMethod.GET )
	public String showLoginPage()
	{
		return "login";	
//		return "/WEB-INF/views/"+"welcome"+".jsp"; we can do this also without adding a bean to append /WEB-INF/views/ as prefix and .jsp as suffix
	}
	@RequestMapping(value="/login",method=RequestMethod.POST )
	public String handleLoginRequest(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
			if(!checkUser.isUserValid(name, password))
			{
				model.put("errorMsg", "Invalid Credentials");
				return "login";
			}
			else
			{
				model.put("pname",name);
				model.put("password",password);
				return "welcome";
//				return "/WEB-INF/views/"+"welcome"+".jsp"; we can do this also without adding a bean to append /WEB-INF/views/ as prefix and .jsp as suffix
			}
	}
}
