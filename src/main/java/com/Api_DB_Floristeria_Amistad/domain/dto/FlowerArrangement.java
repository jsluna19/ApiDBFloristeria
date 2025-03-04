package com.Api_DB_Floristeria_Amistad.domain.dto;

//Arreglo de flores
public class FlowerArrangement {

    private Integer arregloID;
    private String name;
    private String description;
    private String attachments; //anexos
    private Double price;

    // Getters and Setters
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



}
