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
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                                "Friday", "Saturday", "Sunday"};

        System.out.println("Enter number of day of week: ");
        int numberOfWeek = scanner.nextInt();
        System.out.println((daysOfWeek[numberOfWeek - 1]));

    }

}
