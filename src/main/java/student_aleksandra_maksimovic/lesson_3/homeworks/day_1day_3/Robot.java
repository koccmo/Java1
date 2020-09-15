package student_aleksandra_maksimovic.lesson_3.homeworks.day_1day_3;


public class Robot {

    // свойства
    // - имя
    private String name;


    // constructors

    public Robot () {

        this.name = "ROBO";

    }

    public Robot (String newName) {

        this.name = newName;

    }

    // поведение
    // - sayHello

    public void sayHello() {

        System.out.println("Hello");

    }

    // - sayYourName
    public void sayYourName() {

        System.out.println(" My name is " + this.name );

    }

}
