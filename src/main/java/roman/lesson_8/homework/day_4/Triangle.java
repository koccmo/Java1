package roman.lesson_8.homework.day_4;

public class Triangle extends Shape{

    private double threeSideOfTriangle;

    Triangle(String title, double threeSideOfTriangle) {
        super(title);
        this.threeSideOfTriangle = threeSideOfTriangle;
    }

    @Override
    double calculatePerimeter() {
        return 3 * threeSideOfTriangle;
    }

    @Override
    double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        double area = Math.sqrt(halfPerimeter * Math.pow((halfPerimeter - threeSideOfTriangle), 3));
        return (int)(area * 100)/100.0;
    }
}
