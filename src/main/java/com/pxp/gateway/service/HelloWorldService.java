package com.pxp.gateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloWorldService {

    @Autowired
    private RestTemplate restTemplate;

    public String helloWorld(){

        String helloMessage = restTemplate.getForObject("http://microservice-1/hello", String.class);
        String worldMessage = restTemplate.getForObject("http://microservice-2/world", String.class);
        System.out.println(helloMessage + " " + worldMessage);
        return helloMessage + " " + worldMessage;
    }
}
