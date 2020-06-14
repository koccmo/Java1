package student_igors_bartkevics.lesson_3.homeworks.day_1;


class Robot {

    public Robot() {

    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is ROBO");
    }
}

class RobotDemo {
    public static void main(String[] args){

        student_igors_bartkevics.lesson_3.homeworks.day_1.Task_1_to_6.Robot robot = new student_igors_bartkevics.lesson_3.homeworks.day_1.Task_1_to_6.Robot();
        student_igors_bartkevics.lesson_3.homeworks.day_1.Task_1_to_6.Robot robot2 = new student_igors_bartkevics.lesson_3.homeworks.day_1.Task_1_to_6.Robot();


        robot.sayHello();
        robot.sayYourName();


        robot2.sayHello();
        robot2.sayYourName();
    }
}
