package student_aleksandra_maksimovic.lesson_6.level_1.task_3;


public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.returnNumberTest();
    }

    private FizzBuzz fizzBuzz;
    public FizzBuzzTest() {
        this.fizzBuzz = new FizzBuzz();
    }

    public void fizzTest() {
        if ( fizzBuzz.detect(9).equals("Fizz")) {
            System.out.println("test = OK");
        } else {
            System.out.println("test = FAIL");
        }
    }

    public void buzzTest() {
        if ( fizzBuzz.detect(25).equals("Buzz")) {
            System.out.println("test = OK");
        } else {
            System.out.println("test = FAIL");
        }
    }

    public void fizzBuzzTest() {
        if ( fizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("test = OK");
        } else {
            System.out.println("test = FAIL");
        }
    }
    public void returnNumberTest() {
        if ( fizzBuzz.detect(14).equals("14")) {
            System.out.println("test = OK");
        } else {
            System.out.println("test = FAIL");
        }
    }
}