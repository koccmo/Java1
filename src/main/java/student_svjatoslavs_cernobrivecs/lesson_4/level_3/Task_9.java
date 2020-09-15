package student_svjatoslavs_cernobrivecs.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter a third number:");
        int thirdNumber = scanner.nextInt();

        if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)){
            System.out.println("increasing");
        } else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)){
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
