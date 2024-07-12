package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProductById(Long id);
    Product createProduct(Product product);
}
