package com.platzi.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "compras_productos")
@Getter
@Setter
public class PurchasesProduct {
    @EmbeddedId
    private PurchasesProductPK id;

    @Column(name = "cantidad")
    private Integer quantity;

    private Double total;

    @Column(name = "estado")
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Product product;

}
