package student_roberts_kupcs.lesson_4.homework.level_1;

class PositiveNumberTest {
    public static void main(String[] args) {
        PositiveNumberTest positiveNumberTest = new PositiveNumberTest();
        positiveNumberTest.test1();
        positiveNumberTest.test2();
    }

        public void test1() {
        int firstNumber = -5;

        PositiveNumber positiveNumber = new PositiveNumber();
            if (firstNumber >= 0) {
                System.out.println("First number is positive");
            } else {
                System.out.println("First number is not Positive");
            }
        }
    public void test2() {
        int firstNumber = 5;

        PositiveNumber positiveNumber = new PositiveNumber();
        if (firstNumber >= 0) {
            System.out.println("First number is positive");
        } else {
            System.out.println("First number is not Positive");
        }
    }
}
