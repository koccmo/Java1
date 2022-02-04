package roman.lesson_5.homework.day_2.task_11;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] customerNumbers = new int[3];

        System.out.println("Enter number:");
        customerNumbers[0] = scan.nextInt();
        System.out.println("Enter number:");
        customerNumbers[1] = scan.nextInt();
        System.out.println("Enter number:");
        customerNumbers[2] = scan.nextInt();

        System.out.println(customerNumbers[0]);
        System.out.println(customerNumbers[1]);
        System.out.println(customerNumbers[2]);

        for(int i = 0;i < 3;i++) {
            System.out.println("Enter [" + i + "] =");
            customerNumbers[i] = scan.nextInt();
        }

        for (int i = 0; i < 3;i++) {
            System.out.println("Your number [" + i + "]" + " = " + customerNumbers[i]);
        }
    }
}
