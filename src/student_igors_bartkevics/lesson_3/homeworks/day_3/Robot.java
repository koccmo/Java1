package student_igors_bartkevics.lesson_3.homeworks.day_3;

public class Robot {

    public Robot() {

    }

    // в этом свойстве наш виртуальный обьект робот будет
    // запоминать своё имя. Мы используем тип String потому
    // что имя это строка.
    private String name;

    // Это конструктор класса. У этого конструктора один параметр
    // с названием name и типом String. Тоесть при создании робота
    // в его конструктор будут передавать название робота.
    public Robot(String robotName) {
        this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
    }

    public void sayHello() {
        System.out.println("Hello!");
    }


    public void sayYourName() {
            System.out.println("My name is " + this.name);
    }
}
