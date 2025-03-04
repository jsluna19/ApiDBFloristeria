package com.Api_DB_Floristeria_Amistad.domain.repository;

import java.util.List;
import java.util.Optional;

import com.Api_DB_Floristeria_Amistad.domain.dto.Order;

public interface OrderRepository {

    List<Order> getAllOrder();
    Optional<Order> getOrder(Integer orderId);
    Order saveOrder(Order order);
    void deleteOrder(Integer orderId);
    Optional<Order> updateOrder(Order order, Integer orderId);

}
