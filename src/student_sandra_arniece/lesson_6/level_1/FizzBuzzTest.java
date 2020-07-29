package student_sandra_arniece.lesson_6.level_1;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzAndBuzzTest();
        fizzBuzzTest.fizzBuzzNegativeTest();
        fizzBuzzTest.fizzBuzzNoneTest();
        fizzBuzzTest.fizzBuzzMaxIntTest();
    }

    public void fizzTest() {
        FizzBuzz testFizzBuzz = new FizzBuzz();
        if (testFizzBuzz.detect(33).equals("Fizz")) {
            System.out.println("OK for Fizz test");
        } else {
            System.out.println("FAIL for Fizz test");
        }
    }

    public void buzzTest() {
        FizzBuzz testFizzBuzz = new FizzBuzz();
        if (testFizzBuzz.detect(55).equals("Buzz")) {
            System.out.println("OK for Buzz test");
        } else {
            System.out.println("FAIL for Buzz test");
        }
    }

    public void fizzAndBuzzTest() {
        FizzBuzz testFizzBuzz = new FizzBuzz();
        if (testFizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("OK for Fizz and Buzz test");
        } else {
            System.out.println("FAIL for Fizz and Buzz test");
        }
    }

    public void fizzBuzzNegativeTest() {
        FizzBuzz testFizzBuzz = new FizzBuzz();
        if (testFizzBuzz.detect(-15).equals("FizzBuzz")) {
            System.out.println("OK for FizzBuzz negative test");
        } else {
            System.out.println("FAIL for FizzBuzz negative test");
        }
    }

    public void fizzBuzzNoneTest() {
        FizzBuzz testFizzBuzz = new FizzBuzz();
        if (testFizzBuzz.detect(1).equals("1")) {
            System.out.println("OK for No FizzBuzz test");
        } else {
            System.out.println("FAIL for No FizzBuzz test");
        }
    }

    public void fizzBuzzMaxIntTest() {
        FizzBuzz testFizzBuzz = new FizzBuzz();
        if (testFizzBuzz.detect(2147483647).equals("2147483647")) {
            System.out.println("OK for Max Int FizzBuzz test");
        } else {
            System.out.println("FAIL for Max Int FizzBuzz test");
        }
    }

}
