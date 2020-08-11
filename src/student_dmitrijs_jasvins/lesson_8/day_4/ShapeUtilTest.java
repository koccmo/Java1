package student_dmitrijs_jasvins.lesson_8.day_4;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateAreaTest();
        shapeUtilTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

    }

    public void calculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
    }
}
