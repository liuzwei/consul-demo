package com.woasis.consulconsumer.remote;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 调用生产者服务
 */
@FeignClient("consul-producer")
public interface ProducerRemote {

    @GetMapping("/producer")
    String producer();
}
