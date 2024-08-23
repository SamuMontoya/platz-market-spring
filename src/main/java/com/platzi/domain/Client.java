package com.platzi.domain;

import jakarta.persistence.*;
import java.util.List;
import lombok.*;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Client {
    @Id
    @Column(name = "id_cliente")
    private Integer idClient;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellidos")
    private String lastName;

    @Column(name = "celular")
    private String phone;

    @Column(name = "direccion")
    private String address;

    @Column(name = "correo_electronico")
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Purchase> purchases;
}
