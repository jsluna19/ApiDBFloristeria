package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.Client;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Cliente;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mappings({
        @Mapping(source = "id", target = "clientID"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "telefono", target = "phone"),
        @Mapping(source = "email", target = "email"),
        @Mapping(source = "direccion", target = "address"),
        @Mapping(source = "cedula", target = "idCard")
    })

    Client toClient(Cliente cliente);

    @InheritConfiguration
    @Mapping(target = "pedidos", ignore = true)
    @Mapping(target = "destinatarios", ignore = true)
    Cliente toCliente(Client client);

}
