package student_valerija_ionova.lesson_8.level_4_5.task_15_19;

/*Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().*/

class Square extends Shape{

    private double lengthOfSide;

    public Square (String title, double lengthOfSide){
        super (title);
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double calculateArea(){
        return (lengthOfSide * lengthOfSide);
    }

    @Override
    public double calculatePerimeter(){
        return (lengthOfSide * 4);
    }
}
