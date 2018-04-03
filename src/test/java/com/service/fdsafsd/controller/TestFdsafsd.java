package com.service.fdsafsd.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestFdsafsd {

        FdsafsdDelegate fdsafsdDelegate = new FdsafsdDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = fdsafsdDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}