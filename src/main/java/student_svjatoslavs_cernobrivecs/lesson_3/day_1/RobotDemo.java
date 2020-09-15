package student_svjatoslavs_cernobrivecs.lesson_3.day_1;

public class RobotDemo {

    public static void main(String[] args){


        Robot robotHelloNumberOne = new Robot("Robocop");
        robotHelloNumberOne.sayHello();
        robotHelloNumberOne.sayYourName();


        Robot robotHelloNumberTwo = new Robot("Terminator");
        robotHelloNumberTwo.sayHello();
        robotHelloNumberTwo.sayYourName();
    }
}
