package student_dmitrijs_jasvins.lesson_3.day_3;

class RobotTest {
    public static void main(String[] args) {

        System.out.println();

        Robot fisrtRobot = new Robot("John");
        fisrtRobot.sayHello();
        fisrtRobot.sayYourName();

        System.out.println();

        Robot secondRobot = new Robot("Dmitry");
        secondRobot.sayHello();
        secondRobot.sayYourName();
    }
}
