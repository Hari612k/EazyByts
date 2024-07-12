package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order saveOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrderById(Long id);

    Order createOrder(Order order);



}
