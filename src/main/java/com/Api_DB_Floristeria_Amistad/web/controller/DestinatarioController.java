package com.Api_DB_Floristeria_Amistad.web.controller;


import com.Api_DB_Floristeria_Amistad.persistence.entity.Destinatario;
import com.Api_DB_Floristeria_Amistad.service.DestinatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.processing.Generated;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/destinatarios")
public class DestinatarioController {
    @Autowired
    private DestinatarioService destinatarioService;

    @GetMapping("/all")
    public List<Destinatario> getAll(){
        return destinatarioService.getAllDestinatario();
    }

    @GetMapping("/{destinatarioId}")
    public Optional<Destinatario> getDestinatario(@PathVariable("destinatarioID") Integer destinatarioId){
        return destinatarioService.getDestinatario(destinatarioId);
    }

    @PostMapping("/save")
    public Destinatario save(Destinatario destinatario){
        return destinatarioService.saveDestinatario(destinatario);
    }

    @DeleteMapping("/delete/{destinatarioId}")
    public boolean delete(@PathVariable("destinatarioID") Integer destinatarioId){
        return destinatarioService.deleteDestinatario(destinatarioId);
    }

}
