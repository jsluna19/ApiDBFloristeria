package com.Api_DB_Floristeria_Amistad.persistence.Repository;

import com.Api_DB_Floristeria_Amistad.domain.dto.Client;
import com.Api_DB_Floristeria_Amistad.domain.repository.ClientRepository;
import com.Api_DB_Floristeria_Amistad.persistence.crud.ClienteCrudRepository;
import com.Api_DB_Floristeria_Amistad.persistence.entity.Cliente;
import com.Api_DB_Floristeria_Amistad.persistence.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements ClientRepository {

    @Autowired
    private ClientMapper mapper;
    private ClienteCrudRepository clienteCrudRepository;

    @Override
    public List<Client> getAllClient() {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return mapper.toClient(clientes);
    }

    @Override
    public Optional<Client> getClient(Integer clientId) {
        return clienteCrudRepository.findById(clientId).map(client -> mapper.toClient(client));
    }

    @Override
    public Client saveClient(Client client) {
        Cliente cliente = mapper.toCliente(client);
        return mapper.toClient(clienteCrudRepository.save(cliente));
    }

    @Override
    public void deleteClient(Integer clientId) {
        clienteCrudRepository.deleteById(clientId);
    }

    @Override
    public Optional<Client> updateClient(Client client, Integer clientId) {
        Optional<Cliente> clienteOptional = clienteCrudRepository.findById(clientId);
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();

            if (client.getName() != null) {
                cliente.setNombre(client.getName());
            }

            if (client.getEmail() != null) {
                cliente.setEmail(client.getEmail());
            }

            if (client.getPhone() != null) {
                cliente.setTelefono(client.getPhone());
            }

            if (client.getAddress() != null) {
                cliente.setDireccion(client.getAddress());
            }

            if (client.getIdcard() != null) {
                cliente.setCedula(client.getIdcard());
            }
            return Optional.of(mapper.toClient(clienteCrudRepository.save(cliente)));
        }else {
            return Optional.empty();
        }
    }
}
