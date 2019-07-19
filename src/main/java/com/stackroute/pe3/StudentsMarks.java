package com.stackroute.pe3;

/**
 * Create a class called StudentMarks, which prompts user for the number of students, reads
 * it from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user
 * for the grades of each of the students and saves them in an int array called stuGrades. Your
 * program shall check that the grade is between 0 and 100 else has to trow an error message.
 */

public class StudentsMarks {

    public String gradeChecker(int numOfStudents, int[] stuGrades) {
        String string = null;

        /**Check if number of students is greater than 0 or not else throw an error message*/
        if (numOfStudents > 0) {
            /** If length of stuGrades is greater than number of students throw an exception*/
            if (stuGrades.length > numOfStudents) {
                throw new IndexOutOfBoundsException();
            }
            /**Check the each grade and return according to grade*/
            for (int i = 0; i < stuGrades.length - 1; i++) {
                if (stuGrades[i] >= 0 && stuGrades[i] <= 100) {
                    string = "Grades are between 0 and 100";
                } else {
                    string = "Grade should not be less than 0 and greater than 100";
                }
            }
        } else {
            string = "Number of students should be greater than 0";
        }
        /**Return the string*/
        return string;
    }

}
