package com.Product.springbootcrudoperation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Product.springbootcrudoperation.model.Products;
import com.Product.springbootcrudoperation.service.ProductsService;

@RestController
public class ProductsController {
@Autowired
     ProductsService productsService;
     
@GetMapping("/product")
     private List<Products> getAllProducts()   
     {  
     return productsService.getAllProducts();  
     }  
     //creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/product/{productid}")  
     private Products getProducts(@PathVariable("productid") int productid)   
     {  
     return productsService.getProductsById(productid);  
     }  
     //creating a delete mapping that deletes a specified book  
     @DeleteMapping("/product/{productid}")  
     private void deleteProduct(@PathVariable("productid") int productid)   
     {  
     productsService.delete(productid);  
     }  
    
@PostMapping("/products")  
     private int saveProduct(@RequestBody Products products)   
     {  
     productsService.saveOrUpdate(products);  
     return products.getId();  
     }  
     //creating put mapping that updates the book detail   
     @PutMapping("/product")  
     private Products update(@RequestBody Products products)   
     {  
     productsService.saveOrUpdate(products);  
     return products;    
}  
}  


