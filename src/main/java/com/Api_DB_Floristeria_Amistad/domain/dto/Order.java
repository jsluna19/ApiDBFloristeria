package com.Api_DB_Floristeria_Amistad.domain.dto;

// Pedido
public class Order {

    private Integer orderID;
    private Client client;
    private Addressee addressee;
    private PaymentMethod paymentMethod;
    private String reason;
    private String deliveryDate; //Fecha de entrega
    private String orderDate; //Fecha de pedido
    private String message;
    private String status;
    private OrderDetail orderDetail; //Detalle de pedido

    
    public Integer getOrderID() {
        return orderID;
    }
    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Addressee getAddressee() {
        return addressee;
    }
    public void setAddressee(Addressee addressee) {
        this.addressee = addressee;
    }
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public OrderDetail getOrderDetail() {
        return orderDetail;
    }
    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    


}
