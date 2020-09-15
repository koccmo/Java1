package student_roberts_kupcs.lesson_4.homework.level_x;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1();
        fizzBuzzTest.test2();
        fizzBuzzTest.test3();
        fizzBuzzTest.test4();
    }

    public void test1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(6).equals("Fizz")) {
            System.out.println("Test1 is OK");
        } else {
            System.out.println("Test1 is FAIL");
        }
    }

    public void test2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(20).equals("Buzz")) {
            System.out.println("Test2 is OK");
        } else {
            System.out.println("Test2 is FAIL");
        }
    }

    public void test3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("Test3 is OK");
        } else {
            System.out.println("Test3 is FAIL");
        }
    }

    public void test4() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(7).equals("7")) {
            System.out.println("Test4 is OK");
        } else {
            System.out.println("Test4 is FAIL");
        }
    }
}
