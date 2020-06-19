package student_georgij_galin.lesson3.day_3;


public class RobotTest {

    public static void main(String[] args) {

        System.out.println();
        Robot firstRobot = new Robot("Alex");

        firstRobot.sayHello();
        firstRobot.sayYourName();

        System.out.println();

       Robot secondRobot = new Robot("Georgij");
        secondRobot.sayHello();
        secondRobot.sayYourName();
    }


}