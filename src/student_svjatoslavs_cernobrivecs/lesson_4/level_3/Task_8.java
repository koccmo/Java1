package student_svjatoslavs_cernobrivecs.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter a third number:");
        int thirdNumber = scanner.nextInt();

        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)){
            System.out.println("All numbers are equal");
        } else if ((firstNumber != secondNumber) && (firstNumber != thirdNumber) && (secondNumber != thirdNumber)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
