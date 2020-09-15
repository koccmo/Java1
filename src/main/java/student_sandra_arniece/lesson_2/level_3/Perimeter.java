package student_sandra_arniece.lesson_2.level_3; //Task 10

import java.util.Scanner;

class Perimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the radius of the circle: ");

        double radius = sc.nextDouble();
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }

}
