package student_eduards_jasvins.lesson_8.day_4_5;

import java.util.Random;

class ShapeUtil {

    public Circle createRandomCircle() {
        Random random = new Random();
        double radius = random.nextInt(15) + 1;
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        Random random = new Random();
        double a = random.nextInt(10) + 1;
        return new Square("Square", a);
    }

    public Rectangle createRandomRectangle() {
        Random random = new Random();
        double a = random.nextInt(10) + 1;
        double b = random.nextInt(10) + 1;
        return new Rectangle("Rectangle", a, b);
    }

    public Triangle createRandomTriangle() {
        Random random = new Random();
        double a = random.nextInt(15) + 1;
        double b = random.nextInt(15) + 1;
        double c = random.nextInt(15) + 1;
        double h = random.nextInt(15) + 1;
        return new Triangle("Triangle", a, b, c, h);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    public  double calculateArea(Shape[] shapes) {
        double calculateArea = 0;
        for (Shape shape : shapes) {
            calculateArea += shape.calculateArea();
        }
        return calculateArea;
    }

    public  double calculatePerimeter(Shape[] shapes) {
        double calculatePerimeter = 0;
        for (Shape shape : shapes) {
            calculatePerimeter += shape.calculatePerimeter();
        }
        return calculatePerimeter;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
