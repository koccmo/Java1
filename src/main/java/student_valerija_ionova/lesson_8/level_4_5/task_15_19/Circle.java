package student_valerija_ionova.lesson_8.level_4_5.task_15_19;

/*Task 16 Создание иерархии класса Shape (геометрическая фигура).
Создайте наследника класс Shape - класс Circle.
Реализуйте в нём абстрактные методы из класса
*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle extends Shape{

    private double radius;

    public Circle (String title, double radius){
        super (title);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return (3.14 * radius * radius);
    }

    @Override
    public double calculatePerimeter(){
        return (2 * 3.14 * radius);
    }
}
