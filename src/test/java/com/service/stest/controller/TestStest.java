package com.service.stest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestStest {

        StestDelegate stestDelegate = new StestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = stestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}