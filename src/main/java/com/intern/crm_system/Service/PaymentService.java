package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment getPaymentById(Long id);
    Payment savePayment(Payment payment);
    Payment updatePayment(Payment payment);
    void deletePaymentById(Long id);

    Payment createPayment(Payment payment);
}
