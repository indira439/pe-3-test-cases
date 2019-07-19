package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsMarksTest {

    StudentsMarks studentsMarks;

    @Before
    public void setUp() {
        this.studentsMarks = new StudentsMarks();
    }

    @After
    public void tearDown() {
        studentsMarks = null;
    }

    @Test
    public void givenNumberOfStudentsAndGradesOfEachStudentShouldReturnGradeIsBetween0And100() {
        //act
        String actualResult = "Grades are between 0 and 100";
        //assert
        assertEquals(actualResult, studentsMarks.gradeChecker(4, new int[]{80, 50, 60, 70}));

    }

    @Test
    public void givenNumberOfStudentsAndGradesOfEachStudentShouldThrowErrorMessage() {
        //act
        String actualResult = "Grade should not be less than 0 and greater than 100";
        //assert
        assertEquals(actualResult, studentsMarks.gradeChecker(3, new int[]{-12, 101, 30}));
    }

    @Test
    public void givenInvalidNumberOfStudentsShouldThrowErrorMessage() {
        //act
        String actualResult = "Number of students should be greater than 0";
        //assert
        assertEquals(actualResult, studentsMarks.gradeChecker(-4, new int[]{80, 50, 60, 70}));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        //act
        String actualResult = "Grade is between 0 and 100";
        //assert
        assertEquals(actualResult, studentsMarks.gradeChecker(4, null));
    }

    @Test(expected = NumberFormatException.class)
    public void givenNullShouldThrowNumberFormatException() {
        //act
        String actualResult = "Grade is between 0 and 100";
        //assert
        assertEquals(actualResult, studentsMarks.gradeChecker(Integer.parseInt(null), new int[]{12, 34}));
    }

//    @Test(expected = OutOfMemoryError.class)
//    public void givenInvalidArrayElementsShouldThrowOutOfBoundException() {
//        //act
//        String actualResult = "Grade is between 0 and 100";
//        //assert
//        assertEquals(actualResult,studentsMarks.gradeChecker(4,new int[] {80, 50, 60, 70, 80}));
//    }

    @Test
    public void givenNumberOfStudentsAndGradesOfEachStudentShouldReturnGradeIsBetween0And100Failure() {
        //act
        String actualResult = "Grade should not be less than 0 and greater than 100";
        //assert
        assertNotEquals(actualResult, studentsMarks.gradeChecker(4, new int[]{90, 50, 60, 70}));

    }

    @Test
    public void givenNumberOfStudentsAndGradesOfEachStudentShouldThrowErrorMessageFailure() {
        //act
        String actualResult = "Grades are between 0 and 100";
        //assert
        assertNotEquals(actualResult, studentsMarks.gradeChecker(3, new int[]{-12, 101, 30}));
    }

}