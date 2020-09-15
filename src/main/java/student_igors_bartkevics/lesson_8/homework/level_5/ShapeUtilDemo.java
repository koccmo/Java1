/*
Создайте ShapeUtilDemo класс и продемонстрируйте
расчёт площади и переиметра
любой геометрической фигуры.

Пример для круга:

ShapeUtil shapeUtil = new ShapeUtil();
Shape circle = shapeUtil.createRandomCircle();
double circleArea = shapeUtil.calculateArea(circle);
double circlePerimeter = shapeUtil.calculatePerimeter(circle);
 */
package student_igors_bartkevics.lesson_8.homework.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle area = " + circleArea);
        System.out.println("Circle perimeter = " + circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square area = " + squareArea);
        System.out.println("Square perimeter = " + squarePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle area = " + rectangleArea);
        System.out.println("Rectangle perimeter = " + rectanglePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Triangle area = " + triangleArea);
        System.out.println("Triangle perimeter = " + trianglePerimeter);

        Shape shape = shapeUtil.createRandomShape();
        double shapeArea = shapeUtil.calculateArea(shape);
        double shapePerimeter = shapeUtil.calculatePerimeter(shape);
        System.out.println("Generated shape is " + shape.getTitle());
        System.out.println(shape.getTitle() + " area = " + shapeArea);
        System.out.println(shape.getTitle() + " perimeter = " + shapePerimeter);
    }
}
