package roman.lesson_3.homework.day_1;

public class Robot {

    private String name;
    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!!!");
    }
    public void sayYourName(){
        System.out.println("My name is " + this.name);
    }
}
