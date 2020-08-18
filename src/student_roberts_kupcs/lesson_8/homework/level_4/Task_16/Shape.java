package student_roberts_kupcs.lesson_8.homework.level_4.Task_16;

//Создайте наследника класс Shape - класс Circle.
//Реализуйте в нём абстрактные методы из класса
//Shape: calculateArea() и calculatePerimeter().
//Напишите тесты для класса Circle.
//
//PS: подсказка - необходимые значения для
//расчёта площади и периметра подавайте к
//класс через конструктор.
//
//class Circle extends Shape {
//
//    private double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    // implement here calculateArea()
//
//    // implement here calculatePerimeter()
//
//}

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
