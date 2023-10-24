package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.context.annotation.SessionScope;

import com.gcu.service.BusinessServiceInterface;
import com.gcu.service.LoginBusinessService;

@Configuration
@ComponentScan(basePackages = "com.gcu")
public class SpringConfig 
{
	@Bean(name="businessService", initMethod="init",destroyMethod="destroy")
	@SessionScope
	@Primary
	public BusinessServiceInterface getBusiness()
	{
		return new LoginBusinessService();
	}
}
