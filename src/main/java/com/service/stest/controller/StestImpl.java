package com.service.stest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-25T08:56:09.707Z")

@RestSchema(schemaId = "stest")
@RequestMapping(path = "/stest", produces = MediaType.APPLICATION_JSON)
public class StestImpl {

    @Autowired
    private StestDelegate userStestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userStestDelegate.helloworld(name);
    }

}
