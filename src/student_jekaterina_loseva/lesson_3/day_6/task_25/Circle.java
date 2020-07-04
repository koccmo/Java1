package student_jekaterina_loseva.lesson_3.day_6.task_25;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // по заданию этот метод должен возвращать площадь а не выводить ее на консоль
    public void calculateArea() {
        double circleArea =  Math.PI * radius * radius;
        System.out.println("Circle are is: " + circleArea);
    }

}
