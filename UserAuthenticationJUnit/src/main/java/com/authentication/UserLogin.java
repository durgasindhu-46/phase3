package com.authentication;

public class UserLogin {
	
	public boolean authentication(String emailid,String password) {
		if(emailid=="user"& password=="123") {
			return true;
		}
		else {
			return false;
		}
	}
}