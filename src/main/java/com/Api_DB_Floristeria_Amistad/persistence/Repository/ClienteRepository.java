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

    public Optional<Cliente> updateCliente(Integer clienteId, Cliente nuevoCliente){
        Optional<Cliente> clienteOptional = clienteCrudRepository.findById(clienteId);
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
        
            // Verificamos qué atributos del nuevo cliente no son nulos antes de actualizar
            if (nuevoCliente.getNombre() != null) {
                cliente.setNombre(nuevoCliente.getNombre());
            }
            if (nuevoCliente.getEmail() != null) {
                cliente.setEmail(nuevoCliente.getEmail());
            }
            if (nuevoCliente.getTelefono() != null) {
                cliente.setTelefono(nuevoCliente.getTelefono());
            }
            if (nuevoCliente.getDireccion() != null) {
                cliente.setDireccion(nuevoCliente.getDireccion());
            }
        
            return Optional.of(clienteCrudRepository.save(cliente)); // Guardamos el cliente actualizado
        }else{
            return Optional.empty();
        }
    }
}
