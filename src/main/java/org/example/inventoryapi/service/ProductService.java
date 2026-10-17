package org.example.inventoryapi.service;

import org.example.inventoryapi.model.Product;
import org.example.inventoryapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public boolean updateProduct(Long id, Product updatedProduct) {
        if(productRepository.existsById(id)) {
            updatedProduct.setId(id);
            productRepository.save(updatedProduct);
            return true;
        }

        return false;
    }

    public boolean deleteProduct(Long id) {
        if(productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
