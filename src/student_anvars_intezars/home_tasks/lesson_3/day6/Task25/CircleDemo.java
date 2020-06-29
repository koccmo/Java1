package student_anvars_intezars.home_tasks.lesson_3.day6.Task25;

import student_anvars_intezars.home_tasks.lesson_3.day6.Task25.Circle;

public class CircleDemo {

    public static void main(String[] args) {

        Circle firstCircle = new Circle();
        firstCircle.setRadius(7.5);

        System.out.print ("Area of a circle with ");
        System.out.print ("radius 7.5 = " + firstCircle.calculateArea());

    }
}
