package student_svjatoslavs_cernobrivecs.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Bigger number is:");

        if (firstNumber > secondNumber){
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
