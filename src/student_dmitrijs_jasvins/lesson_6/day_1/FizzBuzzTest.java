package student_dmitrijs_jasvins.lesson_6.day_1;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testNotFizzBuzz();
    }

    public void assertResult(String name, String actualResult, String expectedResult) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(name + "Test = OK");
        } else {
            System.out.println(name + "Test = FAIL");
        }
    }

    public void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertResult("Fizz", fizzBuzz.detect(3), "Fizz");
    }

    public void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertResult("Buzz", fizzBuzz.detect(5), "Buzz");
    }

    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertResult("FizzBuzz", fizzBuzz.detect(15), "FizzBuzz");
    }
    public void testNotFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertResult("Not FizzBuzz", fizzBuzz.detect(8), "8");
    }
}

