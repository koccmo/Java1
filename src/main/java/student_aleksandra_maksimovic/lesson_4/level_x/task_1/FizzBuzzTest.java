package student_aleksandra_maksimovic.lesson_4.level_x.task_1;


public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest4();  // нужно более качественное название метода !!

    }

    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ( fizzBuzz.detect(9).equals("Fizz")) {
            System.out.println("test = OK");
        } else {
            System.out.println("test = FAIL");
        }
    }

    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ( fizzBuzz.detect(25).equals("Buzz")) {
            System.out.println("test = OK");
        } else {
            System.out.println("test = FAIL");
        }
    }

    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ( fizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("test = OK");
        } else {
            System.out.println("test = FAIL");
        }
    }
    public void fizzBuzzTest4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ( fizzBuzz.detect(14).equals("14")) {
            System.out.println("test = OK");
        } else {
            System.out.println("test = FAIL");
        }
    }
}
