package student_aleksandra_maksimovic.lesson_8.level_4_5;

import teacher.codereview.CodeReview;

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Rectangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Rectangle.
 */
@CodeReview(approved = true)
 class Rectangle extends Shape {
     private double width;
     private double height;

     public Rectangle (double width, double height) {
         super("Rectangle");
         this.width = width;
         this.height = height;
     }

    @Override
    double calculateArea() {
        return (width * height);
    }

    @Override
    double calculatePerimeter() {
        return (2 *(width + height));
    }
}
