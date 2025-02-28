package com.Api_DB_Floristeria_Amistad.service;

import com.Api_DB_Floristeria_Amistad.persistence.Repository.DetallesPedidoRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.DetallesPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallesPedidoService {

    @Autowired
    private DetallesPedidoRepository detallesPedidoRepository;

    public List<DetallesPedido> getAllDetallesPedido(){
        return detallesPedidoRepository.getAllDetallesPedido();
    }

    public Optional<DetallesPedido> getDetallesPedido(Integer detallesPedidoId){
        return detallesPedidoRepository.getDetallesPedido(detallesPedidoId);
    }

    public DetallesPedido saveDetallesPedido(DetallesPedido detallesPedido){
        return detallesPedidoRepository.saveDetallesPedido(detallesPedido);
    }

    public boolean deleteDetallesPedido(Integer detallesPedidoId){
        return getDetallesPedido(detallesPedidoId).map(detallesPedido -> {
            detallesPedidoRepository.deleteDetallesPedido(detallesPedidoId);
            return true;
        }).orElse(false);
    }

}
