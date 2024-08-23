package com.platzi.persistency.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

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

}
