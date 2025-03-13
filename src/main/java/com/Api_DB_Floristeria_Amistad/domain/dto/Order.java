package com.Api_DB_Floristeria_Amistad.domain.dto;

// Pedido
public class Order {

    private Integer orderID; //ID de pedido
    private Integer clientID; //ID de cliente
    private Integer addresseeID; //ID de destinatario
    private String reason; //Motivo
    private String message; //Mensaje
    private String orderDate; //Fecha de pedido
    private String deliveryDate; //Fecha de entrega
    private String status; //Estado
    private Integer orderDetailID; //ID de detalle de pedido
    private Integer paymentMethodID; //ID de metodo de pago

    private Client client; //Cliente
    private Addressee addressee; //Destinatario
    private OrderDetail orderDetail; //Detalle de pedido
    private PaymentMethod paymentMethod; //Metodo de pago


    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public Integer getAddresseeID() {
        return addresseeID;
    }

    public void setAddresseeID(Integer addresseeID) {
        this.addresseeID = addresseeID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(Integer orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public Integer getPaymentMethodID() {
        return paymentMethodID;
    }

    public void setPaymentMethodID(Integer paymentMethodID) {
        this.paymentMethodID = paymentMethodID;
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

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
