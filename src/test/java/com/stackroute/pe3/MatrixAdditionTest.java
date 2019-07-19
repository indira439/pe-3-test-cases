package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition matrixAddition;

    @Before
    public void setUp() {
        matrixAddition = new MatrixAddition();
    }

    @After
    public void tearDown() {
        matrixAddition = null;
    }

    @Test
    public void given2MatricesShouldReturnSumOfThem() {
        //act
        int numberOfRows = 2;
        int numberOfColumns = 2;
        int inputMatrix1[][] = {{4, 8}, {6, 10}};
        int inputMatrix2[][] = {{5, 9}, {7, 11}};
        int expectedMatrix[][] = {{9, 17}, {13, 21}};
        //assert
        assertArrayEquals(expectedMatrix, matrixAddition.sumOfMatrices(numberOfRows, numberOfColumns, inputMatrix1, inputMatrix2));
    }

    @Test
    public void given2MatricesShouldReturnSumOfThemFailure() {
        //act
        int numberOfRows = 2;
        int numberOfColumns = 2;
        int inputMatrix1[][] = {{4, 8}, {6, 10}};
        int inputMatrix2[][] = {{5, 9}, {7, 11}};
        int expectedMatrix[][] = {{9, 17}, {100, 21}};
        //assert
        assertNotEquals(expectedMatrix, matrixAddition.sumOfMatrices(numberOfRows, numberOfColumns, inputMatrix1, inputMatrix2));
    }

//    @Test
//    public void given2MatricesOfDifferentSizeShouldReturnNull() {
//        //act
//        int numberOfRows = 2;
//        int numberOfColumns = 2;
//        int inputMatrix1[][] = {{4, 8}, {6, 10}};
//        int inputMatrix2[][] = {{5, 9, 11}, {7, 11, 13}};
//        //assert
//        assertArrayEquals(null, matrixAddition.sumOfMatrices(numberOfRows, numberOfColumns, inputMatrix1, inputMatrix2));
//    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void given2MatricesOutOfSizeShouldThrowException() {
        //act
        int numberOfRows = 2;
        int numberOfColumns = 2;
        int inputMatrix1[][] = {{4, 8}, {6, 10}};
        int inputMatrix2[][] = {{5, 9, 11}, {7, 11, 13}};
        int expectedMatrix[][] = {{9, 17}, {13, 21}};
        //assert
        assertArrayEquals(expectedMatrix, matrixAddition.sumOfMatrices(numberOfRows, numberOfColumns, inputMatrix1, inputMatrix2));
    }


    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        //act
        int numberOfRows = 2;
        int numberOfColumns = 2;
        int inputMatrix1[][] = null;
        int inputMatrix2[][] = {{5, 9, 11}, {7, 11, 13}};
        assertArrayEquals(null, matrixAddition.sumOfMatrices(numberOfRows, numberOfColumns, inputMatrix1, inputMatrix2));
    }
}