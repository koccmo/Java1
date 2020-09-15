package student_roberts_kupcs.lesson_2.homeworks.day_3;

import java.util.Scanner;



class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius : ");
        double radius = scanner.nextDouble();
        double pi = 3.1415926535897932384626;
        double area = pi * (radius * radius);
        System.out.println("Area is : " + area);
        double perimeter = pi * 2 * radius;
        System.out.println("Perimeter is : " + perimeter);

    }
}
