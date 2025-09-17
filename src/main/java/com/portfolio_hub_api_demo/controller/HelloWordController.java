package com.portfolio_hub_api_demo.controller;

import com.portfolio_hub_api_demo.domain.User;
import com.portfolio_hub_api_demo.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;

//Indica que a classe é um controller Rest
@RestController
@RequestMapping("/hello-world")
public class HelloWordController {

    private HelloWorldService helloWorldService;

    public HelloWordController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
    //Prtecisa mapear os endpoints
    //UIsa o metodo get
    @GetMapping
    public String helloWorld() {
        return "<b> Hello world </b>" + helloWorldService.helloWorld("Vinicinho");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body) {
        return "Fiz um post " + body.getName();
    }
}
