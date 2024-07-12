package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Define custom queries if needed
}
