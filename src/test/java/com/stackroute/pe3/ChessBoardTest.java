package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setUp() {
        this.chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() {
        chessBoard = null;
    }

    @Test
    public void givenROwsAndColumnsShouldReturnChessBoardPattern() {
        //act
        String[][] expectedResult = {
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}
        };
        //assert
        assertArrayEquals(expectedResult, chessBoard.chessBoardPattern(8, 8));
    }

    @Test
    public void givenROwsAndColumnsShouldReturnChessBoardPatternFailure() {
        //act
        String[][] expectedResult = {
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"},
                {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"},
                {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW", "WW", "WW"}
        };
        //assert
        assertNotEquals(expectedResult, chessBoard.chessBoardPattern(8, 8));
    }

    @Test(expected = NegativeArraySizeException.class)
    public void givenInvalidSizeShouldThrowException() {
        chessBoard.chessBoardPattern(-8, 8);
        chessBoard.chessBoardPattern(8, -8);

    }

//    @Test
//    public void givenStringShouldThrowException() {
//        assertEquals(null,chessBoard.chessBoardPattern(Integer.parseInt("rows"),Integer.parseInt("columns")));
//    }

    @Test
    public void givenZeroRowsAndColumnsShouldReturnEmptyArray() {
        //act
        String[] expectedResult = {};
        //assert
        assertArrayEquals(expectedResult, chessBoard.chessBoardPattern(0, 0));
    }


}