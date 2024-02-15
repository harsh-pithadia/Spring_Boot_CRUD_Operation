package com.Product.springbootcrudoperation.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.Product.springbootcrudoperation.model.Products;
import com.Product.springbootcrudoperation.repository.ProductsRepository;


@Service
public class ProductsService {

@Autowired
ProductsRepository productsRepository;

public List<Products> getAllProducts(){
	List<Products> products = new ArrayList<Products>();
	productsRepository.findAll().forEach(products1 -> products.add(products1));  
return products;
}

public Products getProductsById(int id)   
{  
return productsRepository.findById(id).get();  
}  

public void saveOrUpdate(Products products)   
{  
productsRepository.save(products);  
} 

public void delete(int id)   
{  
productsRepository.deleteById(id);  
}  
//updating a record  
public void update(Products products, int id)   
{  
productsRepository.save(products);  
}  

}
