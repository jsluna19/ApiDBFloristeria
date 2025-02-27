package com.Api_DB_Floristeria_Amistad.persistence.crud;

import com.Api_DB_Floristeria_Amistad.persistence.entity.Destinatario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DestinatarioCrudRepository extends CrudRepository<Destinatario, Integer> {

    /*
    List<Destinatario> getAll();
    Optional<Destinatario> getDestinatario(Integer destinatarioId);
    Destinatario save(Destinatario destinatario);
    void delete(Integer destinatarioId);
     */
}
