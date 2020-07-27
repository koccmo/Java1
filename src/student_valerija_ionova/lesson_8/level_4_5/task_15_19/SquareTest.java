package student_valerija_ionova.lesson_8.level_4_5.task_15_19;

class SquareTest {

    public static void main (String [] args){

        SquareTest squareTest = new SquareTest();

        squareTest.testSquareArea();
        squareTest.testSquarePerimeter();
    }

    public void testSquareArea(){
        Square square = new Square("Square", 5);
        if (square.calculateArea() == 25){
            System.out.println("testSquareArea OK");
        }else{
            System.out.println("testSquareArea FAIL");
        }
    }

    public void testSquarePerimeter(){
        Square square = new Square("Square", 5);
        if (square.calculatePerimeter() == 20){
            System.out.println("testSquarePerimeter OK");
        }else{
            System.out.println("testSquarePerimeter FAIL");
        }
    }

}
