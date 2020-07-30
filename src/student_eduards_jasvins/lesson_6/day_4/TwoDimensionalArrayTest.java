package student_eduards_jasvins.lesson_6.day_4;

public class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.sumTest();
    }

    public void sumTest() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = {
                {1, 2, 1},
                {0, 2, 1},
                {1, 2, 0}
        };
        if (twoDimensionalArray.sumDimensionalArray(array) == 10) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}
