package com.Api_DB_Floristeria_Amistad.persistence.Repository;

import com.Api_DB_Floristeria_Amistad.persistence.crud.DetallesPedidoCrudRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.DetallesPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DetallesPedidoRepository {
    @Autowired
    private DetallesPedidoCrudRepository detallesPedidoCrudRepository;

    public List<DetallesPedido> getAllDetallesPedido(){
        return (List<DetallesPedido>) detallesPedidoCrudRepository.findAll();
    }

    public Optional<DetallesPedido> getDetallesPedido(Integer detallesPedidoId){
        return detallesPedidoCrudRepository.findById(detallesPedidoId);
    }

    public DetallesPedido saveDetallesPedido(DetallesPedido detallesPedido){
        return detallesPedidoCrudRepository.save(detallesPedido);
    }

    public void deleteDetallesPedido(Integer detallesPedidoId){
        detallesPedidoCrudRepository.deleteById(detallesPedidoId);
    }

}
