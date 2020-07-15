package student_eduards_jasvins.lesson_4.day_x;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }
    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(4).equals("Fizz")) {
            System.out.println("Fizz = OK");
        } else {
            System.out.println("Fizz = FAIL");
        }
    }
    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(10).equals("Buzz")) {
            System.out.println("Buzz = OK");
        } else {
            System.out.println("Buzz = FAIL");
        }
    }
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(30).equals("FizzBuzz")) {
            System.out.println("FizzBuzz = OK");
        } else {
            System.out.println("FizzBuzz = FAIL");
        }
    }
    public void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(8).equals("8")) {
            System.out.println("NotFizzBuzz = OK");
        } else {
            System.out.println("NotFizzBuzz = FAIL");
        }

    }
}
