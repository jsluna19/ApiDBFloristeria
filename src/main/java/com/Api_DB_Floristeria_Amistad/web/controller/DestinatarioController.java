package com.Api_DB_Floristeria_Amistad.web.controller;


import com.Api_DB_Floristeria_Amistad.persistence.entity.Destinatario;
import com.Api_DB_Floristeria_Amistad.service.DestinatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/destinatario")
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
    public Destinatario save(@RequestBody Destinatario destinatario){
        return destinatarioService.saveDestinatario(destinatario);
    }

    @DeleteMapping("/delete/{destinatarioId}")
    public boolean delete(@PathVariable("destinatarioID") Integer destinatarioId){
        return destinatarioService.deleteDestinatario(destinatarioId);
    }

    @PutMapping("/update/{destinatarioId}")
    public Optional<Destinatario> update(@RequestBody Destinatario destinatario, @PathVariable("destinatarioId") Integer destinatarioId){
        return destinatarioService.updateDestinatario(destinatario, destinatarioId);
    }

}
