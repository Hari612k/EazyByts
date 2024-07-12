package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer getCustomerById(Long id);

    List<Customer> getAllCustomers();

    Customer addCustomer(Customer customer);

    Customer updateCustomerById(Long id, Customer customer);

    void deleteCustomerById(Long id);
}
