package roman.lesson_8.homework.day_4;

public class Circle extends Shape{

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * (radius * 2);
    }
}
