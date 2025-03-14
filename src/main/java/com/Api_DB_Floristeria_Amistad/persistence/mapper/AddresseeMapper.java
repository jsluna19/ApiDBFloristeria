package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.Addressee;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Destinatario;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ClientMapper.class, OrderMapper.class})
public interface AddresseeMapper {
    
    @Mappings({
        @Mapping(source = "destinatarioID", target = "addresseeID"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "telefono", target = "phone"),
        @Mapping(source = "direccion", target = "address"),
        @Mapping(source = "clienteId", target = "clientID"),
        @Mapping(source = "cliente", target = "client"),
        @Mapping(source = "pedido", target = "order")
    })
    Addressee toAddressee(Destinatario destinatario);
    List<Addressee> toAddressees(List<Destinatario> destinatarios);
    @InheritInverseConfiguration
    Destinatario toDestinatario(Addressee addressee);
}