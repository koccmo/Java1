package student_volodya_danilin.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] Args){

        int readNumber1, readNumber2;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter number1: ");
        readNumber1 = sc1.nextInt();

        System.out.print("Enter number2: ");
        readNumber2 = sc1.nextInt();

        if (readNumber1 == readNumber2){
            System.out.println("Numbers are equal!");
        }
        else {
            System.out.println("Numbers are different!");
        }
    }
}
