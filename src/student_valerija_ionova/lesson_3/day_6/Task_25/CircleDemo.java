package student_valerija_ionova.lesson_3.day_6.Task_25;

/*Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".*/

public class CircleDemo {
    public static void main(String[] args){
        Circle circle = new Circle(5.6);
        double area = circle.calculateArea();
        System.out.println("Area of the circle is "+area);
    }

}
