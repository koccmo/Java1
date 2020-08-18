package student_anvars_intezars.home_tasks.lesson_8.level_4_5;

import java.util.Random;

class ShapeUtil {


    Circle createRandomCircle() {
        Random rand = new Random();
        double radius = rand.nextInt(3);
        return new Circle(radius);
    }

     Square createRandomSquare() {
        Random rand = new Random();
        double length = rand.nextInt(4);
        return new Square(length);
    }

    Rectangle createRandomRectangle () {
        Random rand = new Random();
        double length = rand.nextInt(5);
        double width = rand.nextInt(6);
        return new Rectangle(length,width);
    }

    Triangle createRandomTriangle () {
        Random rand = new Random();
        double basis = rand.nextInt(7);
        double height = rand.nextInt(5);
        double length1 = rand.nextInt(8);
        double length2 = rand.nextInt(3);
        double length3 = rand.nextInt(1);
        return new Triangle(basis,height,length1,length2,length3);
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

    double calculateArea(Shape[] shapes) {
        double sumOfAresOfShapes = 0;
        for (int i = 0; i < shapes.length; i++) {
            sumOfAresOfShapes = sumOfAresOfShapes + shapes[i].calculateArea();
        }
        return sumOfAresOfShapes;
    }

    double calculatePerimeter(Shape[] shapes) {
        double sumOfPerimetersOfShapes = 0;
        for (int i = 0; i < shapes.length; i++) {
            sumOfPerimetersOfShapes = sumOfPerimetersOfShapes + shapes[i].calculatePerimeter();
        }
        return sumOfPerimetersOfShapes;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}