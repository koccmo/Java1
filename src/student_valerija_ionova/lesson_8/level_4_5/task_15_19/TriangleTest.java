package student_valerija_ionova.lesson_8.level_4_5.task_15_19;

class TriangleTest {

    public static void main (String [] args){

        TriangleTest test = new TriangleTest();

        test.testTriangleArea();
        test.testTrianglePerimeter();
    }

    public void testTriangleArea(){
        Triangle triangle = new Triangle("Triangle", 5, 3, 4);
        if (triangle.calculateArea() == 6){
            System.out.println("testTriangleArea OK");
        }else{
            System.out.println("testTriangleArea FAIL");
        }
    }

    public void testTrianglePerimeter(){
        Triangle triangle = new Triangle("Triangle", 5, 3, 4);
        if (triangle.calculatePerimeter() == 12){
            System.out.println("testTrianglePerimeter OK");
        }else{
            System.out.println("testTrianglePerimeter FAIL");
        }
    }
}
