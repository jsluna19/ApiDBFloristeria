package com.Api_DB_Floristeria_Amistad.domain.service;

import com.Api_DB_Floristeria_Amistad.domain.dto.FlowerArrangement;
import com.Api_DB_Floristeria_Amistad.domain.repository.FlowerArrangementRepository;
import com.Api_DB_Floristeria_Amistad.persistence.Repository.ArregloFloralRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.ArregloFloral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArregloFloralService {

    @Autowired
    private FlowerArrangementRepository repository;

    public List<FlowerArrangement> getAll(){
        return repository.getAllFloweArragement();
    }

    public Optional<FlowerArrangement> get(Integer id){
        return repository.getFloweArragement(id);
    }

    public FlowerArrangement save(FlowerArrangement flowerArrangement){
        return repository.saveFloweArragement(flowerArrangement);
    }

    public boolean dele(Integer id){
        return get(id).map(arregloFloral -> {
            repository.deleteFloweArragement(id);
            return true;
        }).orElse(false);
    }

    public Optional<FlowerArrangement> update(Integer id, FlowerArrangement actualizado){
        return repository.updateFloweArragement(actualizado, id);
    }
}
