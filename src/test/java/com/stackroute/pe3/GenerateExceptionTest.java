package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionTest {

    GenerateException generateException;

    @Before
    public void setUp() {
        generateException = new GenerateException();
    }

    @After
    public void tearDown() {
        generateException = null;
    }

    @Test
    public void givenMethodCallShouldReturnNegativeArraySizeExceptionMessage() {
        String expectedMessage = "Can't create array of negative size";
        assertEquals(expectedMessage, generateException.generateNegativeArraySizeException());
    }

    @Test
    public void givenMethodCallShouldReturnIndexOutOfBoundsException() {
        String expectedMessage = "Index out of bound";
        assertEquals(expectedMessage, generateException.generateIndexOutOfBoundsException());
    }

    @Test
    public void givenMethodCallShouldReturnINullPointerException() {
        String expectedMessage = "Input String cannot be null";
        assertEquals(expectedMessage, generateException.generateNullPointerException());
    }
}