package com.Api_DB_Floristeria_Amistad.domain.service;

import com.Api_DB_Floristeria_Amistad.persistence.Repository.PedidoRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private PedidoRepository pedidoRepository;

    public List<Pedido> getAllPedido(){
        return pedidoRepository.getAllPedido();
    }

    public Optional<Pedido> getPedido(Integer pedidoId){
        return pedidoRepository.getPedido(pedidoId);
    }

    public Pedido savePedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public boolean deletePedido(Integer pedidoId){
        return getPedido(pedidoId).map(pedido -> {
            pedidoRepository.delete(pedidoId);
            return true;
        }).orElse(false);
    }

    public Optional<Pedido> updatePedido(Pedido pedido, Integer pedidoId){
        return pedidoRepository.updatePedido(pedido, pedidoId);
    }

}
