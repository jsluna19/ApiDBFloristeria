package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.Addressee;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Destinatario;

@Mapper(componentModel = "spring")
public interface AddresseeMapper {
    
    @Mappings({
        @Mapping(source = "destinatarioID", target = "addresseeID"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "direccion", target = "address"),
        @Mapping(source = "telefono", target = "phone")
    })
    Addressee toAddressee(Destinatario destinatario);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    @Mapping(target = "pedido", ignore = true)
    Destinatario toDestinatario(Addressee addressee);
}
