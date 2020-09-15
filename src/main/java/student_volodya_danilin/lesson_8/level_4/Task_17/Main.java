package student_volodya_danilin.lesson_8.level_4.Task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Main {
    public static void main(String[] Args) {

        Square square1 = new Square(5);
        System.out.println("Area is : " + square1.calculateArea());
        System.out.println("Perimeter is : " + square1.calculatePerimeter());

        Square square2 = new Square(7);
        System.out.println("Area is : " + square2.calculateArea());
        System.out.println("Perimeter is : " + square2.calculatePerimeter());
    }
}
