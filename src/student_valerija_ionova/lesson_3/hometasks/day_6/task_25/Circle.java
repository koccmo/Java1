package student_valerija_ionova.lesson_3.hometasks.day_6.task_25;

/*Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".*/

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return 3.14*this.radius*this.radius;
    }
}
