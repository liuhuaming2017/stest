package com.service.testjava2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestjava2 {

        Testjava2Delegate testjava2Delegate = new Testjava2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testjava2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}