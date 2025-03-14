package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.Order;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Pedido;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ClientMapper.class, AddresseeMapper.class, PaymentMethodMapper.class, OrderDetailMapper.class})
public interface OrderMapper {

    @Mappings({
        @Mapping(source = "pedidoId", target = "orderID"),
        @Mapping(source = "clienteId", target = "clientID"),
        @Mapping(source = "destinatarioId", target = "addresseeID"),
        @Mapping(source = "motivo", target = "reason"),
        @Mapping(source = "mensaje", target = "message"),
        @Mapping(source = "fechaPedido", target = "orderDate"),
        @Mapping(source = "fechaEntrega", target = "deliveryDate"),
        @Mapping(source = "estado", target = "status"),
        @Mapping(source = "detalleId", target = "orderDetailID"),
        @Mapping(source = "pagoId", target = "paymentMethodID"),
        @Mapping(source = "cliente", target = "client"),
        @Mapping(source = "destinatario", target = "addressee"),
        @Mapping(source = "detallesPedido", target = "orderDetail"),
        @Mapping(source = "metodoPago", target = "paymentMethod")

    })
    Order toOrder(Pedido pedido);
    List<Order> toOrders(List<Pedido> pedidos);
    @InheritConfiguration
    Pedido toPedido(Order order);

}
