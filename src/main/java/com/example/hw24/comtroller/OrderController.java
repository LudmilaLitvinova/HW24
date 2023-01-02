package com.example.hw24.comtroller;

import com.example.hw24.model.Order;
import com.example.hw24.model.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Ludmila Litvinova on 30.12
 */
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    @GetMapping(value = "/orders/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderRepository.getById(id);
    }

    @GetMapping(value = "/orders")
    public List<Order> getAllOrders() {
        return orderRepository.getAll();
    }


}
