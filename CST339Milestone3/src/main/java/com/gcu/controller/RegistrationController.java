package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.RegistrationModel;
import com.gcu.service.LoginBusinessService;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
    private LoginBusinessService security;

	    @GetMapping("/")
	    public String display(Model model){

	        model.addAttribute("registrationModel", new RegistrationModel());

	        return "register";
	    }

	    
	/**
	 *  
	 * @param registrationModel
	 * @param bindingResult
	 * @param model
	 * @return
	 */
    @PostMapping("/doregister")
    public String doRegister(@Valid RegistrationModel registrationModel, BindingResult bindingResult, Model model)
    {
    	security.authenticate(registrationModel.getUsername(), registrationModel.getPassword());
    	
    	System.out.print(String.format("Admin '%s %s' registered. Username is %s and Password is %s", registrationModel.getUsername(), registrationModel.getPassword(), registrationModel.getFirstName(), registrationModel.getLastName(), registrationModel.getEmail(), registrationModel.getPhoneNumber()));
    	
    	// check for errors
    	if(bindingResult.hasErrors())
    	{
    		return "register";
    	}
    	
    	model.addAttribute("result","You are registered : )" + registrationModel.getUsername());
    	return "home";
    }
        
}
