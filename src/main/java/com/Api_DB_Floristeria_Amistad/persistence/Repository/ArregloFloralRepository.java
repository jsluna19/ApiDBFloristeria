package com.Api_DB_Floristeria_Amistad.persistence.Repository;

import com.Api_DB_Floristeria_Amistad.domain.dto.FlowerArrangement;
import com.Api_DB_Floristeria_Amistad.domain.repository.FlowerArrangementRepository;
import com.Api_DB_Floristeria_Amistad.persistence.crud.ArregloFloralCrudRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.ArregloFloral;
import com.Api_DB_Floristeria_Amistad.persistence.mapper.FlowerArrangementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArregloFloralRepository implements FlowerArrangementRepository {

    @Autowired
    private FlowerArrangementMapper mapper;
    private ArregloFloralCrudRepository arregloFloralCrudRepository;

    @Override
    public List<FlowerArrangement> getAllFloweArragement() {
        List<ArregloFloral> arreglosFlorales = (List<ArregloFloral>) arregloFloralCrudRepository.findAll();
        return mapper.toFlowerArrangement(arreglosFlorales);
    }

    @Override
    public Optional<FlowerArrangement> getFloweArragement(Integer floweArragementId) {
        return arregloFloralCrudRepository.findById(floweArragementId).map(arregloFloral -> mapper.toFlowerArrangement(arregloFloral));
    }

    @Override
    public FlowerArrangement saveFloweArragement(FlowerArrangement floweArragement) {
        ArregloFloral arregloFloral = mapper.toArregloFloral(floweArragement);
        return mapper.toFlowerArrangement(arregloFloralCrudRepository.save(arregloFloral));
    }

    @Override
    public void deleteFloweArragement(Integer floweArragementId) {
        arregloFloralCrudRepository.deleteById(floweArragementId);
    }

    @Override
    public Optional<FlowerArrangement> updateFloweArragement(FlowerArrangement floweArragement, Integer floweArragementId) {
        Optional<ArregloFloral> arregloFloralOptional = arregloFloralCrudRepository.findById(floweArragementId);
        if (arregloFloralOptional.isPresent()) {
            ArregloFloral arregloFloral = arregloFloralOptional.get();

            if(floweArragement.getName() != null){
                arregloFloral.setNombre(floweArragement.getName());
            }

            if(floweArragement.getDescription() != null){
                arregloFloral.setDescripcion(floweArragement.getDescription());
            }

            if(floweArragement.getPrice() != null){
                arregloFloral.setPrecio(floweArragement.getPrice());
            }

            if(floweArragement.getAttachments() != null){
                arregloFloral.setAnexos(floweArragement.getAttachments());
            }
            return Optional.of(mapper.toFlowerArrangement(arregloFloralCrudRepository.save(arregloFloral)));
        }else {
            return Optional.empty();
        }
    }

    /*
    public Optional<ArregloFloral> updateArregloFloral(Integer arregloFloralId, ArregloFloral nuevoArregloFloral){
        Optional<ArregloFloral> arregloFloralOptional = arregloFloralCrudRepository.findById(arregloFloralId);
        if (arregloFloralOptional.isPresent()) {
            ArregloFloral arregloFloral = arregloFloralOptional.get();

            // Verificamos qué atributos del nuevo arregloFloral no son nulos antes de actualizar
            if (nuevoArregloFloral.getNombre() != null) {
                arregloFloral.setNombre(nuevoArregloFloral.getNombre());
            }
            if (nuevoArregloFloral.getDescripcion() != null) {
                arregloFloral.setDescripcion(nuevoArregloFloral.getDescripcion());
            }
            if (nuevoArregloFloral.getPrecio() != null) {
                arregloFloral.setPrecio(nuevoArregloFloral.getPrecio());
            }

            if (nuevoArregloFloral.getAnexos() != null) {
                arregloFloral.setAnexos(nuevoArregloFloral.getAnexos());
            }

            return Optional.of(arregloFloralCrudRepository.save(arregloFloral)); // Guardamos el arregloFloral actualizado
        }else{
            return Optional.empty();
        }
    }*/
}
