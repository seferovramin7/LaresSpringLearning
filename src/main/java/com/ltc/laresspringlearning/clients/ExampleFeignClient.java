package com.ltc.laresspringlearning.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "example-service", url = "localhost:8080", configuration = FeignConfig.class)
public interface ExampleFeignClient {
    @GetMapping("/how")
    String getResource();
}

