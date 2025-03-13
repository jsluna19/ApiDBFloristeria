package com.Api_DB_Floristeria_Amistad.domain.dto;

//Arreglo de flores
public class FlowerArrangement {

    private Integer arregloID; //Id de arreglo
    private String name; //Nombre
    private String description; //Descripcion
    private String attachments; //anexos
    private Double price;   //Precio
    private OrderDetail orderDetail; //Detalle de pedido

    public Integer getArregloID() {
        return arregloID;
    }

    public void setArregloID(Integer arregloID) {
        this.arregloID = arregloID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }
}
