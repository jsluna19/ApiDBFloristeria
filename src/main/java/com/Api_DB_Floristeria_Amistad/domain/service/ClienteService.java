package com.Api_DB_Floristeria_Amistad.domain.service;

import com.Api_DB_Floristeria_Amistad.persistence.Repository.ClienteRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllCliente(){
        return clienteRepository.getAllCliente();
    }

    public Optional<Cliente> getCliente(Integer clienteId){
        return clienteRepository.getCliente(clienteId);
    }

    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.saveCliente(cliente);
    }

    public boolean deleteCliente(Integer clienteId){
        return getCliente(clienteId).map(cliente -> {
            clienteRepository.delete(clienteId);
            return true;
        }).orElse(false);
    }

    public Optional<Cliente> updateCliente(Integer clienteId, Cliente clienteActualizado){
        return clienteRepository.updateCliente(clienteId, clienteActualizado);
    }
}
