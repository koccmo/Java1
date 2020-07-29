package student_valerija_ionova.lesson_8.level_4_5.task_15_19;

/*Task 20 Создайте класс ShapeUtil. В класе ShapeUtil реализуйте метод: Circle createRandomCircle();

Task 21     Circle createRandomSquare(); Этот метод создаёт случайный квадрат.

Task 22      Circle createRandomRectangle();

TAsk 23 Circle createRandomTriangle();

TAsk 25 double calculateArea(Shape[] shapes); Этот метод расчитывает объщую площадь геометрических фигур из массива.

TAsk 26 double calculatePerimeter(Shape[] shapes);
*/

import java.util.Random;

class ShapeUtil {

    public Circle createRandomCircle(){
        Random number = new Random();
        double radius = number.nextInt(10)+1;
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare(){
        Random number = new Random();
        double side = number.nextInt(10)+1;
        return (new Square("Square", side));
    }

    public Rectangle createRandomRectangle(){
        Random number = new Random();
        double side1 = number.nextInt(10)+1;
        double side2 = number.nextInt(10)+1;
        return (new Rectangle("Rectangle", side1, side2));
    }

    public Triangle createRandomTriangle(){
        Random number = new Random();
        double side1 = number.nextInt(10)+1;
        double side2 = number.nextInt(10)+1;
        double side3 = number.nextInt(10)+1;

        return (new Triangle("Triangle", side1, side2, side3));
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

    public double calculateArea(Shape[] shapes){
        double sumArea = 0;

        for (Shape shape : shapes){
            sumArea += shape.calculateArea();
        }

        return sumArea;
    }

    public double calculatePerimeter(Shape[] shapes){
        double sumPerimeter = 0;

        for (Shape shape : shapes){
            sumPerimeter += shape.calculatePerimeter();
        }

        return sumPerimeter;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
