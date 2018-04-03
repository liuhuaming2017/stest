package com.service.fdsafsd.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-03T15:12:17.449Z")

@RestSchema(schemaId = "fdsafsd")
@RequestMapping(path = "/fdsafsd", produces = MediaType.APPLICATION_JSON)
public class FdsafsdImpl {

    @Autowired
    private FdsafsdDelegate userFdsafsdDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userFdsafsdDelegate.helloworld(name);
    }

}
