/*
Task_20:
Создайте класс ShapeUtil.
В класе ShapeUtil реализуйте метод:

    Circle createRandomCircle();

Этот метод создаёт круг со случайным радиусом.
==============================================
Task_21:
В класе ShapeUtil реализуйте метод:

    Circle createRandomSquare();

Этот метод создаёт случайный квадрат.
=====================================
Task_22:
В класе ShapeUtil реализуйте метод:

    Circle createRandomRectangle();

Этот метод создаёт случайный прямоугольник.
===========================================
Task_23:
В класе ShapeUtil реализуйте метод:

    Circle createRandomTriangle();

Этот метод создаёт случайный треугольник.
============================================
Task_24:
В класе ShapeUtil реализуйте метод:

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

Этот метод создаёт случайную геометрическую фигуру.
===================================================
Task_25:
В класе ShapeUtil реализуйте метод:

    double calculateArea(Shape[] shapes);

Этот метод расчитывает объщую площадь
геометрических фигур из массива.
====================================================
Task_26:
В класе ShapeUtil реализуйте метод:

    double calculatePerimeter(Shape[] shapes);

Этот метод расчитывает общий периметр
геометрических фигур из массива.
====================================================
Task_27:
В классе ShapeUtil создайте методы:

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

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

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtil {

    public Circle createRandomCircle() {
        return new Circle("Circle", generateRandomDouble());
    }

    public Square createRandomSquare() {
        return new Square("Square", generateRandomDouble());
    }

    public Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", generateRandomDouble(), generateRandomDouble());
    }

    public Triangle createRandomTriangle() {
        double firstSide = 0;
        double secondSide = 0;
        double thirdSide = 0;

        boolean randomSideLengthsNotGenerated = true;
        while (randomSideLengthsNotGenerated) {
            firstSide = generateRandomDouble();
            secondSide = generateRandomDouble();
            thirdSide = generateRandomDouble();
            boolean firstSideLengthRequirement = firstSide < (secondSide + thirdSide);
            boolean secondSideLengthRequirement = secondSide < (firstSide + thirdSide);
            boolean thirdSideLengthRequirement = thirdSide < (firstSide + secondSide);
            boolean theRuleOfTriangleExistence = firstSideLengthRequirement && secondSideLengthRequirement && thirdSideLengthRequirement;
            if (theRuleOfTriangleExistence) {
                randomSideLengthsNotGenerated = false;
            }
        }
        return new Triangle("Triangle", firstSide, secondSide, thirdSide);
    }

    public Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    public double calculateArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculateArea();
        }
        return sum;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculatePerimeter();
        }
        return sum;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    public double generateRandomDouble() {
        Random random = new Random();
        return (int)(random.nextDouble() * 10000.0) / 100.0;
    }

}
