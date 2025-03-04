package com.Api_DB_Floristeria_Amistad.domain.dto;

//Detalle de pedido -> Posible clase a eliminar
public class OrderDetail {

    private Integer orderDetailID;
    private Order order;
    private FlowerArrangement flowerArrangement;
    private Integer quantity;

    
    public Integer getOrderDetailID() {
        return orderDetailID;
    }
    public void setOrderDetailID(Integer orderDetailID) {
        this.orderDetailID = orderDetailID;
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
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    

}
