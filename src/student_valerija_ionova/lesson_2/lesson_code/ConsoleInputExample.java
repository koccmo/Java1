package student_valerija_ionova.lesson_2.lesson_code;

import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args){

        /* System.in - vhodnoj potok
        System.out- vihodnoj potok
        System.error - potok oshibok

        Scanner - eto klass
         */

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        System.out.println("User number = "+userNumber);
    }
}
