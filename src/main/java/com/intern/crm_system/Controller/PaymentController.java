package com.intern.crm_system.Controller;

import com.intern.crm_system.Entity.Payment;
import com.intern.crm_system.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.savePayment(payment);
    }

    @PutMapping("/{id}")
    public Payment updatePayment(@PathVariable Long id, @RequestBody Payment payment) {
        // Ensure the ID from the path variable is set on the payment object
        payment.setId(id);
        return paymentService.updatePayment(payment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentService.deletePaymentById(id);
    }
}

