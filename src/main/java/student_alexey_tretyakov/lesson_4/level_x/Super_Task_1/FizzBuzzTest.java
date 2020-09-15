package student_alexey_tretyakov.lesson_4.level_x.Super_Task_1;  //  пакеты с маленькой буквы

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzz testFizzBuzz = new FizzBuzz();
        FizzBuzzTest.testResult( ( testFizzBuzz.detect (18) ).equals("Fizz"), "Число кратно 3.");
        FizzBuzzTest.testResult( ( testFizzBuzz.detect (25) ).equals("Buzz"), "Число кратно 5.");
        FizzBuzzTest.testResult( ( testFizzBuzz.detect (45) ).equals("FizzBuzz"), "Число кратно 3 и 5.");
        FizzBuzzTest.testResult( ( testFizzBuzz.detect (22) ).equals("" + 22 ), "Число HE кратно 3 или 5.");
    }

    private static void testResult(boolean status, String testingString) {
        if (status) {
            System.out.println( testingString + " Test OK.");
        } else {
            System.out.println( testingString + " Test FAIL!!!");
        }
    }

}

