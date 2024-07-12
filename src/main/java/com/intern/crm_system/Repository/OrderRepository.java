package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Define custom queries if needed
}
