package com.example.crudproduto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Entity(name="product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    private Integer id;

    private String nome;

    private String descricao;

    private Double preco;

    private Integer quantidade;

    private Date dataCadastro;
}
