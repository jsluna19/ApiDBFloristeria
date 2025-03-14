package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.PaymentMethod;
import com.Api_DB_Floristeria_Amistad.persistence.entity.MetodoPago;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OrderMapper.class})
public interface PaymentMethodMapper {

    @Mappings({
        @Mapping(source = "pagoId", target = "paymentID"),
        @Mapping(source = "pedidoId", target = "orderID"),
        @Mapping(source = "monto", target = "amount"),
        @Mapping(source = "metodoPago", target = "paymentMethod"),
        @Mapping(source = "fechaPago", target = "paymentDate"),
        @Mapping(source = "pedido", target = "order")
    })
    PaymentMethod toPaymentMethod(MetodoPago metodoPago);
    List<PaymentMethod> toPaymentMethods(List<MetodoPago> metodosPago);
    @InheritConfiguration
    MetodoPago toMetodoPago(PaymentMethod paymentMethod);

}
