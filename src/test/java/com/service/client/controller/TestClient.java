package com.service.client.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestClient {

        ClientDelegate clientDelegate = new ClientDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = clientDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}