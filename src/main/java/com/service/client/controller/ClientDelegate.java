package com.service.client.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;


@Component
public class ClientDelegate {

    private static RestTemplate restTemplate = RestTemplateBuilder.create();
    public String helloworld(String name){
        String returnvar =restTemplate.getForObject("cse://apigteam/Helloworld?name="+name, String.class, null);
        // Do Some Magic Here!
        return returnvar;
    }
}
