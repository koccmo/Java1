package student_valerija_ionova.lesson_3.hometasks.day_3.task_11_13;

/* В классе RobotDemo передайте в конструктор каждого робота его название:

Robot robot1 = new Robot("Rider"); // пусть этого робота зовут "Rider"
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot("John"); // а этого робота зовут "John"
robot2.sayHello();
robot2.sayYourName();
    }*/

class RobotDemo {
    public static void main(String[] args){

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot("No Name no problem");
        robot3.sayHello();
        robot3.sayYourName();
    }
}
