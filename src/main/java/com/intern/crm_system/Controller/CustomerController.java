package com.intern.crm_system.Controller;

import com.intern.crm_system.Entity.Customer;
import com.intern.crm_system.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long customerId) {
        Customer customer = customerService.getCustomerById(customerId);
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }

    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.addCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @PutMapping("/update/{customerId}")
    public ResponseEntity<Customer> updateCustomerById(@PathVariable Long customerId, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomerById(customerId, customer);
        if (updatedCustomer != null) {
            return ResponseEntity.ok(updatedCustomer);
        } else {
            return ResponseEntity.notFound().build(); // Handle the case where the customer is not found
        }
    }

    @DeleteMapping("/delete/{customerId}")
    public ResponseEntity<?> deleteCustomerById(@PathVariable Long customerId) {
        customerService.deleteCustomerById(customerId);
        return ResponseEntity.ok().build();
    }
}
