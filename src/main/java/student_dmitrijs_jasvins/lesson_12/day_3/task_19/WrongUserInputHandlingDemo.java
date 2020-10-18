package student_dmitrijs_jasvins.lesson_12.day_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Please enter number: ");
                Scanner scr = new Scanner(System.in);
                int number = scr.nextInt();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("It's not a number! Try again!");
            }
        }
    }
}