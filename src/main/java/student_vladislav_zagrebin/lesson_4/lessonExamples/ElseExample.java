package student_vladislav_zagrebin.lesson_4.lessonExamples;

import java.util.Scanner;

public class ElseExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int number1 = sc.nextInt();

        System.out.println("Please enter second number:");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println("Number 1 > Number 2");
        } else if (number2 > number1) {
                System.out.println("Number 1 < Number 2");
            } else {
                System.out.println("Number 1 = Number 2");
            }



        System.out.println("Good luck!");

        /*
        if (condition) {
            // commands condition = true
        } else {
            // commands condition = false
         */
        }

        // Tests

        // number1 and number2

        // Testcase 1: number1 = 1, number2 = 2;
        // result: number1 < number2;

        // Testcase 1: number1 = 10, number2 = 3;
        // result: number1 > number2;

        // Testcase 3: number1 = 10, number2 = 10;
        // result: number1 = number2;

}
