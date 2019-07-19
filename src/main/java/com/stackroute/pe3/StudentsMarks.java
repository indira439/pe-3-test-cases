package com.stackroute.pe3;

public class StudentsMarks {

    public String gradeChecker(int numOfStudents, int[] stuGrades) {
        String string = null;
        int length = numOfStudents;
        int[] grades;
        grades = new int[length];
        grades = stuGrades;

            if (numOfStudents > 0) {
                for (int i = 0; i < grades.length - 1; i++) {
                    if (grades[i] >= 0 && grades[i] <= 100) {
                        string = "Grades are between 0 and 100";
                    } else {
                        string = "Grade should not be less than 0 and greater than 100";
                    }
                }
            } else {
                string = "Number of students should be greater than 0";
            }
        return string;
    }

}
