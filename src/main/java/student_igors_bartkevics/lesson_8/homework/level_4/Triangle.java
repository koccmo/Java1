/*
Task_19:

Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Triangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Triangle.

 */
package student_igors_bartkevics.lesson_8.homework.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    Triangle(String title, double firstSide, double secondSide, double thirdSide) {
        super(title);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    double calculateArea() {
        double halfOfPerimeter = calculatePerimeter() / 2;
        double area = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - firstSide) *
                (halfOfPerimeter - secondSide) * (halfOfPerimeter - thirdSide));
        return roundUpDouble(area);
    }

    @Override
    double calculatePerimeter() {
        return roundUpDouble(firstSide + secondSide + thirdSide);
    }
}
