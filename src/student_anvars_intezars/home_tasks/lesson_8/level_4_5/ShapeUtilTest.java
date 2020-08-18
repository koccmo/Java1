package student_anvars_intezars.home_tasks.lesson_8.level_4_5;

class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.testForAreasOfShapes();
        shapeUtilTest.testForPerimetersOfShapes();

    }

    void testForAreasOfShapes() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double resultOfAreasAfterMethod = shapeUtil.calculateArea(shapes);
        double sumOfAreasOfShapes = 0;
        for (int i = 0; i < shapes.length; i++) {
            sumOfAreasOfShapes = sumOfAreasOfShapes + shapes[i].calculateArea();
        }
        if (sumOfAreasOfShapes == resultOfAreasAfterMethod) {
            System.out.println("Test for calculating all areas for shapes = OK");
        } else {
            System.out.println("Test for calculating all areas for shapes + FAIL");
        }
    }

    void testForPerimetersOfShapes() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double resultOfPerimetersAfterMethod = shapeUtil.calculateArea(shapes);
        double sumOfPerimetersOfShapes = 0;
        for (int j = 0; j < shapes.length; j++) {
            sumOfPerimetersOfShapes = sumOfPerimetersOfShapes + shapes[j].calculateArea();
        }
        if (sumOfPerimetersOfShapes == resultOfPerimetersAfterMethod) {
            System.out.println("Test for calculating all perimeters for shapes = OK");
        } else {
            System.out.println("Test for calculating all perimeters for shapes = FAIL");
        }
    }
}

