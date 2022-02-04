package roman.lesson_6.homework.day_4.task_18;

public class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.shouldSumDoubleArray();
        test.shouldFillUpWithRandomNumbers();
    }
    TwoDimensionalArray make = new TwoDimensionalArray();

    public void checkResults (boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " - OK!");
        } else System.out.println(nameOfTest + " - False!");
    }

    public void shouldFillUpWithRandomNumbers () {
        int[][] array = make.createDoubleArray(2, 3);
        make.fillUpTwoDimensionalArrayWithRandomNumbers(array);
        boolean condition = make.sumOfDoubleArray(array) != 0;
        String nameOfTest = "Random number fill UP";
        checkResults(condition, nameOfTest);
    }

    public void shouldSumDoubleArray () {
        int[][] array = {{1, 2},{1, 2}};
        int expectedAnswer = 6;
        boolean condition = expectedAnswer == make.sumOfDoubleArray(array);
        String nameOfTest = "Sum Double Array";
        checkResults(condition, nameOfTest);
    }
}
