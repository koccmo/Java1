package student_volodya_danilin.lesson_3.day_6;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String [] Args){

        Scanner sc1 = new Scanner(System.in);

        System.out.println("What is the radius of your circle?: ");
        Circle myCircle1 = new Circle(sc1.nextDouble());
        myCircle1.calculateArea();
        myCircle1.showInfo();

    }
}
