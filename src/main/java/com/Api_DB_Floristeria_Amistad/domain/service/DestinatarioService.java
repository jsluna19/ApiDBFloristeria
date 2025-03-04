package com.Api_DB_Floristeria_Amistad.domain.service;

import com.Api_DB_Floristeria_Amistad.persistence.Repository.DestinatarioRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Destinatario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinatarioService {

    @Autowired
    private DestinatarioRepository destinatarioRepository;

    public List<Destinatario> getAllDestinatario(){
        return destinatarioRepository.getAllDestinatario();
    }

    public Optional<Destinatario> getDestinatario(Integer destinatarioId){
        return destinatarioRepository.getDestinatario(destinatarioId);
    }

    public Destinatario saveDestinatario(Destinatario destinatario){
        return destinatarioRepository.save(destinatario);
    }

    public boolean deleteDestinatario(Integer destinatarioId){
        return getDestinatario(destinatarioId).map(destinatario -> {
            destinatarioRepository.delete(destinatarioId);
            return true;
        }).orElse(false);
    }

    public Optional<Destinatario> updateDestinatario(Destinatario destinatario, Integer destinatarioId){
        return destinatarioRepository.UpdateDestinatario(destinatario, destinatarioId);
    }
}
