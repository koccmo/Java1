package student_volodya_danilin.lesson_4.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] Args){
        int readNumber;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter your number!");
        readNumber = sc1.nextInt();

        if (readNumber == 0) {
            System.out.println("Number equals zero!");
        }
        if (readNumber > 0) {
            System.out.println("Number is positive!");
        }
        if (readNumber < 0) {
            System.out.println("Number is negative!");
        }
    }
}
