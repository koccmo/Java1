package roman.lesson_8.homework.day_5;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateShapesArrayAreas();
        test.calculateShapesArrayPerimeters();
    }

    public void calculateShapesArrayPerimeters() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Circle", 2);
        shapes[1] = new Triangle("|Triangle", 2);
        shapes[2] = new Rectangle("Rectangle", 3, 2);
        shapes[3] = new Square("Square", 2);
        checkResult(shapeUtil.calculatePerimeter(shapes) == 36.56,
                "Calculate Shapes Array Perimeters");
    }

    public void calculateShapesArrayAreas() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Circle", 2);
        shapes[1] = new Triangle("|Triangle", 2);
        shapes[2] = new Rectangle("Rectangle", 3, 2);
        shapes[3] = new Square("Square", 2);
        checkResult(shapeUtil.calculateArea(shapes) == 24.29, "Calculate Shape Array Area");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " test - OK!");
        } else {
            System.out.println(nameOfTest + " test - Fail!!!");
        }
    }
}
