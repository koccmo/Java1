package student_georgij_galin.lesson3.day_1;



public class RobotTest {
    public static void main(String[] args) {
        System.out.println("First robot parameter :");
       Robot firstRobot = new Robot();
        firstRobot.SayHello();
        firstRobot.sayYourName();

        System.out.println("Second robot parameter :");
        Robot secondRobot = new Robot();
        secondRobot.SayHello();
        secondRobot.sayYourName();
    }
}

