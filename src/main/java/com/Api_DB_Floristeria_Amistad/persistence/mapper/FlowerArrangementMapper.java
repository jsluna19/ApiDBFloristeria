package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.FlowerArrangement;
import com.Api_DB_Floristeria_Amistad.persistence.entity.ArregloFloral;

@Mapper(componentModel = "spring")
public interface FlowerArrangementMapper {

    @Mappings ({
        @Mapping(source = "arregloId", target = "arregloID"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "precio", target = "price"),
        @Mapping(source = "descripcion", target = "description"),
        @Mapping(source = "anexos", target = "attachments")
    })
    FlowerArrangement toFlowerArrangement(ArregloFloral arregloFloral);

    @InheritConfiguration

    @Mapping(target = "detallesPedido", ignore = true)
    ArregloFloral toArregloFloral(FlowerArrangement flowerArrangement);


}
