package student_volodya_danilin.lesson_15.level_2;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class QuadraticEqTest {
    QuadraticEq quad = new QuadraticEq();

    public static void main(String[] args) {
        QuadraticEqTest test = new QuadraticEqTest();

        test.discriminantIsGreaterThanZeroTest();
        test.discriminantIsEqualToZeroTest();
        test.discriminantIsLessThanZeroTest();
    }

    void discriminantIsGreaterThanZeroTest() {
        System.out.print("D greater than zero test :");
        String result = quad.calc(2, 3, 1);
        Pattern pattern = Pattern.compile("x1 = ([+-]?\\d+\\.\\d+), x2 = ([+-]?\\d+\\.\\d+)");
        Matcher matcher = pattern.matcher(result);
        float x1 = 0;
        float x2 = 0;
        while (matcher.find()) {
            x1 = Float.parseFloat(matcher.group(1));
            x2 = Float.parseFloat(matcher.group(2));
        }
        if (x1 == -1.0 && x2 == -0.5) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }

    void discriminantIsEqualToZeroTest() {
        System.out.print("D equal to zero test : ");
        String result = quad.calc(1, 4, 4);
        Pattern pattern = Pattern.compile("x = ([+-]?\\d+\\.\\d+)");
        Matcher matcher = pattern.matcher(result);
        float valueOfX = 0;
        while (matcher.find()) {
            valueOfX = Float.parseFloat(matcher.group(1));
        }
        if (valueOfX == -2) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }

    void discriminantIsLessThanZeroTest() {
        System.out.print("D less than zero test : ");
        String result = quad.calc(2, 4, 4);
        if (result.contains("no roots")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }
}
