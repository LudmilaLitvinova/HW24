package com.example.hw24.model;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Ludmila Litvinova on 30.12
 */
@Service
@Data
public class OrderRepository {

    List<Order> orders;

    public OrderRepository(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getAll() {
        return orders;
    }

    public Order getById(int id) {
        return orders.stream().filter(order -> order.getId() == id).findFirst().orElse(null);
    }

    public void addOrder(List<Product> products) {
        double totalCost = 0.0;
        int id = (int) (Math.random() * 1000);
        for (Product product : products
        ) {
            totalCost += product.getCost();
        }
        orders.add(new Order(id, LocalDate.now(), totalCost, products));
    }
}

