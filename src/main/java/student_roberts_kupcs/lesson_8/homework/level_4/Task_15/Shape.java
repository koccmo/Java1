package student_roberts_kupcs.lesson_8.homework.level_4.Task_15;

//Создание иерархии класса Shape (геометрическая фигура).
//
//Дан класс Shape:
//
//abstract class Shape {
//
//    private String title;
//
//    Shape(String title) {
//        this.title = title;
//    }
//
//    abstract double calculateArea();
//
//}
//
//Объявите в классе Shape абстрактный метод
//для подсчёта периметра.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
