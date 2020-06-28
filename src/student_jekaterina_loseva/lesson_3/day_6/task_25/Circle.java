package student_jekaterina_loseva.lesson_3.day_6.task_25;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double circleArea =  Math.PI * radius * radius;
        System.out.println("Circle are is: " + circleArea);
    }

}
