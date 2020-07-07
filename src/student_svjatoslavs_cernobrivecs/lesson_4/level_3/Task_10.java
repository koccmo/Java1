package student_svjatoslavs_cernobrivecs.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter a third number");
        int thirdNumber = scanner.nextInt();

        if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)){
            System.out.println("First number is biggest");
        } else if ((firstNumber < secondNumber) && (secondNumber > thirdNumber)){
            System.out.println("Second number is biggest");
        } else {
            System.out.println("Third number is biggest");
        }
    }
}
