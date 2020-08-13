package student_volodya_danilin.lesson_8.level_5;

import student_volodya_danilin.lesson_8.level_4.Task_15.Shape;
import student_volodya_danilin.lesson_8.level_4.Task_16.Circle;
import student_volodya_danilin.lesson_8.level_4.Task_17.Square;
import student_volodya_danilin.lesson_8.level_4.Task_18.Rectangle;
import student_volodya_danilin.lesson_8.level_4.Task_19.Triangle;

import java.util.Random;

public class ShapeUtil {

    Random rnd = new Random();

    Circle createRandomCircle() {
        Circle result;
        result = new Circle(rnd.nextInt(10) + 1);
        return result;
    }

    Square createRandomSquare() {
        Square result;
        result = new Square(rnd.nextInt(10) + 1);
        return result;
    }

    Rectangle createRandomRectangle() {
        Rectangle result;
        result = new Rectangle(rnd.nextInt(10) + 1, rnd.nextInt(10) + 1);
        return result;
    }

    Triangle createRandomTriangle() {
        Triangle result;
        result = new Triangle(rnd.nextInt(10) + 1,
                              rnd.nextInt(10) + 1, rnd.nextInt(10) + 1);
        return result;
    }

    Shape createRandomShape() {
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
        double result;
        double shapeAreaSum = 0;
        double shapeCounter = 0;
        for (Shape value : shapes) {
            shapeAreaSum = shapeAreaSum + calculateArea(value);
            shapeCounter++;
        }
        result = shapeAreaSum / shapeCounter;
        return result;
    }

    double calculatePerimeter(Shape[] shapes) {
        double result;
        double shapePerimeterSum = 0;
        double shapeCounter = 0;
        for (Shape value : shapes) {
            shapePerimeterSum = shapePerimeterSum + calculatePerimeter(value);
            shapeCounter++;
        }
        result = shapePerimeterSum / shapeCounter;
        return result;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
