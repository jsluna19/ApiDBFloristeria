package com.Api_DB_Floristeria_Amistad.persistence.Repository;

import com.Api_DB_Floristeria_Amistad.persistence.crud.ArregloFloralCrudRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.ArregloFloral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArregloFloralRepository {

    @Autowired
    private ArregloFloralCrudRepository arregloFloralCrudRepository;

    public List<ArregloFloral> getAllArregloFloral(){
        return (List<ArregloFloral>) arregloFloralCrudRepository.findAll();
    }

    public Optional<ArregloFloral> getArregloFloral(Integer arregloFloralId){
        return arregloFloralCrudRepository.findById(arregloFloralId);
    }

    public ArregloFloral saveArregloFloral(ArregloFloral arregloFloral){
        return arregloFloralCrudRepository.save(arregloFloral);
    }

    public void delete(Integer arregloFloralId){
        arregloFloralCrudRepository.deleteById(arregloFloralId);
    }

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
    }
}
