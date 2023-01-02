package com.example.hw24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
/**
 * @author Ludmila Litvinova on 30.12
 */
@SpringBootApplication
public class Hw24Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw24Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void inited() {
        System.out.println("READY!");

    }
}
