package com.service.test04.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest04 {

        Test04Delegate test04Delegate = new Test04Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test04Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}