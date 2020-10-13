package student_roberts_kupcs.lesson_8.homework.level_5.Task_20_28;

//ShapeUtil shapeUtil = new ShapeUtil();
//Shape[] shapes = new Shape[4];
//shape[0] = shapeUtil.createRandomCircle();
//shape[1] = shapeUtil.createRandomSquare();
//shape[2] = shapeUtil.createRandomRectangle();
//shape[3] = shapeUtil.createRandomTriangle();

class ShapeUtilTest {
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
