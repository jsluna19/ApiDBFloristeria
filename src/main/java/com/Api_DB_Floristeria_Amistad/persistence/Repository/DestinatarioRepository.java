package com.Api_DB_Floristeria_Amistad.persistence.Repository;

import com.Api_DB_Floristeria_Amistad.persistence.crud.DestinatarioCrudRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Destinatario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DestinatarioRepository {

    @Autowired
    private DestinatarioCrudRepository destinatarioCrudRepository;

    public List<Destinatario> getAllDestinatario(){
        return (List<Destinatario>) destinatarioCrudRepository.findAll();
    }

    public Optional<Destinatario> getDestinatario(Integer destinatarioId){
        return destinatarioCrudRepository.findById(destinatarioId);
    }

    public Destinatario save(Destinatario destinatario){
        return destinatarioCrudRepository.save(destinatario);
    }

    public void delete(Integer destinatarioId){
        destinatarioCrudRepository.deleteById(destinatarioId);
    }
}
