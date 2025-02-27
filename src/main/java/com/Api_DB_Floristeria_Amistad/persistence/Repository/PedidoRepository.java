package com.Api_DB_Floristeria_Amistad.persistence.Repository;

import com.Api_DB_Floristeria_Amistad.persistence.crud.PedidoCrudRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PedidoRepository {

    @Autowired
    private PedidoCrudRepository pedidoCrudRepository;

    public List<Pedido> getAllPedido(){
        return (List<Pedido>) pedidoCrudRepository.findAll();
    }

    public Optional<Pedido> getPedido(Integer pedidoId){
        return pedidoCrudRepository.findById(pedidoId);
    }

    public Pedido save(Pedido pedido){
        return pedidoCrudRepository.save(pedido);
    }

    public void delete(Integer pedidoId){
        pedidoCrudRepository.deleteById(pedidoId);
    }


}
