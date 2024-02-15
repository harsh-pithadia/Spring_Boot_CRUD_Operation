package com.Product.springbootcrudoperation.repository;


import org.springframework.data.repository.CrudRepository;

import com.Product.springbootcrudoperation.model.Products;



//repository that extends CrudRepository  
public interface ProductsRepository extends CrudRepository<Products, Integer>  
{  
}  