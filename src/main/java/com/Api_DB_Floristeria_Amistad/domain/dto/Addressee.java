package com.Api_DB_Floristeria_Amistad.domain.dto;

//Destinatario
public class Addressee {

    private Integer addresseeID; //Id de destinatario
    private String name;    //Nombre
    private String phone;   //Telefono
    private String address; //Direccion
    private Integer clientID;   //Id de cliente
    private Client client;  //Cliente
    private Order order;    //Pedido


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

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
