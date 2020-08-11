/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Rectangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Rectangle.
 */
package student_igors_bartkevics.lesson_8.homework.level_4;

class Rectangle extends Shape{
    private double width;
    private double length;
    Rectangle(String title, double width, double length) {
        super(title);
        this.width = width;
        this.length = length;
    }

    @Override
    double calculateArea() {
        return roundUpDouble(width * length);
    }

    @Override
    double calculatePerimeter() {
        return roundUpDouble(2 * (width + length));
    }
}
