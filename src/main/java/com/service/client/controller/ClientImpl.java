package com.service.client.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-23T08:12:34.858Z")

@RestSchema(schemaId = "client")
@RequestMapping(path = "/client", produces = MediaType.APPLICATION_JSON)
public class ClientImpl {

    @Autowired
    private ClientDelegate userClientDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userClientDelegate.helloworld(name);
    }

}
