package com.Api_DB_Floristeria_Amistad.service;

import com.Api_DB_Floristeria_Amistad.persistence.Repository.ArregloFloralRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.ArregloFloral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArregloFloralService {

    @Autowired
    private ArregloFloralRepository arregloFloralRepository;

    public List<ArregloFloral> getAllArregloFloral(){
        return arregloFloralRepository.getAllArregloFloral();
    }

    public Optional<ArregloFloral> getArregloFloral(Integer arregloFloralId){
        return arregloFloralRepository.getArregloFloral(arregloFloralId);
    }

    public ArregloFloral saveArregloFloral(ArregloFloral arregloFloral){
        return arregloFloralRepository.saveArregloFloral(arregloFloral);
    }

    public boolean deleteArregloFloral(Integer arregloFloralId){
        return getArregloFloral(arregloFloralId).map(arregloFloral -> {
            arregloFloralRepository.delete(arregloFloralId);
            return true;
        }).orElse(false);
    }
}
