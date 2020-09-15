/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */
package student_igors_bartkevics.lesson_4.homeworks.day_2;
import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer numbers, please!");
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();


        if (firstNumber == secondNumber) {
            System.out.println("You entered same numbers:  The first number " + firstNumber +
                    " is equal to the second number " + secondNumber);
        }
        else if (firstNumber > secondNumber) {
            System.out.println("Smaller number is: " + secondNumber);
        }
        else {
            System.out.println("Smaller number is: " + firstNumber);
        }
    }

}
