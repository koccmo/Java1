package student_dmitrijs_jasvins.lesson_8.day_4;

import java.util.Random;

public class ShapeUtil {

    public Circle createRandomCircle() {
        Random random = new Random();
        double radius = random.nextInt(20) + 1;
        return new Circle(radius, "Circle");
    }

    public Square createRandomSquare() {
        Random random = new Random();
        double sideLength = random.nextInt(20) + 1;
        return new Square(sideLength, "Square");
    }

    public Rectangle createRandomRectangle() {
        Random random = new Random();
        double length = random.nextInt(20) + 1;
        double weight = random.nextInt(20) + 1;
        return new Rectangle("Rectangle", length, weight);
    }

    public Triangle createRandomTriangle() {
        Random random = new Random();
        double base = random.nextInt(20) + 1;
        double height = random.nextInt(20) + 1;
        double hypotenuse = random.nextInt(20) + 1;
        return new Triangle("Triangle", base, height, hypotenuse);
    }

    public Shape createRandomShape() {
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

    public double calculateArea(Shape[] shapes) {
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum += shape.calculateArea();
        }
        return areaSum;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            perimeterSum += shape.calculatePerimeter();
        }
        return perimeterSum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}