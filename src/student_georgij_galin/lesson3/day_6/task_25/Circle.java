package student_georgij_galin.lesson3.day_6.task_25;

public class Circle {
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}