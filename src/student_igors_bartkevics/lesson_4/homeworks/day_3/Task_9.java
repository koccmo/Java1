/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */
package student_igors_bartkevics.lesson_4.homeworks.day_3;
import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers, please!");
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = scanner.nextInt();


        if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
            System.out.println("increasing");
        }
        else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)){
            System.out.println("decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
