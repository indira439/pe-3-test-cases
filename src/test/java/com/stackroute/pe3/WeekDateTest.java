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
    public void tearDown() throws Exception {
        weekDate = null;
    }

    @Test
    public void ShouldReturnFirstDateOfTheWeek() {
        //act
        String expectedResult = "Mon 15/07/2019";
        //assert
        assertEquals(expectedResult,weekDate.getFirstDate());
    }

    @Test
    public void ShouldReturnLastDateOfTheWeek() {
        //act
        String expectedResult = "Sun 21/07/2019";
        //assert
        assertEquals(expectedResult,weekDate.getLastDate());
    }

    @Test
    public void ShouldReturnFirstDateOfTheWeekFailure() {
        //act
        String expectedResult = "Sun 15/07/2019";
        //assert
        assertNotEquals(expectedResult,weekDate.getFirstDate());
    }

    @Test
    public void ShouldReturnLastDateOfTheWeekFailure() {
        //act
        String expectedResult = "Mon 21/07/2019";
        //assert
        assertNotEquals(expectedResult,weekDate.getLastDate());
    }




}