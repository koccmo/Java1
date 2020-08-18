package student_anvars_intezars.home_tasks.lesson_8.level_4_5;

class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.createCircleTest();
    }

    void createCircleTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Circle resultOfRandomCircle = shapeUtil.createRandomCircle();
        System.out.println(resultOfRandomCircle);
        }

    }

