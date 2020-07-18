package student_volodya_danilin.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] Args){

        int readNum1, readNum2, readNum3;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter number1: ");
        readNum1 = sc1.nextInt();
        System.out.print("Enter number1: ");
        readNum2 = sc1.nextInt();
        System.out.print("Enter number1: ");
        readNum3 = sc1.nextInt();

        if ((readNum1 > readNum2) && (readNum1 > readNum3)){
            System.out.print(readNum1);
        }
        else if ((readNum2 > readNum1) && (readNum2 > readNum3)){
            System.out.print(readNum2);
        }
        else {
            System.out.print(readNum3);
        }
    }
}
