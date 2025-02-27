package com.Api_DB_Floristeria_Amistad.service;

import com.Api_DB_Floristeria_Amistad.persistence.Repository.DestinatarioRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Destinatario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinatarioService {

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
}
