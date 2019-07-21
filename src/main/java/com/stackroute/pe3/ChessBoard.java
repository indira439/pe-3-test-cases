package com.stackroute.pe3;

/**
 * Write a program to create a ChessBoard pattern with the help of multidimensional array,
 * where WW represents white color and BB represents Black color.
 */
public class ChessBoard {
    public String[][] chessBoardPattern(int rows, int columns) {

        /**Declare outputString variable to store the result*/
        String outputString[][] = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                /**Creates the chessboard pattern*/
                if (((i + j) % 2) == 0) {
                    outputString[i][j] = "WW";
                } else {
                    outputString[i][j] = "BB";
                }

            }
        }
        /**Return the chessboard pattern*/
        return outputString;
    }
}
