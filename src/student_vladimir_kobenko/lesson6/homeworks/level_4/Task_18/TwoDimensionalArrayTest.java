package student_vladimir_kobenko.lesson6.homeworks.level_4.Task_18;

public class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest arrayTest = new TwoDimensionalArrayTest();
        arrayTest.testSumOfTwoDimensionalArray();
    }

    public void testSumOfTwoDimensionalArray() {
        TwoDimensionalArray newArray = new TwoDimensionalArray();
        int[][] arrayForTest = {{1, 2, 5, 7, 13, 1}, {5, 8, 12, 17, 25, 1}, {3, 4, 6, 3, 33, 1},
                {31, 25, 76, 14, 33, 1}, {31, 25, 76, 14, 33, 1}};

        if (newArray.sumOfTwoDimensionalArray(arrayForTest) == 507) {
            System.out.println("test testSumOfTwoDimensionalArray OK");
        } else {
            System.out.println("test testSumOfTwoDimensionalArray FAIL");
        }

    }
}
