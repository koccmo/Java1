package student_volodya_danilin.lesson_8.level_5;

import student_volodya_danilin.lesson_8.level_4.Task_15.Shape;

import java.text.DecimalFormat;

public class ShapeUtilTest {
    public static void main(String[] Args) {
        DecimalFormat df = new DecimalFormat("#.##");
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        System.out.println();

        System.out.println("Average shape area : " + df.format(shapeUtil.calculateArea(shapes)));
        System.out.println("Average shape perimeter : " + df.format(shapeUtil.calculatePerimeter(shapes)));

        System.out.println();

        System.out.println("Circle area : " + df.format(shapeUtil.calculateArea(shapes[0])));
        System.out.println("Square area : " + df.format(shapeUtil.calculateArea(shapes[1])));
        System.out.println("Rectangle area : " + df.format(shapeUtil.calculateArea(shapes[2])));
        System.out.println("Triangle area : " + df.format(shapeUtil.calculateArea(shapes[3])));

        System.out.println();

        System.out.println("Circle perimeter : " + df.format(shapeUtil.calculatePerimeter(shapes[0])));
        System.out.println("Square perimeter : " + df.format(shapeUtil.calculatePerimeter(shapes[1])));
        System.out.println("Rectangle perimeter : " + df.format(shapeUtil.calculatePerimeter(shapes[2])));
        System.out.println("Triangle perimeter : " + df.format(shapeUtil.calculatePerimeter(shapes[3])));

    }
}
