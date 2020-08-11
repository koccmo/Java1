package student_dmitrijs_jasvins.lesson_8.day_4;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double hypotenuse;

    public Triangle(String title, double base, double height, double hypotenuse) {
        super(title);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return base + height + hypotenuse;
    }
}
