//package com.stackroute.pe3;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class ExceptionCatcherTest {
//
//    ExceptionCatcher exceptionCatcher;
//
//    @Before
//    public void setUp() {
//        exceptionCatcher = new ExceptionCatcher();
//    }
//
//    @After
//    public void tearDown() {
//        exceptionCatcher = null;
//    }
//
//    @Test
//    public void givenExceptionMessageShouldReturnStringArrayOfMessages() {
//        String[] expectedMessages = {"Exception recieved from test", "Finally block reached"};
//        exceptionCatcher.exceptionCatch(expectedMessages[0]);
//        assertArrayEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
//                expectedMessages, exceptionCatcher.exceptionCatch());
//    }
//
//    @Test
//    public void givenNullMessageShouldReturnDefaultMessageInArray() {
//        String[] expectedMessages = {
//                "Default exception message",
//                "Finally block reached"
//        };
//        exceptionCatcher.setExceptionsMessage(null);
//        assertArrayEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
//                expectedMessages, exceptionCatcher.createException());
//    }
//
//    @Test
//    public void givenEmptyStringShouldReturnDefaultMessageInArray() {
//        String[] expectedMessages = {
//                "Default exception message",
//                "Finally block reached"
//        };
//        exceptionCatcher.setExceptionsMessage("");
//        assertArrayEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
//                expectedMessages, exceptionCatcher.createException());
//        exceptionCatcher.setExceptionsMessage("   ");
//        assertArrayEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
//                expectedMessages, exceptionCatcher.createException());
//    }
//
//    /**
//     * Test - createException()
//     * Check if the expected message does not change by comparing different strings
//     * in assertion.
//     */
//    @Test
//    public void givenExceptionMessageShouldReturnCorrectMessage() {
//        String[] expectedMessages = {
//                "Default exception message",
//                "Finally block reached"
//        };
//        exceptionCatcher.setExceptionsMessage("This is another exception message");
//        assertNotEquals("givenExceptionMessageShouldThrowExceptions: createException() should return string array of correct messages.",
//                expectedMessages[0], exceptionCatcher.createException()[0]);
//    }