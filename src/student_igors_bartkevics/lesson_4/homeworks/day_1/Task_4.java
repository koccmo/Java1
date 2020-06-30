/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */

package student_igors_bartkevics.lesson_4.homeworks.day_1;
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("You entered even number");
        }
        else {
            System.out.println("You entered odd number");
        }

    }

}
