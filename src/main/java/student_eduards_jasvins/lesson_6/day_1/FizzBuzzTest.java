package student_eduards_jasvins.lesson_6.day_1;



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
        if (fizzBuzz.detect(3).equals("Fizz")) {
            System.out.println("Fizz = OK");
        } else {
            System.out.println("Fizz = FAIL");
        }
    }
    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(5).equals("Buzz")) {
            System.out.println("Buzz = OK");
        } else {
            System.out.println("Buzz = FAIL");
        }
    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("FizzBuzz = OK");
        } else {
            System.out.println("FizzBuzz = FAIL");
        }
    }

    public void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(8).equals("8")) {
            System.out.println("Not Fizz Buzz = OK");
        } else {
            System.out.println("Not Fizz Buzz = FAIL");
        }

    }
}
