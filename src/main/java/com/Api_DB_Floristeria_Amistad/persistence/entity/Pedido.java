package com.Api_DB_Floristeria_Amistad.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedido_id")
    private int pedidoId;

    @Column(name = "cliente_id")
    private int clienteId;

    @Column(name = "destinatario_id")
    private String destinatarioId;

    private String motivo;

    private String mensaje;

    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    @Column(name = "fecha_entrega")
    private Date fechaEntrega;

    private EstadoPedido estado;


}
