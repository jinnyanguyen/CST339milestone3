package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.LoginModel;
import com.gcu.service.LoginBusinessService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
    private LoginBusinessService security;

    @GetMapping("/")
    public String display(Model model){

        model.addAttribute("title","Login Form");
        model.addAttribute("loginModel", new LoginModel());

        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model){

    	security.authenticate(loginModel.getUsername(), loginModel.getPassword());
    	System.out.print(String.format("Admin '%s %s' registered. Username is %s and Password is %s", loginModel.getUsername(), loginModel.getPassword()));
        
    	//Check for errors
    	if(bindingResult.hasErrors())
    	{
            return "login";
    	}
    	
    	model.addAttribute("title","Login Form");
    	return "home";
    }
}
