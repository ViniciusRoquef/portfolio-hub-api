package com.portfolio_hub_api_demo.service;

import org.springframework.stereotype.Service;

//Indica para o sprong que é uma classe service e é gerenciada pelo spring
@Service
public class HelloWorldService {

    public String helloWorld(String name) {
        return name;
    }
}
