package com.gcu.service;

import org.springframework.stereotype.Service;

@Service
public class RegistrationBusinessService 
{
	public boolean authenticated(String username, String password)
	{
		System.out.println("You are registered : )");
		return true;
	}
}
