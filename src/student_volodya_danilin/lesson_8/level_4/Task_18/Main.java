package student_volodya_danilin.lesson_8.level_4.Task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Main {
    public static void main(String[] Args) {

        Rectangle rectangle1 = new Rectangle(4, 5);
        System.out.println("Area is : " + rectangle1.calculateArea());
        System.out.println("Perimeter is : " + rectangle1.calculatePerimeter());

        Rectangle rectangle2 = new Rectangle(2, 3);
        System.out.println("Area is : " + rectangle2.calculateArea());
        System.out.println("Perimeter is : " + rectangle2.calculatePerimeter());
    }
}
