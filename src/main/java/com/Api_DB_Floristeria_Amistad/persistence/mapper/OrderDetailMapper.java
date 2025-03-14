package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.OrderDetail;
import com.Api_DB_Floristeria_Amistad.persistence.entity.DetallesPedido;

import java.util.List;

@Mapper(componentModel = "spring", uses = {FlowerArrangementMapper.class})
public interface OrderDetailMapper {

    @Mappings({
        @Mapping(source = "detalleId", target = "orderDetailID"),
        @Mapping(source = "pedidoId", target = "orderID"),
        @Mapping(source = "arregloId", target = "flowerArrangementID"),
        @Mapping(source = "cantidad", target = "quantity"),
        @Mapping(source = "arreglo", target = "flowerArrangement")

    })
    OrderDetail tOrderDetail(DetallesPedido detallesPedido);
    List<OrderDetail> toOrderDetail(List<DetallesPedido> detallesPedidos);
    @InheritConfiguration
    DetallesPedido toDetallesPedido(OrderDetail orderDetail);

}