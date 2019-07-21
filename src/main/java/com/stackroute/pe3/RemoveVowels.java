package com.stackroute.pe3;

/**
 * Write a program to set up an array of places, Loop round and remove the vowels. Display the
 * new words in console
 */

public class RemoveVowels {

    public String[] vowelsRemover(String[] inputString) {
        /**Return null if input length is zero */
        if (inputString.length == 0) {
            return null;
        }
        for (int i = 0; i < inputString.length; i++) {
            /**Return null if input string is empty or input is number string*/
            if (inputString[i].isEmpty() || inputString[i].matches("[0-9]*")) {
                return null;
            }
        }
            String[] string = new String[inputString.length];
            for (int i = 0; i < string.length; i++) {
                /**Loop through entire string length and Replace all vowels in each string element by empty value*/
                string[i] = inputString[i].replaceAll("[aeiou]", "");
            }
            /**Return the output string array*/
            return string;
        }
    }
