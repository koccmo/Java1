package student_volodya_danilin.lesson_8.level_5;

import student_volodya_danilin.lesson_8.level_4.Task_15.Shape;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ShapeUtilDemo {
    public static void main(String[] Args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        System.out.println("Circle area : " + shapeUtil.calculateArea(circle));
        System.out.println("Circle perimeter : " + shapeUtil.calculatePerimeter(circle));

        System.out.println();

        Shape square = shapeUtil.createRandomSquare();
        System.out.println("Square area : " + shapeUtil.calculateArea(square));
        System.out.println("Square perimeter : " + shapeUtil.calculatePerimeter(square));

        System.out.println();

        Shape rectangle = shapeUtil.createRandomRectangle();
        System.out.println("Rectangle area : " + shapeUtil.calculateArea(rectangle));
        System.out.println("Rectangle perimeter : " + shapeUtil.calculatePerimeter(rectangle));

        System.out.println();

        Shape triangle = shapeUtil.createRandomTriangle();
        System.out.println("Triangle area : " + shapeUtil.calculateArea(triangle));
        System.out.println("Triangle perimeter : " + shapeUtil.calculatePerimeter(triangle));
    }
}
