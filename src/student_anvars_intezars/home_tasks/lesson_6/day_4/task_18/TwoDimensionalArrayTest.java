package student_anvars_intezars.home_tasks.lesson_6.day_4.task_18;

public class TwoDimensionalArrayTest {

    public static void main(String[] args) {

        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.fillWithRandomNumbersTest();
        twoDimensionalArrayTest.sumOfRandomNumbersTest();
    }

    public void fillWithRandomNumbersTest() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = new int[2][2];
        System.out.println("Please see below two dimensional array filled with random number");
        twoDimensionalArray.fillTwoDimensionalArrayWithRandomNumbers(array);
        System.out.println();
    }

    public void sumOfRandomNumbersTest() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = new int[2][2];
        System.out.println();
        int result = twoDimensionalArray.sumOfRandomNumbers(array);
        System.out.println("Sum of this random numbers in TwoDimensional Array is " + result);

    }
}
