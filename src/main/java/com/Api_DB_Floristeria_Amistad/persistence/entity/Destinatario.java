package com.Api_DB_Floristeria_Amistad.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "cliente_id", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "destinatario")
    private List<Pedido> pedido;

    // Getters and Setters

    public Integer getDestinatarioID() {
        return destinatarioID;
    }

    public void setDestinatarioID(Integer destinatarioID) {
        this.destinatarioID = destinatarioID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }
}
