package com.first_webapp;

public class UserValidationService {
	
	public boolean isUserValid(String name,String password)
	{
		if(name.equals("sankar")&&password.equals("sankar1998"))
			return true;
		return false;
	}

}
