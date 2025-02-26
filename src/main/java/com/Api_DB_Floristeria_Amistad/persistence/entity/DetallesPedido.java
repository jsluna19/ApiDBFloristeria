package com.Api_DB_Floristeria_Amistad.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany(mappedBy = "detallesPedido")
    private List<Pedido> pedido;

    @ManyToOne
    @JoinColumn(name = "arreglo_id", insertable = false, updatable = false)
    private ArregloFloral arreglo;

    // Getters and Setters

    public Integer getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(Integer detalleId) {
        this.detalleId = detalleId;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getArregloId() {
        return arregloId;
    }

    public void setArregloId(Integer arregloId) {
        this.arregloId = arregloId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    public ArregloFloral getArreglo() {
        return arreglo;
    }

    public void setArreglo(ArregloFloral arreglo) {
        this.arreglo = arreglo;
    }
}
