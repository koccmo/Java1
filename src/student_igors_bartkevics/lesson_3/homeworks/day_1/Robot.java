package student_igors_bartkevics.lesson_3.homeworks.day_1;

import java.util.Scanner;

public class Robot {

    public Robot() {

    }

    String robotName;

    public void sayHello() {
        System.out.println("Hello I am robot");
    }

    public void setRobotName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set name for robot ");
        robotName = scanner.nextLine();
    }

    public void sayYourName() {
            System.out.println("My name is " + robotName);
    }
}
