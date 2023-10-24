package com.gcu.service;

import com.gcu.model.ProductModel;
import java.util.List;

public interface BusinessServiceInterface 
{
    void test();
    List<ProductModel> getProducts();
    void init();
    void destroy();
    
}