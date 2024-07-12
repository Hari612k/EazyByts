package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.Invoice;

import java.util.List;
import java.util.Optional;

public interface InvoiceService {
    List<Invoice> getAllInvoices();
    Invoice getInvoiceById(Long id);
    Invoice createInvoice(Invoice invoice);
    Invoice updateInvoice(Invoice invoice);
    void deleteInvoiceById(Long id);

    Invoice saveInvoice(Invoice invoice);
}
