package com.Api_DB_Floristeria_Amistad.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedido_id")
    private Integer pedidoId;

    @Column(name = "cliente_id")
    private Integer clienteId;

    @Column(name = "destinatario_id")
    private String destinatarioId;

    private String motivo;

    private String mensaje;

    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    @Column(name = "fecha_entrega")
    private Date fechaEntrega;

    public enum EstadoPedido {
        Pendiente,
        Procesando,
        Ruta,
        Entregado,
        PendienteEntrega,
        Cancelado
    }

    @Column(name = "estado")
    private EstadoPedido estado;

    @ManyToOne
    @JoinColumn(name = "cliente_id", insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "destinatario_id", insertable = false, updatable = false)
    private Destinatario destinatario;

    @ManyToOne
    @JoinColumn(name = "detalle_id", insertable = false, updatable = false)
    private DetallesPedido detallesPedido;

    @ManyToOne
    @JoinColumn(name = "pago_id", insertable = false, updatable = false)
    private MetodoPago metodoPago;

    // Getters and Setters

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getDestinatarioId() {
        return destinatarioId;
    }

    public void setDestinatarioId(String destinatarioId) {
        this.destinatarioId = destinatarioId;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public DetallesPedido getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(DetallesPedido detallesPedido) {
        this.detallesPedido = detallesPedido;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}
