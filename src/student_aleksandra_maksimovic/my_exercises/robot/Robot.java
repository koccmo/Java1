package student_aleksandra_maksimovic.my_exercises.robot;

/*
Создайте класс робот (Robot).

Научите вашего робота "говорить" привет.

  -- Создайте в классе Robot метод со следующей сигнатурой:

    public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
    }

   --- В классе робот (Robot) создайте конструктор без параметров:

    public Robot() {

    }

 */

class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHallo() {
        System.out.println("hello");
    }

    public void sayYourName() {
        System.out.println("my name is " + name);
    }

}
