package com.Api_DB_Floristeria_Amistad.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DetallesPedido")
public class DetallesPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name=  "detalle_id")
    private Integer detalleId;

    @Column(name=  "pedido_id")
    private Integer pedidoId;

    @Column(name=  "arreglo_id")
    private Integer arregloId;


    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "pedido_id", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "arreglo_id", insertable = false, updatable = false)
    private ArregloFloral arreglo;
}
