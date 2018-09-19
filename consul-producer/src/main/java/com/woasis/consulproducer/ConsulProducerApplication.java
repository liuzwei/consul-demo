package com.woasis.consulproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProducerApplication.class, args);
    }
}
