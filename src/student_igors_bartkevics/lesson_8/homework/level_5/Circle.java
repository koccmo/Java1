/*
ССоздание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Circle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Circle.

PS: подсказка - необходимые значения для
расчёта площади и периметра подавайте к
класс через конструктор.

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // implement here calculateArea()

    // implement here calculatePerimeter()

}
 */
package student_igors_bartkevics.lesson_8.homework.level_5;

class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return roundUpDouble(Math.PI * radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return roundUpDouble(2 * Math.PI * radius);
    }
}
