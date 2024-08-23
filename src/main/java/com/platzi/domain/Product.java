package com.platzi.domain;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProduct;

    @Column(name = "nombre")
    private String name;

    @Column(name = "id_categoria")
    private Integer idCategory;

    @Column(name = "codigo_barras")
    private String barCode;

    @Column(name = "precio_venta")
    private Double salePrice;

    @Column(name = "cantidad_stock")
    private Integer stock;

    @Column(name = "estado")
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<PurchasesProduct> products;
}
