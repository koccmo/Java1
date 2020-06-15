/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */

package student_igors_bartkevics.lesson_3.homeworks.day_6;

public class CircleDemo {
    public static void main(String[] args){

        Circle circle = new Circle(4.283);

        System.out.println("Circle area is equal: " + circle.calculateArea());

    }
}
