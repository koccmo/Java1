package student_volodya_danilin.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] Args){

        int readNumber;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter your number: ");
        readNumber = sc1.nextInt();

        if ((readNumber % 2 == 0) && (readNumber != 0)) {
            System.out.println("The number is even!");
        }
        if (readNumber % 2 != 0) {
            System.out.println("The number is odd!");
        }
        if (readNumber == 0) {
            System.out.println("Number error!");
        }
    }
}
