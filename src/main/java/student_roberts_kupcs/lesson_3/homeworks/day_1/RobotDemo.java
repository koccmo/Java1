package student_roberts_kupcs.lesson_3.homeworks.day_1;



class RobotDemo {
    public static void main(String[] args) {

        // создайте экземпляр класса Robot вызвав конструктор класса Task_3
        Robot robot = new Robot("");

        // вызовите
        //метод sayHello() у созданного ранее виртуального обьекта Task_4
        robot.sayHello();

        // вызовите
        //метод sayYourName() Task_5
        robot.sayYourName();

        // продемонстрируйте создание
        //нескольких виртуальныx обьектов робот и работу с ними Task_6
        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();


    }
}
