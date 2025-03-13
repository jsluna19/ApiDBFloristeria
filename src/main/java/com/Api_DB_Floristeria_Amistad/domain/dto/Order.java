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
    private Integer

    private OrderDetail orderDetail; //Detalle de pedido
    private Addressee addressee; //Destinatario
    private PaymentMethod paymentMethod; //Método de pago
    private Client client; //Cliente

}
