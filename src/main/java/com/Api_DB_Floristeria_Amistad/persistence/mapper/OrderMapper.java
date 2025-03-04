package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.Order;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Pedido;

@Mapper(componentModel = "spring", uses = {ClientMapper.class, AddresseeMapper.class, PaymentMethodMapper.class, OrderDetailMapper.class})
public interface OrderMapper {

    @Mappings({
        @Mapping(source = "pedidoId", target = "orderID"),
        @Mapping(source = "cliente", target = "client"),
        @Mapping(source = "destinatario", target = "addressee"),
        @Mapping(source = "metodoPago", target = "paymentMethod"),
        @Mapping(source = "motivo", target = "reason"),
        @Mapping(source = "fechaEntrega", target = "deliveryDate"),
        @Mapping(source = "fechaPedido", target = "orderDate"),
        @Mapping(source = "mensaje", target = "message"),
        @Mapping(source = "estado", target = "status"),
        @Mapping(source = "detallesPedido", target = "orderDetail")
    })
    Order toOrder(Pedido pedido);

    @InheritConfiguration
    @Mapping(target = "clienteId", ignore = true)
    @Mapping(target = "destinatarioId", ignore = true)
    Pedido toPedido(Order order);

}
