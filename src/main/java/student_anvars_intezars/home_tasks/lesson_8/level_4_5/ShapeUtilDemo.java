package student_anvars_intezars.home_tasks.lesson_8.level_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Area of circle = " + circleArea);
        System.out.println("Perimeter of circle = " + circlePerimeter);
        System.out.println();

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Area of rectangle = " + rectangleArea);
        System.out.println("Perimeter of rectangle = " + rectanglePerimeter);
    }
}