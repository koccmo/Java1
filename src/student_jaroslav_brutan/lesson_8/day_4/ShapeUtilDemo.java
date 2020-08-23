package student_jaroslav_brutan.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
    }
}