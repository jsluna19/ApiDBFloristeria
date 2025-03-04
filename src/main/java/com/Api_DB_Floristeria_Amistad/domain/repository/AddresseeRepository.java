package com.Api_DB_Floristeria_Amistad.domain.repository;

import java.util.List;
import java.util.Optional;

import com.Api_DB_Floristeria_Amistad.domain.dto.Addressee;

public interface AddresseeRepository {

    List<Addressee> getAllAddressee();
    Optional<Addressee> getAddressee(Integer addresseeId);
    Addressee saveAddressee(Addressee addressee);
    void deleteAddressee(Integer addresseeId);
    Optional<Addressee> updateAddressee(Addressee addressee, Integer addresseeId);

}
