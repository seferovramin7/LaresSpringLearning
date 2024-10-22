package com.ltc.laresspringlearning.clients;


import com.ltc.laresspringlearning.dto.Beer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "beer-client", url = "https://api.sampleapis.com/beers", configuration = FeignConfig.class)
public interface BeerFeignClient {


    @GetMapping("ale")
    public List<Beer> getAleBeers();

}
