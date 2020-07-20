package student_dmitrijs_jasvins.lesson_6.day_4.task_18;

public class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.sumTest();
    }

    public void sumTest() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };
        if(twoDimensionalArray.sum(array) == 5){
            System.out.println("Test = OK");
        }else{
            System.out.println("Test = FAIL");
        }
    }
}
