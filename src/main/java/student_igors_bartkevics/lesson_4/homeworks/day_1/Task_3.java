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

        System.out.println("Enter number of day of week (1 - 7): ");
        int numberOfWeek = scanner.nextInt();
        String result = "";

        //Version 1 (using String[]):
        /*
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",

                                "Friday", "Saturday", "Sunday"};

        System.out.println("Enter number of day of week (1 - 7): ");
        int numberOfWeek = scanner.nextInt();
        String result = daysOfWeek[numberOfWeek - 1];
        */

        // Version 2 using IF
        /*
        if (numberOfWeek == 1) {
            result = "Monday";
        }
        else if (numberOfWeek == 2) {
            result = "Tuesday";
        }
        else if (numberOfWeek == 3) {
            result = "Wednesday";
        }
        else if (numberOfWeek == 4) {
            result = "Thursday";
        }
        else if (numberOfWeek == 5) {
            result = "Friday";
        }
        else if (numberOfWeek == 6) {
            result = "Saturday";
        }
        else if (numberOfWeek == 7) {
            result = "Sunday";
        }
        else {
            result = "Your entered wrong number";
        }
         */

        // Version 3 using switch case

        switch(numberOfWeek) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
        }
        System.out.println(result);
    }

}
