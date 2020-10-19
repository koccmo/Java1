package student_volodya_danilin.lesson_13.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StringCalculatorTest {
    StringCalculator calculator = new StringCalculator();

    public static void main(String[] args) {
        StringCalculatorTest test = new StringCalculatorTest();

        test.shouldReturn0();
        test.shouldReturn10();
        test.shouldReturn9();
        test.shouldReturn11();
        test.shouldReturn3();
        test.shouldReturn6();
    }

    void shouldReturn0() {
        String testString = "";
        if (calculator.add(testString) == 0) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }

    void shouldReturn10() {
        String testString = "gg4kkkk6";
        if (calculator.add(testString) == 10) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }

    void shouldReturn9() {
        String testString = "3,3,3 abababa";
        if (calculator.add(testString) == 9) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }

    void shouldReturn11() {
        String testString = "1\n23,5";
        if (calculator.add(testString) == 11) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }

    void shouldReturn3() {
        String testString = "//[;]\n1;2";
        if (calculator.add(testString) == 3) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }

    void shouldReturn6() {
        String testString = "//[;][&]\n1;2&3";
        if (calculator.add(testString) == 6) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }
}
