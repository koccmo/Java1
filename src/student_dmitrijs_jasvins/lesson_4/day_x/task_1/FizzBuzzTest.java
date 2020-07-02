package student_dmitrijs_jasvins.lesson_4.day_x.task_1;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testLastVariant();
    }

    public void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(9).equals("Fizz")) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(10).equals("Buzz")) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = Fail");
        }
    }

    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void testLastVariant() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(14).equals("14")) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}
