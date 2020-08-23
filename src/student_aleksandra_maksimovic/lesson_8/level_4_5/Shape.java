package student_aleksandra_maksimovic.lesson_8.level_4_5;
/*
Создание иерархии класса Shape (геометрическая фигура).

Объявите в классе Shape абстрактный метод
для подсчёта периметра
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public String getTitle(){
        return title;
    }

}
