package student_vladimir_kobenko.lesson_3.homeworks.day_1;

public class Robot {

    private final String robotName;
    private final String modelNumber;

    public Robot(String robotName, String modelNumber) {
    this.robotName = robotName;
    this.modelNumber = modelNumber;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayYourName(){
        System.out.println("My name is " + robotName);
    }
    public void sayYourModel(){
        System.out.println("My model number is" + modelNumber);
    }
}