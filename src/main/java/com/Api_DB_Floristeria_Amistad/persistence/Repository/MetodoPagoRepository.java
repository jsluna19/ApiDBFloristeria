package com.Api_DB_Floristeria_Amistad.persistence.Repository;

import com.Api_DB_Floristeria_Amistad.persistence.crud.MetodoPagoCrudRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.MetodoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MetodoPagoRepository {

    @Autowired
    private MetodoPagoCrudRepository metodoPagoCrudRepository;

    public List<MetodoPago> getAllMetodoPago(){
        return (List<MetodoPago>) metodoPagoCrudRepository.findAll();
    }

    public Optional<MetodoPago> getMetodoPago(Integer metodoPagoId){
        return metodoPagoCrudRepository.findById(metodoPagoId);
    }

    public MetodoPago save(MetodoPago metodoPago){
        return metodoPagoCrudRepository.save(metodoPago);
    }

    public void delete(Integer metodoPagoId){
        metodoPagoCrudRepository.deleteById(metodoPagoId);
    }

    public Optional<MetodoPago> updateMetodoPago(MetodoPago metodoPago, Integer metodoPagoId){
        return metodoPagoCrudRepository.findById(metodoPagoId)
            .map(MetodoPagoActualizado -> {
                if(metodoPago.getPedidoId() != null){
                    MetodoPagoActualizado.setPedidoId(metodoPago.getPedidoId());
                }
                if(metodoPago.getMonto() != null){
                    MetodoPagoActualizado.setMonto(metodoPago.getMonto());
                }
                if(metodoPago.getMetodoPago() != null){
                    MetodoPagoActualizado.setMetodoPago(metodoPago.getMetodoPago());
                }
                if(metodoPago.getFechaPago() != null){
                    MetodoPagoActualizado.setFechaPago(metodoPago.getFechaPago());
                }

                return metodoPagoCrudRepository.save(MetodoPagoActualizado);
            });
        
    }

}
