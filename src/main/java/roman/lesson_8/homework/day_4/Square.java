package roman.lesson_8.homework.day_4;

public class Square extends Shape{

    private double sideOfSquare;

    Square(String title, double sideOfSquare) {
        super(title);
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    double calculateArea() {
        return Math.pow(sideOfSquare, 2);
    }

    @Override
    double calculatePerimeter() {
        return sideOfSquare * 4;
    }
}
