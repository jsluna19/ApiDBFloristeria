package com.Api_DB_Floristeria_Amistad.domain.repository;

import java.util.List;
import java.util.Optional;

import com.Api_DB_Floristeria_Amistad.domain.dto.Client;

public interface ClientRepository {

    List<Client> getAllClient();
    Optional<Client> getClient(Integer clientId);
    Client saveClient(Client client);
    void deleteClient(Integer clientId);
    Optional<Client> updateClient(Client client, Integer clientId);

}
