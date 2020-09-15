package student_aleksandra_maksimovic.lesson_3.homeworks.day_1day_3;


public class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();


        Robot robot2 = new Robot("Alex");
        robot2.sayHello();
        robot2.sayYourName();


        Robot robot3 = new Robot("Koljan");
        robot3.sayHello();
        robot3.sayYourName();


    }
    
}
