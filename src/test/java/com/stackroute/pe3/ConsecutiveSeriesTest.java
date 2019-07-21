package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveSeriesTest {
    ConsecutiveSeries consecutiveSeries;

    @Before
    public void setUp() {
        this.consecutiveSeries = new ConsecutiveSeries();
    }

    @After
    public void tearDown() {
        consecutiveSeries = null;
    }

    @Test
    public void givenSeriesOfNumbersShouldReturnTrue() {
        //act
        String string = "54,53,52,51,50,49,48";
        String expectedResult = "Given series is a Consecutive series";
        //assert
        assertEquals(expectedResult, consecutiveSeries.seriesCheck(string));
    }

    @Test
    public void givenSeriesOfNumbersShouldReturnFalse() {
        //act
        String string = "1,2,3,4,5,6,6";
        String expectedResult = "Given series is not a Consecutive series";
        //assert
        assertEquals(expectedResult, consecutiveSeries.seriesCheck(string));
    }

    @Test
    public void givenSeriesOfNumberShouldReturnFalse() {
        //act
        String string = "98,96,95,94,93";
        String expectedResult = "Given series is not a Consecutive series";
        //assert
        assertEquals(expectedResult, consecutiveSeries.seriesCheck(string));
    }

    @Test
    public void givenEmptyStringShouldThrowErrorMessage() {
        //act
        String string = "";
        String expectedResult = "String cannot be empty";
        //assert
        assertEquals(expectedResult, consecutiveSeries.seriesCheck(string));
    }

//    @Test
//    public void givenNegativeValuesShouldThrowErrorMessage() {
//        //act
//        String string = "-1,-2,-4,-5,-6,-7,-8";
//        String expectedResult = "Input cannot be negative";
//        //assert
//        assertEquals(expectedResult, consecutiveSeries.seriesCheck(string));
//    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        consecutiveSeries.seriesCheck(null);
    }

    @Test
    public void givenEmptyStringShouldThrowNullPointerException() {
        //act
        String string = " ";
        String expectedResult = "String cannot be empty";
        //assert
        assertEquals(expectedResult, consecutiveSeries.seriesCheck(string));
    }


}