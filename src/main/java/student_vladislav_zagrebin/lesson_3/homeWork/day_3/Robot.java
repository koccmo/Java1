package student_vladislav_zagrebin.lesson_3.homeWork.day_3;

public class Robot {

    public String name;
    public Robot(String robotName) {
        this.name = robotName;
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
