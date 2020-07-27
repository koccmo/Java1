package student_valerija_ionova.lesson_8.level_4_5.task_15_19;

/*Создайте наследника класс Shape - класс Rectangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().*/

class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String title, double width, double heigh){
        super (title);
        this.width = width;
        this.height = heigh;
    }

    @Override
    public double calculateArea(){
        return (width * height);
    }

    @Override
    public double calculatePerimeter(){
        return (width * 2 + height * 2);
    }
}
