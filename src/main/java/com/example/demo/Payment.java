package com.example.demo;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class Payment {
    public Payment(){
        System.out.println("Created Object of Payment");
    }
    public void pay(){
        System.out.println("Successfully Pay");
    }
}
