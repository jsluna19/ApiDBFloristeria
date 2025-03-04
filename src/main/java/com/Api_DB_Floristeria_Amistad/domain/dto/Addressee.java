package com.Api_DB_Floristeria_Amistad.domain.dto;

//Destinatario
public class Addressee {

    private Integer addresseeID;
    private String name;
    private String phone;
    private String address;
    private Client clientID;
    private Order orderID;

    public Order getOrderID() {
        return orderID;
    }

    public void setOrderID(Order orderID) {
        this.orderID = orderID;
    }

    public Client getClientID() {
        return clientID;
    }

    public void setClientID(Client clientID) {
        this.clientID = clientID;
    }

    public Integer getAddresseeID() {
        return addresseeID;
    }

    public void setAddresseeID(Integer addresseeID) {
        this.addresseeID = addresseeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
