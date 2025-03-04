package com.Api_DB_Floristeria_Amistad.domain.repository;

import java.util.List;
import java.util.Optional;

import com.Api_DB_Floristeria_Amistad.domain.dto.PaymentMethod;

public interface PaymentMethodRepository {

    List<PaymentMethod> getAllPaymentMethod();
    Optional<PaymentMethod> getPaymentMethod(Integer paymentMethodId);
    PaymentMethod savePaymentMethod(PaymentMethod paymentMethod);
    void deletePaymentMethod(Integer paymentMethodId);
    Optional<PaymentMethod> updatePaymentMethod(PaymentMethod paymentMethod, Integer paymentMethodId);

}
