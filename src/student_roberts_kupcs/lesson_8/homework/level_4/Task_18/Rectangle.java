package student_roberts_kupcs.lesson_8.homework.level_4.Task_18;

//Создание иерархии класса Shape (геометрическая фигура).
//
//Создайте наследника класс Shape - класс Rectangle.
//Реализуйте в нём абстрактные методы из класса
//Shape: calculateArea() и calculatePerimeter().
//Напишите тесты для класса Rectangle.

class Rectangle extends Shape {

    private int side1;
    private int side2;

    public Rectangle(String title) {
        super(title);
    }

    @Override
    double calculateArea() {
        //s=a*b;
        return 0;
    }

    @Override
    double calculatePerimeter() {
        //p=2a+2b;
        return 0;
    }
}
