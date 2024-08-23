package com.platzi.domain;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categorias")
@Getter
@Setter
public class Category {
    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategory;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "estado")
    private Boolean isActive;

    // @OneToMany(mappedBy = "category")
    // private List<Product> products;
}
