package student_igors_bartkevics.lesson_6.homework.level_1.task_3;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.numberDivBy_3_And_5();
        test.numberDivBy_3();
        test.numberDivBy_5();
        test.numberIsNotDivBy_3_Or_5();
    }

    FizzBuzz fizzBuzz = new FizzBuzz();

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void numberDivBy_3_And_5() {
        int number = 15;
        String result = fizzBuzz.detect(number);
        String testName = "Number is divisible by 3 and 5";
        checkResult(result.equals("FizzBuzz"), testName);
    }

    public void numberDivBy_3() {
        int number = 9;
        String result = fizzBuzz.detect(number);
        String testName = "Number is divisible by 3";
        checkResult(result.equals("Fizz"), testName);
    }

    public void numberDivBy_5() {
        int number = 10;
        String result = fizzBuzz.detect(number);
        String testName = "Number is divisible by 5";
        checkResult(result.equals("Buzz"), testName);
    }

    public void numberIsNotDivBy_3_Or_5() {
        int number = 11;
        String result = fizzBuzz.detect(number);
        String testName = "Number is NOT divisible by 3 or 5";
        checkResult(result.equals("11"), testName);
    }
}
