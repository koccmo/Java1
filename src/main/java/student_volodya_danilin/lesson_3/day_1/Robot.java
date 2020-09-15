package student_volodya_danilin.lesson_3.day_1;

//Создайте класс робот (Robot).
//
//Научите вашего робота "говорить" привет.
//
//Создайте в классе Robot метод со следующей сигнатурой:
//
//    public void sayHello() {
//        // тут напишите команду распечатки на консоли строки "Hello!"
//    }
//В классе робот (Robot) создайте конструктор без параметров:
//
//    public Robot() {
//
//    }

public class Robot {

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    private String name;

    public Robot(String robotName) {
        this.name = robotName;
    }


    public Robot(){

    }
        public static void main(String[] args){




    }
}
