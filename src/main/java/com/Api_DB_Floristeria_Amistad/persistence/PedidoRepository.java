package com.Api_DB_Floristeria_Amistad.persistence;

import com.Api_DB_Floristeria_Amistad.persistence.crud.PedidoCrudRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Pedido;

import java.util.List;

public class PedidoRepository {
    private PedidoCrudRepository pedidoCrudRepository;

    public List<Pedido> getAll() {
        return (List<Pedido>) pedidoCrudRepository.findAll();
    }
}
