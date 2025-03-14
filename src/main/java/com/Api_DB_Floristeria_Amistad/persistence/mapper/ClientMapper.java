package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.Client;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Cliente;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OrderMapper.class, AddresseeMapper.class})
public interface ClientMapper {

    @Mappings({
        @Mapping(source = "id", target = "clientID"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "telefono", target = "phone"),
        @Mapping(source = "email", target = "email"),
        @Mapping(source = "direccion", target = "address"),
        @Mapping(source = "cedula", target = "idCard"),
        @Mapping(source = "pedido", target = "order"),
        @Mapping(source = "destinatario", target = "addressee")
    })
    Client toClient(Cliente cliente);
    List<Client> toClient(List<Cliente> clientes);
    @InheritConfiguration
    Cliente toCliente(Client client);
}
