package com.Api_DB_Floristeria_Amistad.domain.repository;

import java.util.List;
import java.util.Optional;

import com.Api_DB_Floristeria_Amistad.domain.dto.FlowerArrangement;

public interface FlowerArrangementRepository {

    List<FlowerArrangement> getAllFloweArragement();
    Optional<FlowerArrangement> getFloweArragement(Integer floweArragementId);
    FlowerArrangement saveFloweArragement(FlowerArrangement floweArragement);
    void deleteFloweArragement(Integer floweArragementId);
    Optional<FlowerArrangement> updateFloweArragement(FlowerArrangement floweArragement, Integer floweArragementId);

}
