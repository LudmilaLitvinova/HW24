package com.example.hw24.configuration;

import com.example.hw24.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
/**
 * @author Ludmila Litvinova on 30.12
 */
@Configuration
@RequiredArgsConstructor
public class OrderConfiguration {
    private final ProductConfiguration pc;

    @Bean
    public Order bigOrder() {
        return new Order(1, LocalDate.of(2022, Month.AUGUST,20), 110.0, List.of(pc.breadProduct(),pc.colaProduct(), pc.oilProduct()));
    }

    @Bean
    public Order smallOrder() {
        return new Order(2, LocalDate.of(2023, Month.JANUARY,2), 40.0, List.of(pc.colaProduct()));
    }
}
