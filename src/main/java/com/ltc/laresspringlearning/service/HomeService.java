package com.ltc.laresspringlearning.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getHome() {
        return "Hello home";
    }


}
