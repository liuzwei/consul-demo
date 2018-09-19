package com.woasis.consulproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProducerController {

    @GetMapping("/producer")
    public String producer(){
        System.out.println("I'm producer");
        return "Hello, I'm producer";
    }
}
