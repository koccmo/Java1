package student_anvars_intezars.home_tasks.lesson_8.level_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeTest {

    public static void main(String[] args) {

        ShapeTest shapeTest = new ShapeTest();
        shapeTest.circleAreaTest();
        shapeTest.circlePerimeterTest();
        shapeTest.squareAreaTest();
        shapeTest.squarePerimeterTest();
        shapeTest.rectangleAreaTest();
        shapeTest.rectanglePerimeterTest();
        shapeTest.triangleAreaTest();
        shapeTest.trianglePerimeterTest();
    }

    void circleAreaTest() {
        Circle circle = new Circle(2);
        double resultOfCalculateArea = circle.calculateArea();
        if (resultOfCalculateArea == 12.56) {
            System.out.println("Test for calculating area of circle = OK");
        }else {
            System.out.println("Test for calculating are of circle = FAIL");
        }
    }

    void circlePerimeterTest() {
        Circle circle = new Circle(6);
        double resultOfCalculatePerimeter = circle.calculatePerimeter();
        if (resultOfCalculatePerimeter == 37.68) {
            System.out.println();
            System.out.println("Test for calculating perimeter of circle = OK");
        }else {
            System.out.println("Test for calculating perimeter of circle = FAIL");
        }
    }

    void squareAreaTest() {
        Square square = new Square(8);
        double resultOfCalculateArea = square.calculateArea();
        if (resultOfCalculateArea == 64) {
            System.out.println();
            System.out.println("Test for calculating area of square = OK");
        }else {
            System.out.println("Test for calculating area of square = FAIL");
        }
    }

    void squarePerimeterTest() {
        Square square = new Square(3.4);
        double resultOfCalculatePerimeter = square.calculatePerimeter();
        if (resultOfCalculatePerimeter == 13.6) {
            System.out.println();
            System.out.println("Test for calculating perimeter of square = OK");
        }else {
            System.out.println("Test for calculating perimeter of square = FAIL");
        }
    }

    void rectangleAreaTest() {
        Rectangle rectangle = new Rectangle(1.3,7.8);
        double resultOfCalculateArea = rectangle.calculateArea();
        if (resultOfCalculateArea == 10.14) {
            System.out.println();
            System.out.println("Test for calculating area of rectangle = OK");
        }else {
            System.out.println("Test for calculating area of rectangle = FAIL");
        }
    }

    void rectanglePerimeterTest() {
        Rectangle rectangle = new Rectangle(6.7,5.5);
        double resultOfCalculatePerimeter = rectangle.calculatePerimeter();
        if (resultOfCalculatePerimeter == 24.4) {
            System.out.println();
            System.out.println("Test for calculating perimeter of rectangle = OK");
        }else {
            System.out.println("Test for calculating perimeter of rectangle FAIL");
        }
    }

    void triangleAreaTest() {
        Triangle triangle = new Triangle(3,2,3,4,1);
        double resultOfCalculateArea = triangle.calculateArea();
        if (resultOfCalculateArea == 3) {
            System.out.println();
            System.out.println("Test for calculating area of triangle = OK");
        }else {
            System.out.println("Test for calculating area of triangle = FAIL");
        }
    }

    void trianglePerimeterTest() {
        Triangle triangle = new Triangle (2,3,1,2,3);
        double resultOfCalculatePerimeter = triangle.calculatePerimeter();
        if (resultOfCalculatePerimeter == 8) {
            System.out.println();
            System.out.println("Test for calculating perimeter of triangle = OK");
        }else {
            System.out.println("Test for calculating perimeter of triangle = FAIL");
        }
    }
}

