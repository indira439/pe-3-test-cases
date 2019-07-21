package com.stackroute.pe3;

/**
 * Write a program to find out if a series of 7 digits are consecutive numbers. To make this
 * easier, assume the digits are a string and use split()
 */
public class ConsecutiveSeries {
    public String seriesCheck(String inputString) {

        /**Return error message if string is empty*/
        if (inputString.length() == 0 || inputString == " ") {
            return "String cannot be empty";
        }

        String[] string = inputString.split(",");
        String outputString = null;
//        for (int i = 0; i < string.length - 1; i++) {
//            string[i].matches("-*");
//            break;
//        }
        for (int i = 0; i < string.length - 1; i++) {
            int difference = Integer.parseInt(string[i + 1]) - Integer.parseInt(string[i]);
            /**If difference between series is 1 or -1 return it as consecutive series*/
            if (difference == 1 || difference == -1) {
                outputString = "Given series is a Consecutive series";
            } else {
                outputString = "Given series is not a Consecutive series";
                break;
            }
        }
        return outputString;

    }
}
