package com.example.crudproduto.controller;

import com.example.crudproduto.model.ProductEntity;
import com.example.crudproduto.repositories.ProductRepository;

import java.util.List;

public class ProductController {
    ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductEntity> listProducts() {
        return productRepository.findAll();
    }
    public ProductEntity createProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }
    public ProductEntity updateProduct(ProductEntity productToUpdate) {
        ProductEntity productSaved = productRepository.getById(productToUpdate.getId());
        productSaved.setDescricao( productToUpdate.getDescricao());
        productSaved.setPreco(productToUpdate.getPreco());
        productSaved.setNome(productToUpdate.getNome());
        productSaved.setQuantidade(productToUpdate.getQuantidade());

        return productRepository.save(productSaved);
    }

    public void deleteProduct(Integer productId) {
        productRepository.delete(productRepository.getById(productId));
    }
}
