package student_roberts_kupcs.lesson_8.homework.level_5.Task_20_28;

//Создайте класс ShapeUtil.
//В класе ShapeUtil реализуйте метод:
//
//    Circle createRandomCircle();
//
//Этот метод создаёт круг со случайным радиусом.

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtil {

    public Circle createRandomCircle() {

        Random rd = new Random();
        double radius = rd.nextInt(10);
        return new Circle("Circle", radius);

    }

    public Square createRandomSquare() {

        Random rd = new Random();
        double side = rd.nextInt(10);
        return new Square("Square", side);

    }

    //Task_22
    public Rectangle createRandomRectangle() {

        Random rd = new Random();
        int side1 = rd.nextInt(2);
        int side2 = rd.nextInt(3);
        return new Rectangle("Rectangle", side1, side2);
    }

    //Task_23
    public Triangle createRandomTriangle() {

        Random rd = new Random();
        double side1 = rd.nextInt(2);
        double side2 = rd.nextInt(3);
        double side3 = rd.nextInt(4);
        double height = rd.nextInt(5);
        return new Triangle("Triangle", side1, side2, side3);
    }

    //Task_24
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

    //Task_25
    double calculateArea(Shape[] shapes) {
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum = areaSum + shape.calculateArea();
        }
        return areaSum;
    }

    //Task_26
    double calculatePerimeter(Shape[] shapes) {
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            perimeterSum = perimeterSum + shape.calculatePerimeter();
        }
        return perimeterSum;
    }

    //27
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
