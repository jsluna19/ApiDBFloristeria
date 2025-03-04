package com.Api_DB_Floristeria_Amistad.domain.dto;

import com.Api_DB_Floristeria_Amistad.persistence.entity.Pedido;

// Metodo de pago
public class PaymentMethod {

    private Integer paymentID;
    private Order order;
    private Double amount; // Monto
    private String paymentMethod; // Metodo de pago
    private String paymentDate; // Fecha de pago

    
    public Integer getPaymentID() {
        return paymentID;
    }
    public void setPaymentID(Integer paymentID) {
        this.paymentID = paymentID;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    
}
