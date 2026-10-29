package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class Order {
    Payment payment;
    public Order(@Lazy Payment payment){
        this.payment=payment;
        System.out.println("Created Object of Order");
    }
    public  void getOrder(){
        payment.pay();
    }

}
