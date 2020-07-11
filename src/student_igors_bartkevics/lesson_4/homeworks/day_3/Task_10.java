/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
 */
package student_igors_bartkevics.lesson_4.homeworks.day_3;
import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers, please!");
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = scanner.nextInt();
        int biggerNumber = firstNumber;


        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
            System.out.println("All numbers are equal");
        }
        else if (((secondNumber >= thirdNumber) && (secondNumber > firstNumber)) ||
                ((secondNumber >= firstNumber) && (secondNumber > thirdNumber))) {
            biggerNumber = secondNumber;
            }

        else if (((thirdNumber >= firstNumber) && (thirdNumber > secondNumber))) {
                biggerNumber = thirdNumber;
        }
        System.out.println(biggerNumber);

    }

}
