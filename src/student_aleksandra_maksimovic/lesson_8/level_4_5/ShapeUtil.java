package student_aleksandra_maksimovic.lesson_8.level_4_5;



import java.util.Random;

/*
Создайте класс ShapeUtil.
В класе ShapeUtil реализуйте метод:

   #20 - Circle createRandomCircle(); Этот метод создаёт круг со случайным радиусом.
   #21 - Circle createRandomSquare();Этот метод создаёт случайный квадрат.
   #22 - Circle createRandomRectangle();Этот метод создаёт случайный прямоугольник.
   #24 - Circle createRandomTriangle();Этот метод создаёт случайный треугольник.
   #25 - double calculateArea(Shape[] shapes);Этот метод расчитывает объщую площадь геометрических фигур из массива.
   #26 - double calculatePerimeter(Shape[] shapes);Этот метод расчитывает общий периметргеометрических фигур из массива.
   #27 -создайте методы:

    double calculateArea(Shape shape) {
        return shape.calculateArea();
  ` }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
    #28 -
    */
 class ShapeUtil {

     Random rnd = new Random();

    public Circle createRandomCircle() {
        double radius = rnd.nextInt(10)+1;
        return new Circle (radius);
    }

    public Square createRandomSquare() {
        double squareSide = rnd.nextInt(10)+1;
        return new Square (squareSide);
    }

    public Rectangle createRandomRectangle() {
        double width = rnd.nextInt(10)+1;
        double height = rnd.nextInt(10)+1;
        return new Rectangle(width,height);
    }

    public Triangle createRandomTriangle() {
        double side1 = rnd.nextInt(10)+1;
        double side2 = rnd.nextInt(10)+1;
        double side3 = rnd.nextInt(10)+1;
        return new Triangle(side1, side2, side3);
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

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }



}
