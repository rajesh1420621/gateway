package com.pxp.gateway.controller;

import com.pxp.gateway.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    private HelloWorldService helloWorld;

    @RequestMapping(value = "helloworld", method = RequestMethod.GET)
    public String helloWorld(){
        return helloWorld.helloWorld();
    }
}
