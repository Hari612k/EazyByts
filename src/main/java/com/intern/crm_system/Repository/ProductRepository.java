package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Define custom queries if needed
}
