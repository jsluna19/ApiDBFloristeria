package com.Api_DB_Floristeria_Amistad.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "MetodosPago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pagoId;

    private Integer pedidoId;

    private Double monto;
    @Column(name = "metodo_pago")
    private String metodoPago;

    @Column(name = "fecha_pago")
    private Date fechaPago; //DATETIME,
}
