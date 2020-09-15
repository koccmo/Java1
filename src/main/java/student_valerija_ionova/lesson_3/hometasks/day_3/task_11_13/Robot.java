package student_valerija_ionova.lesson_3.hometasks.day_3.task_11_13;

class Robot {

    /*Task11
    Добавьте в класс Robot свойство name:*/

    private String name;

    /*Task12
    class Robot {

        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.*/

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
