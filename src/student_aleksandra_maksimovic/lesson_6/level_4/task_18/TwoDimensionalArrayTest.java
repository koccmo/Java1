package student_aleksandra_maksimovic.lesson_6.level_4.task_18;



import student_aleksandra_maksimovic.testing.Tester;

public class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.sumOffAllNumbersInTwoDimensionalArrayTest();

    }

    TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
    Tester tester= new Tester();

    public void sumOffAllNumbersInTwoDimensionalArrayTest() {
        int[][] arrayTest = {{5, 6, 8, 9, 4}, {7, 2, 1, 1, 1}, {1, 1, 1, 1, 1,}, {0, 0, 0, 1, 0}};
        tester.check(twoDimensionalArray.sumOffAllNumbersInTwoDimensionalArray(arrayTest) == 50, " SumOffAllNumbersInTwoDimensionalArray Test #1 ");
    }
}
