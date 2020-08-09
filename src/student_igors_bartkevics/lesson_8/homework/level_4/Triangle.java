/*
Task_19:

Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Triangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Triangle.

 */
package student_igors_bartkevics.lesson_8.homework.level_4;

class Triangle extends Shape{
    private double firstSide;
    private double secondSide;
    private double base;
    private double height;
    Triangle(String title, double firstSide, double secondSide, double base, double height) {
        super(title);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculatePerimeter() {
        return firstSide + secondSide + base;
    }
}

