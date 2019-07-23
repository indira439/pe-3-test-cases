package com.stackroute.pe3;

public class GenerateException {

    public String generateNegativeArraySizeException() {
        int arrSize = -8;
        String outputString = "";

        try {
            int[] array = new int[arrSize];
        } catch (NegativeArraySizeException exception) {
            outputString = "Can't create array of negative size";
        }
        return outputString;
    }

    public String generateIndexOutOfBoundsException() {
        String outputString = "";

        try {
            int a[] = new int[10];
            a[11] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            outputString = "Index out of bound";
        }

        return outputString;
    }

    public String generateNullPointerException() {
        String outputString = "";

        try {
            String string = null;
            int length = string.length();
        } catch (NullPointerException e) {
            outputString = "Input String cannot be null";
        }

        return outputString;
    }


}

