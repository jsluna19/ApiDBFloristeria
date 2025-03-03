package com.Api_DB_Floristeria_Amistad.service;

import com.Api_DB_Floristeria_Amistad.persistence.Repository.MetodoPagoRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.MetodoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetodoPagoService {

    @Autowired
    private MetodoPagoRepository metodoPagoRepository;

    public List<MetodoPago> getAllMetodoPago(){
        return metodoPagoRepository.getAllMetodoPago();
    }

    public Optional<MetodoPago> getMetodoPago(Integer metodoPagoId){
        return metodoPagoRepository.getMetodoPago(metodoPagoId);
    }

    public MetodoPago saveMetodoPago(MetodoPago metodoPago){
        return metodoPagoRepository.save(metodoPago);
    }

    public boolean deleteMetodoPago(Integer metodoPagoId){
        return getMetodoPago(metodoPagoId).map(metodoPago -> {
            metodoPagoRepository.delete(metodoPagoId);
            return true;
        }).orElse(false);
    }

    public Optional<MetodoPago> updateMetodoPago(MetodoPago metodoPago, Integer metodoPagoId){
        return metodoPagoRepository.updateMetodoPago(metodoPago, metodoPagoId);
    }
}
