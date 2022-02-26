package roman.lesson_8.homework.day_5;

public class Triangle extends Shape {

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    Triangle(String title, double threeSideOfTriangle) {
        super(title);
        this.sideOne = threeSideOfTriangle;
        this.sideTwo = sideOne;
        this.sideThree = sideTwo;
    }

    @Override
    double calculatePerimeter() {
        return (int)((sideOne + sideTwo + sideThree) * 100) / 100.0;
    }

    @Override
    double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - sideOne) *
                (halfPerimeter - sideTwo) * (halfPerimeter - sideThree));
        return (int)(area * 100)/100.0;
    }
}
