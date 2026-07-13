package com.namish.demo.DependencyInjection;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PaymentService {
    public void pay() {
        System.out.println("Payment done");
    }
}
