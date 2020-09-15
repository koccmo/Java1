package student_volodya_danilin.lesson_8.level_5;

import student_volodya_danilin.lesson_8.level_4.Task_15.Shape;
import student_volodya_danilin.lesson_8.level_4.Task_16.Circle;
import student_volodya_danilin.lesson_8.level_4.Task_17.Square;
import student_volodya_danilin.lesson_8.level_4.Task_18.Rectangle;
import student_volodya_danilin.lesson_8.level_4.Task_19.Triangle;
import teacher.codereview.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ShapeUtil {

    Random rnd = new Random();

    Circle createRandomCircle() {
        Circle result;
        result = new Circle(rnd.nextInt(10) + 3);
        return result;
    }

    Square createRandomSquare() {
        Square result;
        result = new Square(rnd.nextInt(10) + 3);
        return result;
    }

    Rectangle createRandomRectangle() {
        Rectangle result;
        int a, b;
        do {
            a = rnd.nextInt(10) + 3;
            b = rnd.nextInt(7) + 3;
        }
        while (a == b);

        result = new Rectangle(a, b);
        return result;
    }

    Triangle createRandomTriangle() {
        Triangle result;
        int a, b, c;
        do {
            a = rnd.nextInt(10) + 5;
            b = rnd.nextInt(11) + 5;
            c = rnd.nextInt(12) + 5;
        }
        while ((a + b < c) || (a + c < b) || (b + c < a));

        result = new Triangle(a, b, c);
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
