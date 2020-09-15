package student_alexey_tretyakov.lesson_3.day_2;

import java.util.Scanner;

public class Task_9 {
    public static void main (String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please, input your first name : ");
        String firstName = scanner.nextLine();
        System.out.print(" Please, input your last name : ");
        String lastName = scanner.nextLine();
        System.out.println();
        System.out.println("Hello " + firstName + " " + lastName + " !");


    }
}
