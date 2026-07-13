package com.namish.demo.DependencyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    PaymentService paymentService;
    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeHolder() {
        paymentService.pay();
        System.out.println("Order placed");
    }
}
