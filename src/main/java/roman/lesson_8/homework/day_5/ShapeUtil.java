package roman.lesson_8.homework.day_5;



import java.util.Random;

public class ShapeUtil {
    private Shape[] shapes;

    public static void main(String[] args) {
        ShapeUtil test = new ShapeUtil();
        System.out.println(test.generateRandomDouble());
    }

    public Circle createRandomCircle() {return new Circle("Circle", generateRandomDouble());}

    public Square createRandomSquare() {return new Square("Square", generateRandomDouble());}

    public Rectangle createRandomRectangle() {return new Rectangle("Rectangle",
            generateRandomDouble(), generateRandomDouble());}

    public Triangle createRandomTriangle() {return new Triangle("Triangle", generateRandomDouble());}

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
        double sumOfAreas = 0;
        for (Shape shape : shapes) {
            sumOfAreas += shape.calculateArea();
        }
        return sumOfAreas;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double sumOfPerimeter = 0;
        for (Shape shape : shapes) {
            sumOfPerimeter += shape.calculatePerimeter();
        }
        return sumOfPerimeter;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    public double generateRandomDouble() {
        Random random = new Random();
        return (int)(random.nextDouble() * 100) / 100.0;
    }

}


