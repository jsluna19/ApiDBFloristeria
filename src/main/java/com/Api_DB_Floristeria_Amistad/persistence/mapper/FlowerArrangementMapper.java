package com.Api_DB_Floristeria_Amistad.persistence.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.Api_DB_Floristeria_Amistad.domain.dto.FlowerArrangement;
import com.Api_DB_Floristeria_Amistad.persistence.entity.ArregloFloral;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OrderDetailMapper.class})
public interface FlowerArrangementMapper {

    @Mappings ({
        @Mapping(source = "arregloId", target = "arregloID"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "descripcion", target = "description"),
        @Mapping(source = "anexos", target = "attachments"),
        @Mapping(source = "precio", target = "price"),
        @Mapping(source = "detallesPedido", target = "orderDetail")
    })
    FlowerArrangement toFlowerArrangement(ArregloFloral arregloFloral);
    List<FlowerArrangement> toFlowerArrangement(List<ArregloFloral> arreglosFlorales);
    @InheritConfiguration
    ArregloFloral toArregloFloral(FlowerArrangement flowerArrangement);


}
