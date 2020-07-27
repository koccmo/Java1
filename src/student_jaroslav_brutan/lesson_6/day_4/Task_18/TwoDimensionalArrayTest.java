package student_jaroslav_brutan.lesson_6.day_4.Task_18;

public class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.testSum();
    }

    public void testSum(){
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = {{3, 4, 5}, {1, 2, 7}};
        if (twoDimensionalArray.sumArrayNumbers(array) == 22){
            System.out.println("TEST - OK");
        } else {
            System.out.println("TEST - FALSE");
        }
    }
}
