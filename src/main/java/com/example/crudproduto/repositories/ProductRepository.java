package com.example.crudproduto.repositories;

import com.example.crudproduto.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {}
