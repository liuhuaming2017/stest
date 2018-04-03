package com.service.test.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-03T15:03:28.378Z")

@RestSchema(schemaId = "test")
@RequestMapping(path = "/test", produces = MediaType.APPLICATION_JSON)
public class TestImpl {

    @Autowired
    private TestDelegate userTestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestDelegate.helloworld(name);
    }

}
