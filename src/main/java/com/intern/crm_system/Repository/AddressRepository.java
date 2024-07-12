package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    // Define custom queries if needed
}

