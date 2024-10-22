package com.ltc.laresspringlearning.service;


import com.ltc.laresspringlearning.entities.Order;
import com.ltc.laresspringlearning.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void saveOrder(Order order){
        orderRepository.save(order);
    }



}
