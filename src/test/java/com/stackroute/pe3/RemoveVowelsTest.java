package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels removeVowels;

    @Before
    public void setUp() {
        this.removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() {
        removeVowels = null;
    }

    @Test
    public void givenStringArrayShouldReturnStringArrayWithoutVowels() {
        //act
        String[] inputString = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] expectedResult = {"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"};
        //assert
        assertArrayEquals(expectedResult,removeVowels.vowelsRemover(inputString));
    }

    @Test
    public void givenStringArrayShouldReturnStringArrayWithoutVowelsFailure() {
        //act
        String[] inputString = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] expectedResult = {"India", "Untd Stts", "Grmny", "Egypt", "czchslvk"};
        //assert
        assertNotEquals(expectedResult,removeVowels.vowelsRemover(inputString));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        //act
        String[] inputString= null;
        //assert
        assertEquals("null",removeVowels.vowelsRemover(inputString));
    }

    @Test
    public void givenEmptyStringShouldThrowErrorMessage() {
        //act
        String[] inputString = {};
        //assert
        assertArrayEquals(null,removeVowels.vowelsRemover(inputString));
    }

    @Test
    public void givenEmptyStringShouldThrowErrorMessages() {
        //act
        String[] inputString = {""};
        //assert
        assertArrayEquals(null,removeVowels.vowelsRemover(inputString));
    }

    @Test
    public void givenNumbersAsInputShouldThrowErrorMessage() {
        //act
        String[] inputString = {"12","34","67"};
        //assert
        assertArrayEquals(null,removeVowels.vowelsRemover(inputString));
    }

}