/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */

package student_igors_bartkevics.lesson_4.homeworks.day_1;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("You entered  negative number");
        }
        else if (number > 0) {
            System.out.println("You entered positive number");
        }
        else {
            System.out.println("You entered '0'");
        }

    }

}
