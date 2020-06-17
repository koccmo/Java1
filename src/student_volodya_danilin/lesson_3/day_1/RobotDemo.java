package student_volodya_danilin.lesson_3.day_1;

//Создайте отдельный класс RobotDemo для демонстрации
//работы с классом Robot.
//
//Внутри класса RobotDemo создайте метод
//
//    public static void main(String[] args) {
//        // создайте экземпляр класса Robot вызвав конструктор класса
//        // сохраните ссылку (указатель) на только, что созданный
//        // виртуальный обьект класса Robot в переменную,
//        // она нам понадобиться для дальнейшего использования.
//    }

public class RobotDemo {


    public static void main(String[] args){

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot();
        robot3.sayHello();
        robot3.sayYourName();


        }
    }

