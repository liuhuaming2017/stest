package com.service.client.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;


@Component
public class ClientDelegate {

    private static RestTemplate restTemplate = RestTemplateBuilder.create();
    public String helloworld(String name){
        String name =restTemplate.getForObject("cse://apigteam/Helloworld?name="+name, null, String.class);
        // Do Some Magic Here!
        return name;
    }
}
