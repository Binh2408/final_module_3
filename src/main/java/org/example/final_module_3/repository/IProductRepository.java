package org.example.final_module_3.repository;


import org.example.final_module_3.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void add(Product product);
    Product findById(String id);
    List<Product> findTopProduct(int limit);

}
