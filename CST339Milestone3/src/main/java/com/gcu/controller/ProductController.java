package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.ProductModel;

@Controller
@RequestMapping("/product")
public class ProductController 
{
	/**
	 * Add product model and return product as the vioew
	 * @param 
	 * @return
	 */
	public String print(Model model)
	{
		model.addAttribute("productModel", new ProductModel(0, null, null, 0, 0));
		return "product";
	}
	
	/**
	 * When form is submitted, bind input to LoginModel 
	 * @param
	 * @return
	 */
	@PostMapping("createProduct")
	public String createSong(@Valid ProductModel productModel, BindingResult bindingResult, Model model)
	{
		System.out.println(String.format("Product name is %s, with price of %s, and its description is %s",productModel.getName(), productModel.getPrice(),productModel.getDescription()));
		
		//check for errors
		if(bindingResult.hasErrors())
		{
			return "product";
		}
		model.addAttribute("result", "The" + productModel.getName() + "is successfully created");
		return "home";
	}
}
