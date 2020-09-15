package student_jekaterina_loseva.lesson_2.day_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter radius of circle:");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is:" + perimeter);
        System.out.println("Area is:" + area);

    }

}
