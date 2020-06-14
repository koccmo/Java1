package student_igors_bartkevics.lesson_3.homeworks.day_3;

public class RobotDemo {
    public static void main(String[] args){
        String secondRobotName = "Robot-2";
        Robot robot = new Robot("Robot-1");
        Robot robot2 = new Robot(secondRobotName);


        robot.sayHello();
        robot.sayYourName();

        
        robot2.sayHello();
        robot2.sayYourName();
    }
}
