package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User inputs:
 * 1) Total marks in courses
 * 2) Number of courses
 * Counts the average
 * and outputs:
 * 1) 'Excellent' if average is >= 9
 * 2) 'Very good' if average is >= 7
 * 3) 'Good' if average is >= 5
 * 4( 'Failed' if average is < 5
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalCourses = 0;
        int totalMarks = 0;
        int average = 0;
        System.out.println("Please insert total marks");
        totalMarks = in.nextInt();
        if (totalMarks <= 0){
            System.out.println("Total marks must not be negative or zero");
            System.exit(1);
        }
        System.out.println("Please insert total courses count");
        totalCourses = in.nextInt();
        if (totalCourses <= 0){
            System.out.println("Courses count must not be negative or zero");
            System.exit(1);
        }
        average = totalMarks/totalCourses;
        if (average > 10){
            System.out.println("Error!! The average must be less or equal than 10");
            System.exit(1);
        }
        if (average >= 9){
            System.out.println("Excellent");
        } else if (average >= 7){
            System.out.println("Very Good");
        } else if (average >=5){
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }
    }
}
