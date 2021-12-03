package com.example.crudproduto.view;

import com.example.crudproduto.controller.ProductController;
import com.example.crudproduto.model.ProductEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("/products")
public class ProductView {
    private ProductController productController;

    public ProductView(ProductController productController) {
        this.productController = productController;
    }

    @GetMapping
    public List<ProductEntity> listAllProducts() {
        return productController.listProducts();
    }

    @PostMapping
    public ProductEntity createProduct(@RequestBody ProductEntity product ) {
        return productController.createProduct(product);
    }

    @PutMapping
    public ProductEntity updateProduct(@RequestBody ProductEntity product) {
        return productController.updateProduct(product);
    }

    @DeleteMapping
    public HttpStatus deleteProduct(@PathVariable Integer productId) {
        try {
            productController.deleteProduct(productId);
            return HttpStatus.OK;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }


}
