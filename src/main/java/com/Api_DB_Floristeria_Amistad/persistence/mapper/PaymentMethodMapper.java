package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.PaymentMethod;
import com.Api_DB_Floristeria_Amistad.persistence.entity.MetodoPago;

@Mapper(componentModel = "spring")
public interface PaymentMethodMapper {

    @Mappings({
        @Mapping(source = "pagoId", target = "paymentID"),
        @Mapping(source = "monto", target = "amount"),
        @Mapping(source = "metodoPago", target = "paymentMethod"),
        @Mapping(source = "fechaPago", target = "paymentDate")
    })
    PaymentMethod toPaymentMethod(MetodoPago metodoPago);


    @InheritConfiguration
    @Mapping(target = "pedido", ignore = true)
    @Mapping(target = "pedidoId", ignore = true)
    MetodoPago toMetodoPago(PaymentMethod paymentMethod);

}
