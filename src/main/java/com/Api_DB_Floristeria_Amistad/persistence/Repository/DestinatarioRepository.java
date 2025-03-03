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

    public Optional<Destinatario> UpdateDestinatario(Destinatario destinatario, Integer destinatarioId){
        return destinatarioCrudRepository.findById(destinatarioId)
            .map(destinatarioActualizado -> {
                // Actualización de los campos según corresponda
                if (destinatario.getNombre() != null) {
                    destinatarioActualizado.setNombre(destinatario.getNombre());
                }
                if (destinatario.getTelefono() != null) {
                    destinatarioActualizado.setTelefono(destinatario.getTelefono());
                }
                if (destinatario.getDireccion() != null) {
                    destinatarioActualizado.setDireccion(destinatario.getDireccion());
                }
                if (destinatario.getClienteId() != null) {
                    destinatarioActualizado.setClienteId(destinatario.getClienteId());
                    
                }
                // Guardar el destinatario actualizado
                return destinatarioCrudRepository.save(destinatarioActualizado);
            });
    }
}
