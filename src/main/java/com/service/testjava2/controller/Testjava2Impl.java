package com.service.testjava2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-03T15:48:31.825Z")

@RestSchema(schemaId = "testjava2")
@RequestMapping(path = "/testjava2", produces = MediaType.APPLICATION_JSON)
public class Testjava2Impl {

    @Autowired
    private Testjava2Delegate userTestjava2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestjava2Delegate.helloworld(name);
    }

}
