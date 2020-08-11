/*
Task_15:

Создание иерархии класса Shape (геометрическая фигура).

Дан класс Shape:

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

}

Объявите в классе Shape абстрактный метод
для подсчёта периметра.
 */
package student_igors_bartkevics.lesson_8.homework.level_4;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    public double roundUpDouble(double value) {
        return (int)(value * 100.0) / 100.0;
    }
}