package roman.lesson_8.homework.day_5;

public class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (int)((Math.PI * Math.pow(radius, 2)) * 100 ) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return (int)((Math.PI * (radius * 2)) * 100) / 100.0;
    }
}
