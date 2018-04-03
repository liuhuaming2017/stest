package com.service.test.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest {

        TestDelegate testDelegate = new TestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}