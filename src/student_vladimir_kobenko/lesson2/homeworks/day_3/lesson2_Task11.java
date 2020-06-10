package student_vladimir_kobenko.lesson2.homeworks.day_3;

import java.util.Scanner;

public class lesson2_Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1");

        int userNumberOne = scanner.nextInt();

        System.out.println("Введите число 2");

        int userNumberTwo = scanner.nextInt();

        System.out.println("Введите число 3");

        int userNumberThree = scanner.nextInt();

        System.out.println("Среднее арифметическое чисел = " + ((userNumberOne + userNumberTwo + userNumberThree) / 3));
    }
}
