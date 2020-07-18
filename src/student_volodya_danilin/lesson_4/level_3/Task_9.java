package student_volodya_danilin.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] Args){

        int readNumber1, readNumber2, readNumber3;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter number1: ");
        readNumber1 = sc1.nextInt();
        System.out.print("Enter number1: ");
        readNumber2 = sc1.nextInt();
        System.out.print("Enter number1: ");
        readNumber3 = sc1.nextInt();

        if ((readNumber1 < readNumber2) && (readNumber2 < readNumber3)){
            System.out.print("Increasing!");
        }
        else if ((readNumber1 > readNumber2) && (readNumber2 > readNumber3)){
            System.out.print("Decreasing!");
        }
        else {
            System.out.print("Neither increasing or decreasing order!");
        }
    }
}
