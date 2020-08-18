package student_aleksandra_maksimovic.lesson_8.level_4_5;
/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Square.

 */
class Square extends Shape {

    private double squareSide;

    public Square (double squareSide) {
        super("square");
        this.squareSide = squareSide;
    }

    @Override
    double calculateArea() {
        return (squareSide * squareSide);
    }

    @Override
    double calculatePerimeter() {
        return  (squareSide * 4);
    }
}
