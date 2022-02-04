package roman.lesson_3.homework.day_6.task_26;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args){
        Circle cr = new Circle(3.4);
        double area = cr.calculateArea();
        System.out.println(area);
        double superArea = cr.newArea();
        System.out.println(superArea);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        cr.changeRadius(scan.nextDouble());
        System.out.println("New radius: " + area);




    }
}
