package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.OrderDetail;
import com.Api_DB_Floristeria_Amistad.persistence.entity.DetallesPedido;

@Mapper(componentModel = "spring")
public interface OrderDetailMapper {

    @Mappings({
        @Mapping(source = "detalleId", target = "orderDetailID"),
        @Mapping(source = "arreglo", target = "flowerArrangement"),
        @Mapping(source = "cantidad", target = "quantity")
    })
    OrderDetail tOrderDetail(DetallesPedido detallesPedido);

    @InheritConfiguration
    @Mapping(target = "arregloId", ignore = true)
    DetallesPedido toDetallesPedido(OrderDetail orderDetail);

}
