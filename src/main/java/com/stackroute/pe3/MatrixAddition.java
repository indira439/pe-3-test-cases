package com.stackroute.pe3;

/**
 * Write a program to compute the addition of two matrix, Read the number of rows and
 * columns as input, also the values of each matrix
 * Output:
 * Input number of rows of matrix: 3
 * Input number of columns of matrix: 2
 * Input elements of first matrix: 1 2 3 4 5 6
 * Input the elements of second matrix: 9 8 7 6 5 4
 * Sum of the matrices:-
 * 10 10
 * 10 10
 * 10 10
 */

public class MatrixAddition {

    public int[][] sumOfMatrices(int numberOfRows, int numberOfColumns, int[][] inputMatrix1, int[][] inputMatrix2) {

        /**Declare sumMatrix to store the addition of matrices */
        int[][] sumMatrix = new int[numberOfRows][numberOfColumns];

        /**Throws exception if array size is greater than defined size*/
        if (inputMatrix1.length > numberOfRows || inputMatrix1[0].length > numberOfColumns || inputMatrix2.length > numberOfRows || inputMatrix2[0].length > numberOfColumns) {
            throw new ArrayIndexOutOfBoundsException();
        }

        /**Add the 2 input matrices and store it in sumMatrix*/
        if (inputMatrix1.length == inputMatrix1.length && inputMatrix2[0].length == inputMatrix2[0].length) {
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    sumMatrix[i][j] = inputMatrix1[i][j] + inputMatrix2[i][j];
                }
            }
        } else {
            /**If input arrays are  not of same size return null as output */
            sumMatrix = null;
        }
        /**Return sum of the matrices */
        return sumMatrix;
    }
}
