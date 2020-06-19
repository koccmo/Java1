package student_roberts_kupcs.lesson_3.homeworks.day_1;

public class RobotDemo {
    public static void main(String[] args) {

        // создайте экземпляр класса Robot вызвав конструктор класса Task_3
        Robot robot1 = new Robot();

        // вызовите
        //метод sayHello() у созданного ранее виртуального обьекта Task_4
        robot1.sayHello();

        // вызовите
        //метод sayYourName() Task_5
        robot1.sayYourName();

        // продемонстрируйте создание
        //нескольких виртуальныx обьектов робот и работу с ними Task_6
        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot();
        robot3.sayHello();
        robot3.sayYourName();


    }
}
