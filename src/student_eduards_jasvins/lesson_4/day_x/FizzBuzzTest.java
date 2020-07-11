package student_eduards_jasvins.lesson_4.day_x;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.FizzTest();   // method name must start with small letter
        fizzBuzzTest.BuzzTest();   // method name must start with small letter
        fizzBuzzTest.FizzBuzzTest();   // method name must start with small letter
        fizzBuzzTest.NotFizzBuzzTest();   // method name must start with small letter
    }
    public void FizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(6).equals("Fizz")) {
            System.out.println("Fizz = OK");
        } else {
            System.out.println("Fizz = FAIL");
        }
    }
    public void BuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(10).equals("Buzz")) {
            System.out.println("Buzz = OK");
        } else {
            System.out.println("Buzz = FAIL");
        }
    }
    public void FizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(30).equals("FizzBuzz")) {
            System.out.println("FizzBuzz = OK");
        } else {
            System.out.println("FizzBuzz = FAIL");
        }
    }
    public void NotFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(8).equals("8")) {
            System.out.println("NotFizzBuzz = OK");
        } else {
            System.out.println("NotFizzBuzz = FAIL");
        }

    }
}
