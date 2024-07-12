package com.intern.crm_system.ServiceImpl;

import com.intern.crm_system.Entity.Invoice;
import com.intern.crm_system.Repository.InvoiceRepository;
import com.intern.crm_system.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice getInvoiceById(Long id) {
        return invoiceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice updateInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public void deleteInvoiceById(Long id) {
        invoiceRepository.deleteById(id);
    }

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
}
