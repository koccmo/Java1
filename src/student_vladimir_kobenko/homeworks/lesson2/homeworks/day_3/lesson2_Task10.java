package student_vladimir_kobenko.homeworks.lesson2.homeworks.day_3;

import java.util.Scanner;

public class lesson2_Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус окружности:");

        double userNumberOne = scanner.nextDouble();

        System.out.println("Длина окружности = " + (userNumberOne * 2 * 3.14));

        System.out.println("Площадь круга = " + (userNumberOne * userNumberOne * 3.14));
    }
}
