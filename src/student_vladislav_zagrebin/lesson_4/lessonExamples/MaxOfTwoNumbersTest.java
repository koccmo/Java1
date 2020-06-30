package student_vladislav_zagrebin.lesson_4.lessonExamples;

public class MaxOfTwoNumbersTest {

    public static void main(String[] args) {
        MaxOfTwoNumbersTest test = new MaxOfTwoNumbersTest();
        test.test1();


    }

    public void test1() {
        int number1 = 10;
        int number2 = 1;

        MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
        int result = maxOfTwoNumbers.max(number1, number2);

        if (result == 10) {
            System.out.println("TEST 1 OK!");
        } else  {
            System.out.println("TEST 1 FAILED!");
        }
    }

}
