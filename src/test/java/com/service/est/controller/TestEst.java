package com.service.est.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestEst {

        EstDelegate estDelegate = new EstDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = estDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}