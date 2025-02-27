package com.Api_DB_Floristeria_Amistad.persistence.crud;

import com.Api_DB_Floristeria_Amistad.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {

    /*
    List<Cliente> getAll();
    Optional<Cliente> getCliente(Integer clienteId);
    Cliente save(Cliente cliente);
    void delete(Integer clienteId);
    */
}
