package com.Api_DB_Floristeria_Amistad.persistence.Repository;

import com.Api_DB_Floristeria_Amistad.persistence.crud.ClienteCrudRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository{

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAllCliente(){
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public Optional<Cliente> getCliente(Integer clienteId){
        return clienteCrudRepository.findById(clienteId);
    }

    public Cliente saveCliente(Cliente cliente){
        return clienteCrudRepository.save(cliente);
    }

    public void delete(Integer clienteId){
        clienteCrudRepository.deleteById(clienteId);
    }
}
