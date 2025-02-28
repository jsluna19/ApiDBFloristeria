package com.Api_DB_Floristeria_Amistad.persistence.crud;

import com.Api_DB_Floristeria_Amistad.persistence.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PedidoCrudRepository extends CrudRepository<Pedido, Integer> {}
