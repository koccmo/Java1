package student_dmitrijs_jasvins.lesson_8.day_4;

public class Circle extends Shape {

    private double radius;

    Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }
    @Override
    public double calculatePerimeter(){
        return Math.PI * 2 * radius;
    }
}
