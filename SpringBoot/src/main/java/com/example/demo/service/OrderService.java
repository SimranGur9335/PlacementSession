package com.example.demo.service;

import com.example.demo.entity.Orders;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Orders placeOrder(Orders order) {
        return repository.save(order);
    }

    public List<Orders> getAllOrders() {
        return repository.findAll();
    }

    public Orders getOrderById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteOrder(Long id) {
        repository.deleteById(id);
        return "Order Deleted Successfully";
    }

    public Long countOrders(Long customerId) {
        return repository.countOrder(customerId);
    }

    public double totalAmount(Long customerId) {
        return repository.totalAmount(customerId);
    }

    public double totalRevenue() {
        return repository.totalRevenue();
    }
}