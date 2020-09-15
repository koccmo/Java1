package student_aleksandra_maksimovic.my_exercises.robot;
/*
Создайте отдельный класс RobotDemo для демонстрации
работы с классом Robot.

Внутри класса RobotDemo создайте метод

    public static void main(String[] args) {
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
    }

            В методе main(...) класса RobotDemo вызовите
        метод sayHello() у созданного ранее виртуального обьекта.
        Запустите вашу программу и убедитесь, что созданный вами
        виртуальный обьект робот напечатал на консоли слово "Hello!".

        Научите вашего робота "говорить" как его зовут.

        Создайте в классе Robot метод со следующей сигнатурой:

            public void sayYourName() {
                // тут напишите команду распечатки на консоли строки "My name is ROBO"
            }

        В методе main(...) класса RobotDemo вызовите
        метод sayYourName() у созданного ранее виртуального обьекта.
        Запустите вашу программу и убедитесь, что созданный вами
        виртуальный обьект робот напечатал на консоли "My name is ROBO".

 */
public class RobotDemo {
    public static void main(String[] args) {

        Robot robot = new Robot("sasha");
        robot.sayHallo();
        robot.sayYourName();

        Robot robot1 = new Robot("natasha");
        robot1.sayYourName();

        Robot robot2 = new Robot("glasha");
        robot2.sayHallo();
        robot2.sayYourName();
    }
}
