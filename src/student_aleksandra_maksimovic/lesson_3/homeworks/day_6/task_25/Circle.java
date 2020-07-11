package student_aleksandra_maksimovic.lesson_3.homeworks.day_6.task_25;
/*
    Разработать класс - круг, у которого должны быть следующие характеристики:
    Свойства: радиус (double radius),
    Методы: расчет площади (double calculateArea()).

    Класс с объявлением фигуры круг должен называться "Circle".
    Класс с демонстрацией работы должен называться "CircleDemo".
 */

public class Circle {

    private static final double PI = 3.14;


    private double radius;


    public Circle(double setRadius){
        this.radius = setRadius;
    }

    // по задаче этот метод должен не печатать площать на консоль,
	// а возвращать его в качестве результата
    public void calculateArea(){

        double area = PI * this.radius * this.radius;
        System.out.println(area);
    }


}
