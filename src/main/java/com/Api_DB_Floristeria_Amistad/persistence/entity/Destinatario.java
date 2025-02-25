package com.Api_DB_Floristeria_Amistad.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Destinatarios")
public class Destinatario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "destinatario_id")
    private Integer destinatarioID;

    private String nombre;

    private String telefono;

    private  String direccion;

    @Column(name = "cliente_id")
    private Integer clienteId;
}
