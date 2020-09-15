package student_volodya_danilin.lesson_8.level_4.Task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Main {
    public static void main(String[] Args) {

        Circle circle1 = new Circle(5);
        System.out.println(circle1.getTitle() + " " + circle1.getRadius());
        System.out.println("Area is : " + circle1.calculateArea());
        System.out.println("Perimeter is : " + circle1.calculatePerimeter());

        Circle circle2 = new Circle(6);
        System.out.println(circle2.getTitle() + " " + circle2.getRadius());
        System.out.println("Area is : " + circle2.calculateArea());
        System.out.println("Perimeter is : " + circle2.calculatePerimeter());
    }
}
