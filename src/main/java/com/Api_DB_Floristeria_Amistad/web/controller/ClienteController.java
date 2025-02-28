package com.Api_DB_Floristeria_Amistad.web.controller;

import com.Api_DB_Floristeria_Amistad.persistence.entity.Cliente;
import com.Api_DB_Floristeria_Amistad.service.ClienteService;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/all")
    public List<Cliente> getAll(){
        return clienteService.getAllCliente();
    }

    @GetMapping("/{clienteId}")
    public Optional<Cliente> getCliente(@PathVariable("clienteId") Integer clienteId){
        return clienteService.getCliente(clienteId);
    }

    @PostMapping("/save")
    public Cliente save(@RequestBody Cliente cliente){
        return clienteService.saveCliente(cliente);
    }

    @DeleteMapping("/delete/{clienteId}")
    public boolean delete(@PathVariable("clienteId") Integer clienteId){
        return clienteService.deleteCliente(clienteId);
    }

    /*
    @PutMapping("/update/{clienteId}")
    public Cliente update(@PathVariable("clienteId") Integer clienteId, @RequestBody Cliente cliente){
        return clienteService.updateCliente(clienteId, cliente);
    }*/

}
