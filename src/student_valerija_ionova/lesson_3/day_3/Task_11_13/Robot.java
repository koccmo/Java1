package student_valerija_ionova.lesson_3.day_3.Task_11_13;

/*Task11
Добавьте в класс Robot свойство name:

    class Robot {

        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        private String name;

        ....
    }
        Task12
    class Robot {

        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.
        public Robot(String robotName) {
            this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

    }*/

public class Robot {

    private String name;
    public Robot (String name){
        this.name=name;
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

}
