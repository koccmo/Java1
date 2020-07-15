package student_aleksandra_maksimovic.lesson_6.level_1.task_2;

/*
Дана программа:

class Task_3 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();
        if ((firstNumber >=1) && (firstNumber <= 7)) {
            switch (firstNumber) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }
        else {
            System.out.println("Please input a valid number between 1 and 7");
        }
    }

}

Создайте класс DayOfTheWeekDetector.
В классе DayOfTheWeekDetector создайте метод:
String detectDayName(int number).
Этот метод будет по введённому числу определять день недели.
Реализуйте этот метод (можно взять код приведённый выше).
Создайте класс DayOfTheWeekDetectorTest и напишите
автоматические тесты
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class DayOfTheWeekDetector {

    public String detectDayName (int number) {

        String result = " ";
        if ((number >= 1) && (number <= 7)) {
            switch (number) {
                case 1 -> result = "Monday";
                case 2 -> result = "Tuesday";
                case 3 -> result = "Wednesday";
                case 4 -> result = "Thursday";
                case 5 -> result = "Friday";
                case 6 -> result = "Saturday";
                case 7 -> result = "Sunday";
            }
        }
        else {

            result = "The number is out of range!!";
        }



        return result;
    }


}
