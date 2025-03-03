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

    public Optional<Pedido> updatePedido(Pedido pedido, Integer pedidoId){
        return pedidoCrudRepository.findById(pedidoId)
        .map(pedidoActualizado -> {

            if(pedido.getClienteId() != null){
                pedidoActualizado.setClienteId(pedido.getClienteId());   
            }

            if (pedido.getDestinatarioId() != null){
                pedidoActualizado.setDestinatarioId(pedido.getDestinatarioId());
            }

            if (pedido.getMotivo() != null){
                pedidoActualizado.setMotivo(pedido.getMotivo());
            }

            if (pedido.getMensaje() != null){
                pedidoActualizado.setMensaje(pedido.getMensaje());
            }

            if(pedido.getFechaPedido() != null){
                pedidoActualizado.setFechaPedido(pedido.getFechaPedido());
            }

            if (pedido.getFechaEntrega() != null){
                pedidoActualizado.setFechaEntrega(pedido.getFechaEntrega());
            }

            if (pedido.getDetalleId() != null){
                pedidoActualizado.setDetalleId(pedido.getDetalleId());                
            }

            if (pedido.getPagoId() != null){
                pedidoActualizado.setPagoId(pedido.getPagoId());
            }

            if (pedido.getEstado() != null){
                pedidoActualizado.setEstado(pedido.getEstado());
            }
            return pedidoCrudRepository.save(pedidoActualizado);

        });
    }


}
