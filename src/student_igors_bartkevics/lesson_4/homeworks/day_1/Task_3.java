/*
Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соотметствующий
этому числу день недели.

Пример:
Ввод: 3
Вывод: Wednesday

Ввод: 5
Вывод: Friday
 */

package student_igors_bartkevics.lesson_4.homeworks.day_1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        Version 1 (using String[]):

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",

                                "Friday", "Saturday", "Sunday"};

        System.out.println("Enter number of day of week (1 - 7): ");
        int numberOfWeek = scanner.nextInt();
        System.out.println((daysOfWeek[numberOfWeek - 1]));
        */

        // Version 2 using IF
        System.out.println("Enter number of day of week (1 - 7): ");
        int numberOfWeek = scanner.nextInt();

        if (numberOfWeek == 1) {
            System.out.println("Monday");
        }
        else if (numberOfWeek == 2) {
            System.out.println("Tuesday");
        }
        else if (numberOfWeek == 3) {
            System.out.println("Wednesday");
        }
        else if (numberOfWeek == 4) {
            System.out.println("Thursday");
        }
        else if (numberOfWeek == 5) {
            System.out.println("Friday");
        }
        else if (numberOfWeek == 6) {
            System.out.println("Saturday");
        }
        else if (numberOfWeek == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Your entered wrong number");
        }
    }

}
