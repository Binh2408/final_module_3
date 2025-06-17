package org.example.final_module_3.service;

import org.example.final_module_3.model.Product;
import org.example.final_module_3.repository.IProductRepository;
import org.example.final_module_3.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private final IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findTopProduct(int limit) {
        return productRepository.findTopProduct(limit);
    }
}
