package com.example.hw24.configuration;

import com.example.hw24.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ludmila Litvinova on 30.12
 */
@Configuration
public class ProductConfiguration {
    @Bean
    public Product breadProduct() {
        return new Product(1, "bread", 20.0);
    }

    @Bean
    public Product oilProduct() {
        return new Product(2, "oil", 50.0);
    }

    @Bean
    public Product colaProduct() {
        return new Product(3, "cola", 40.0);
    }
}
