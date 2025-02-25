package com.Api_DB_Floristeria_Amistad.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ArreglosFlorales")
public class ArregloFloral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "arreglo_id")
    private Integer arregloId;

    private String nombre;

    private String descripcion;

    private String anexos;

    private Double precio;
}
