package student_volodya_danilin.lesson_8.level_5;

import student_volodya_danilin.lesson_8.level_4.Task_15.Shape;

public class ShapeUtilTest {
    public static void main(String[] Args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        System.out.println("Average shape area : " + shapeUtil.calculateArea(shapes));
        System.out.println("Average shape perimeter : " + shapeUtil.calculatePerimeter(shapes));
    }
}
