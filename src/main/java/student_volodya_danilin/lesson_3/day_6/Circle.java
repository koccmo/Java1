package student_volodya_danilin.lesson_3.day_6;

import java.lang.Math;
public class Circle {

    private double radius;
    private double area;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        area = radius * radius * Math.PI;
    }

    public void showInfo(){
        System.out.println("Circle's radius is: " + radius);
        System.out.println("Circle's area is: " + area);
    }
}
