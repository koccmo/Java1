package student_aleksandra_maksimovic.lesson_8.level_4_5;
/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Circle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Circle.

PS: подсказка - необходимые значения для
расчёта площади и периметра подавайте к
класс через конструктор.

 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (3.14 * radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return (2 * 3.14 * radius);
    }
}
