package roman.lesson_3.homework.day_1;

public class RobotDemo {

    public static void main(String []args){

        Robot robot = new Robot( "Rider");
        robot.sayHello();
        robot.sayYourName();

        Robot robot1 = new Robot("John");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("Poco");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
