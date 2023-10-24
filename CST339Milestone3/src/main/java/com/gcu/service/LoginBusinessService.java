package com.gcu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gcu.model.ProductModel;

@Service
public class LoginBusinessService implements BusinessServiceInterface{

	public boolean authenticate(String username, String password) 
	{ 
		System.out.println("authentication");
		return true;
	}
	    @Override
	    public void test() {
	        System.out.println("Test");
	    }
	    
	    @Override
	    public void init() {
	        System.out.println("init");
	    }
	    
	    @Override
	    public void destroy() {
	        System.out.println("destroy");
	    }

	    @Override
	    public List<ProductModel> getProducts() {
	        List<ProductModel> products = new ArrayList<>();
	        products.add(new ProductModel(0L, "000000001","Product 1", 1.00f, 1));
	        products.add(new ProductModel(1L, "000000002","Product 2", 2.00f, 2));
	        products.add(new ProductModel(2L, "000000003","Product 3", 3.00f, 3));
	        products.add(new ProductModel(3L, "000000004","Product 4", 4.00f, 4));
	        products.add(new ProductModel(4L, "000000005","Product 5", 5.00f, 5));
	        return products;
	    }
    
}

