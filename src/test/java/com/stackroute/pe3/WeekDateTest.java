package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekDateTest {
    WeekDate weekDate;

    @Before
    public void setUp() {
        this.weekDate = new WeekDate();
    }

    @After
    public void tearDown() {
        weekDate = null;
    }

    @Test
    public void givenCurrentDateShouldReturnFirstDateOfTheWeek() {
        //act
        String expectedResult = "Mon 15/07/2019";
        //assert
        assertEquals(expectedResult,weekDate.getFirstDate());
    }

    @Test
    public void givenCurrentDateShouldReturnLastDateOfTheWeek() {
        //act
        String expectedResult = "Sun 21/07/2019";
        //assert
        assertEquals(expectedResult,weekDate.getLastDate());
    }

    @Test
    public void givenCurrentDateShouldReturnFirstDateOfTheWeekFailure() {
        //act
        String expectedResult = "Sun 15/07/2019";
        //assert
        assertNotEquals(expectedResult,weekDate.getFirstDate());
    }

    @Test
    public void givenCurrentDateShouldReturnLastDateOfTheWeekFailure() {
        //act
        String expectedResult = "Mon 21/07/2019";
        //assert
        assertNotEquals(expectedResult,weekDate.getLastDate());
    }




}