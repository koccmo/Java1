package student_alexey_tretyakov.lesson_4.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please input integer number = ");
        int intNumber = scanner.nextInt();
        if (intNumber > 0) {
            System.out.println("Number " + intNumber + " is positive." );
        } else {
            if ( intNumber < 0) {
                System.out.println("Number " + intNumber + " is negative." );
            } else {
                System.out.println("Number " + intNumber + " is zero." );
            }
        }
    }
}
