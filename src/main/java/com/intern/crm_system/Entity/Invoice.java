package com.intern.crm_system.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "invoice_number", nullable = false, unique = true)
    private String invoiceNumber;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "invoice_date", nullable = false)
    private LocalDateTime invoiceDate;

    // Constructors, getters, and setters


    public Invoice() {
    }

    public Invoice(Long id, String invoiceNumber, BigDecimal amount, LocalDateTime invoiceDate) {
        this.id = id;
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}

