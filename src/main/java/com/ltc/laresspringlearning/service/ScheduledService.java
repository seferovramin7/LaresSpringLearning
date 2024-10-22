package com.ltc.laresspringlearning.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {



    @Scheduled(cron = "0 0/10 17 * * ?")
    public void getHello() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Hello x");
    }


}
