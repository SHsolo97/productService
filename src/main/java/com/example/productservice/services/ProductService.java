package com.example.productservice.services;


import com.example.productservice.dtos.CreateProductDto;
import com.example.productservice.exceptions.ProductNotExistsException;
import com.example.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id) throws ProductNotExistsException;
    Product updateProduct(Long id, Product product) throws ProductNotExistsException;
    List<Product> getAllProducts();
    Product replaceProduct(Long id, Product product) throws ProductNotExistsException ;

    Product addNewProduct(CreateProductDto product) throws ProductNotExistsException;
    String deleteProduct(Long id);
}
