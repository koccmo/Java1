package student_valerija_ionova.lesson_3.hometasks.day_1.task_1_6;

/* Task_3 Создайте отдельный класс RobotDemo для демонстрации
работы с классом Robot.

        Task5
        В методе main(...) класса RobotDemo вызовите метод sayYourName() у созданного ранее виртуального обьекта.
        Запустите вашу программу и убедитесь, что созданный вами виртуальный обьект робот напечатал на консоли
        "My name is ROBO".
        Task_6
    }*/

class RobotDemo {
    public static void main(String[] args){

        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,

        Robot robot1 = new Robot();

        /*Task4
        В методе main(...) класса RobotDemo вызовите
        метод sayHello() у созданного ранее виртуального обьекта.*/

        robot1.sayHello();

        //Task5
        //В методе main(...) класса RobotDemo вызовите метод sayYourName()

        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot();
        robot3.sayHello();
        robot3.sayYourName();
    }
}
