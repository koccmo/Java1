/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Square.

 */
package student_igors_bartkevics.lesson_8.homework.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private double side;
    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return roundUpDouble(side * side);
    }

    @Override
    double calculatePerimeter() {
        return roundUpDouble(4 * side);
    }
}
