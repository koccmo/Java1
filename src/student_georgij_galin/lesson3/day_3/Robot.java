package student_georgij_galin.lesson3.day_3;

public class Robot {

    private final String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayYourName() {
        System.out.println("My name is :" + this.name);
    }
}