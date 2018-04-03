package com.service.est.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-03T15:01:18.577Z")

@RestSchema(schemaId = "est")
@RequestMapping(path = "/est", produces = MediaType.APPLICATION_JSON)
public class EstImpl {

    @Autowired
    private EstDelegate userEstDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userEstDelegate.helloworld(name);
    }

}
