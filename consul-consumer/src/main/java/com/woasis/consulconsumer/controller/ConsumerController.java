package com.woasis.consulconsumer.controller;

import com.woasis.consulconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String getProducer(){

        return consumerService.consumer();
    }
}
