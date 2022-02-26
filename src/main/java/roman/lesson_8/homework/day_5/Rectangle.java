package roman.lesson_8.homework.day_5;

public class Rectangle extends Shape {

    private double longSide;
    private double shortSide;

    Rectangle(String title, double longSide, double shortSide) {
        super(title);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    double calculatePerimeter() {
        return roundUpDouble(2 * (longSide + shortSide));
    }

    @Override
    double calculateArea() { return roundUpDouble(longSide * shortSide); }

}
