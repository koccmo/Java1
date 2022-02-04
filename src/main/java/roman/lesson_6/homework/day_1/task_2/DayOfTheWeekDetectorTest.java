package roman.lesson_6.homework.day_1.task_2;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.mondayTest();
        test.tuesdayTest();
        test.wednesdayTest();
        test.thursdayTest();
        test.fridayTest();
        test.saturdayTest();
        test.sundayTest();
        test.numberLessThenOne();
        test.numberGreaterThenSeven();

        test.dayOfWeekTestOne();
        test.dayOfWeekTestTwo();
        test.dayOfWeekTestTree();

    }
    DayOfTheWeekDetector test = new DayOfTheWeekDetector();

    public void checkResults (boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println("Test " + nameOfTest + " OK!");
        } else System.out.println("Test " + nameOfTest + " False!");
    }

    public void mondayTest () {
        String expectedAnswer = "Monday";
        boolean condition = expectedAnswer.equals(test.detectDayName(1));
        checkResults(condition, expectedAnswer);
    }

    public void tuesdayTest () {
        String expectedAnswer = "Tuesday";
        boolean condition = expectedAnswer.equals(test.detectDayName(2));
        checkResults(condition, expectedAnswer);
    }

    public void wednesdayTest () {
        String expectedAnswer = "Wednesday";
        boolean condition = expectedAnswer.equals(test.detectDayName(3));
        checkResults(condition, expectedAnswer);
    }

    public void thursdayTest () {
        String expectedAnswer = "Thursday";
        boolean condition = expectedAnswer.equals(test.detectDayName(4));
        checkResults(condition, expectedAnswer);
    }

    public void fridayTest () {
        String expectedAnswer = "Friday";
        boolean condition = expectedAnswer.equals(test.detectDayName(5));
        checkResults(condition, expectedAnswer);
    }

    public void saturdayTest () {
        String expectedAnswer = "Saturday";
        boolean condition = expectedAnswer.equals(test.detectDayName(6));
        checkResults(condition, expectedAnswer);
    }

    public void sundayTest () {
        String expectedAnswer = "Sunday";
        boolean condition = expectedAnswer.equals(test.detectDayName(7));
        checkResults(condition, expectedAnswer);
    }

    public void numberLessThenOne () {
        String expectedAnswer = "You entered not correct number or symbol";
        boolean condition = expectedAnswer.equals(test.detectDayName(0));
        checkResults(condition, expectedAnswer);
    }

    public void numberGreaterThenSeven () {
        String expectedAnswer = "You entered not correct number or symbol";
        boolean condition = expectedAnswer.equals(test.detectDayName(8));
        checkResults(condition, expectedAnswer);
    }

    public void dayOfWeekTestOne () {
        String nameOfTest = "Day Detector One";
        int number = 5;
        String go = test.detectDayName(number);
        if (go.equals(test.detectDayName(5))) {
            System.out.println("Test " + nameOfTest + " OK!");
        } else System.out.println("Test " + nameOfTest + "False!");
    }
    public void dayOfWeekTestTwo() {
        int number = 0;
        String nameOfTest = "Day Detector Two";
        String dayName = test.detectDayName(number);
        if (dayName.equals(test.detectDayName(0))) {
            System.out.println("Test " + nameOfTest + " OK!");
        } else System.out.println("Test " + nameOfTest + " False");
    }

    public void dayOfWeekTestTree () {
        String nameOfTest = "Day Detector Thursday";
        String expectedAnswer = "Thursday";
        boolean condition = expectedAnswer.equals(test.detectDayName(4));
        DayOfTheWeekDetectorTest check = new DayOfTheWeekDetectorTest();
        check.checkResults(condition,nameOfTest);

    }

}
