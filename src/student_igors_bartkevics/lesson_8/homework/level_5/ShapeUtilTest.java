/*
Создайте класс ShapeUtilTest
и напишите тесты для методов:

    double calculateArea(Shape[] shapes);
    double calculatePerimeter(Shape[] shapes);

PS: пример создания и заполнения массива
геометрических фигур:

ShapeUtil shapeUtil = new ShapeUtil();
Shape[] shapes = new Shape[4];
shape[0] = shapeUtil.createRandomCircle();
shape[1] = shapeUtil.createRandomSquare();
shape[2] = shapeUtil.createRandomRectangle();
shape[3] = shapeUtil.createRandomTriangle();
 */
package student_igors_bartkevics.lesson_8.homework.level_5;

class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Circle", 2);
        shapes[1] = new Square("Square", 2);
        shapes[2] = new Rectangle("Rectangle", 1, 4);
        shapes[3] = new Triangle("Triangle", 10, 10, 10);
        double expectedResult = 12.56 + 4 + 4 + 43.3;
        double result = shapeUtil.calculateArea(shapes);
        checkResult(result == expectedResult, "Calculate area for array of shapes");
    }

    void calculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Circle", 2);
        shapes[1] = new Square("Square", 2);
        shapes[2] = new Rectangle("Rectangle", 1, 4);
        shapes[3] = new Triangle("Triangle", 10, 10, 10);
        double expectedResult = 12.56 + 8 + 10 + 30;
        double result = shapeUtil.calculatePerimeter(shapes);
        checkResult(result == expectedResult, "Calculate perimeter for array of shapes");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
