package com.intern.crm_system.ServiceImpl;

import com.intern.crm_system.Entity.Customer;
import com.intern.crm_system.Repository.CustomerRepository;
import com.intern.crm_system.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomerById(Long customerId, Customer customer) {
        Customer existingCustomer = customerRepository.findById(customerId).orElse(null);
        if (existingCustomer != null) {
            existingCustomer.setFirstName(customer.getFirstName());
            existingCustomer.setLastName(customer.getLastName());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setPhoneNumber(customer.getPhoneNumber());
            // Update other fields as necessary
            return customerRepository.save(existingCustomer);
        } else {
            return null; // Or handle this case as necessary, possibly throwing an exception
        }
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }
}

