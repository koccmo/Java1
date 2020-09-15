package student_alexey_tretyakov.lesson_3.day_6.Task_25;

import static java.lang.Math.PI;

class Circle {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double calculateArea(){
        return  2 * PI * radius;
    }

}

class CircleDemo {
    public static void main(String[] arg) {

        Circle newCircle = new Circle(5.2);
        System.out.println ("\nWe calculate area of circle with radius " + newCircle.getRadius() +
               " = " + newCircle.calculateArea() );
    }
}