package student_dmitrijs_jasvins.lesson_8.day_4;

public class Square extends Shape {

    private double sideLength;

    public Square(double sideLength, String title) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * 4;
    }

    @Override
    public double calculatePerimeter() {
        return sideLength * sideLength;
    }
}
