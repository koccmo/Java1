package student_roberts_kupcs.lesson_6.homework.level_4;

class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.testSumOfArray();
    }
    public void testSumOfArray() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] testArray = {{5, 9, 3}, {4, 14, 9}};
        if (twoDimensionalArray.sumOfArray(testArray) == 44) {
            System.out.println("Test testSumOfArray OK");
        } else {
            System.out.println("Test testSumOfArray FALSE");

        }
    }
}
