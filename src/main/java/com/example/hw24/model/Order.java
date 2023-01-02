package com.example.hw24.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
/**
 * @author Ludmila Litvinova on 30.12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private int id;
    private LocalDate date;
    private double cost;
    private List<Product> products;
}
