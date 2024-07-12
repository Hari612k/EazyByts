package com.intern.crm_system.Controller;

import com.intern.crm_system.Entity.Invoice;
import com.intern.crm_system.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable Long id) {
        return invoiceService.getInvoiceById(id);
    }

    @PostMapping
    public Invoice createInvoice(@RequestBody Invoice invoice) {
        return invoiceService.saveInvoice(invoice);
    }

    @PutMapping("/{id}")
    public Invoice updateInvoice(@PathVariable Long id, @RequestBody Invoice invoice) {
        // Ensure the ID from the path variable is set on the invoice object
        invoice.setId(id);
        return invoiceService.saveInvoice(invoice);
    }

    @DeleteMapping("/{id}")
    public void deleteInvoice(@PathVariable Long id) {
        invoiceService.deleteInvoiceById(id);
    }
}

