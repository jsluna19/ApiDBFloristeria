package com.Api_DB_Floristeria_Amistad.domain.dto;

//Detalle de pedido -> Posible clase a eliminar
public class OrderDetail {

    private Integer orderDetailID; //Detalle de pedido
    private Integer orderID; //Id de pedido
    private Integer flowerArrangementID; //Id de arreglo de flores
    private Integer quantity;

    private Order order; //Pedido
    private FlowerArrangement flowerArrangement; //Arreglo de flores

    public Integer getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(Integer orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getFlowerArrangementID() {
        return flowerArrangementID;
    }

    public void setFlowerArrangementID(Integer flowerArrangementID) {
        this.flowerArrangementID = flowerArrangementID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public FlowerArrangement getFlowerArrangement() {
        return flowerArrangement;
    }

    public void setFlowerArrangement(FlowerArrangement flowerArrangement) {
        this.flowerArrangement = flowerArrangement;
    }
}
