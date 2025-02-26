package com.Api_DB_Floristeria_Amistad.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany(mappedBy = "arreglo")
    private List<DetallesPedido> detallesPedido;

    // Getters and Setters

    public Integer getArregloId() {
        return arregloId;
    }

    public void setArregloId(Integer arregloId) {
        this.arregloId = arregloId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAnexos() {
        return anexos;
    }

    public void setAnexos(String anexos) {
        this.anexos = anexos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public List<DetallesPedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetallesPedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
}
