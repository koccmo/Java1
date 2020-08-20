package student_roberts_kupcs.lesson_8.homework.level_4.Task_19;

class TriangleTest {

    public static void main(String[] args) {

        TriangleTest triangleTest = new TriangleTest();
        triangleTest.calculateAreaTest();
        triangleTest.calculatePerimeterTest();
    }

    public void calculateAreaTest() {

        Triangle triangle = new Triangle("Triangle", 2, 3);
        if (triangle.calculateArea() == 3.0) {
            System.out.println("Triangle calculateAreaTest is OK");
        } else {
            System.out.println("Triangle calculateAreaTest is FAIL");
        }
    }

    public void calculatePerimeterTest() {

        Triangle triangle = new Triangle("Triangle", 2, 3, 4);
        if (triangle.calculatePerimeter() == 9.0) {
            System.out.println("Triangle calculatePerimeterTest is OK");
        } else {
            System.out.println("Triangle calculatePerimeterTest is FAIL");
        }
    }
}
