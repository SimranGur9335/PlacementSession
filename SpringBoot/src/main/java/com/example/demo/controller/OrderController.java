package com.example.demo.controller;

import com.example.demo.entity.Orders;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public Orders placeOrder(@RequestBody Orders order) {
        return service.placeOrder(order);
    }

    @GetMapping
    public List<Orders> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        return service.deleteOrder(id);
    }

    @GetMapping("/customer/{customerId}/count")
    public Long countOrders(@PathVariable Long customerId) {
        return service.countOrders(customerId);
    }

    @GetMapping("/customer/{customerId}/amount")
    public double totalAmount(@PathVariable Long customerId) {
        return service.totalAmount(customerId);
    }

    @GetMapping("/revenue")
    public double totalRevenue() {
        return service.totalRevenue();
    }
}