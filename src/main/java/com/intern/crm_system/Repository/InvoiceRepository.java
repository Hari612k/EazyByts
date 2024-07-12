package com.intern.crm_system.Repository;

import com.intern.crm_system.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    // Define custom queries if needed
}
