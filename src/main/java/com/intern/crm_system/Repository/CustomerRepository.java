package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Define custom queries if needed
}
