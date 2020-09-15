package student_igors_bartkevics.lesson_6.homework.level_1.task_2;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.mondayTest();
        test.tuesdayTest();
        test.wednesdayTest();
        test.thursdayTest();
        test.fridayTest();
        test.saturdayTest();
        test.sundayTest();
        test.enteredDayNumberIsLessThan_1_Test();
        test.enteredDayNumberIsGreaterThan_7_Test();

    }

    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void mondayTest() {
        String expectedResult = "Monday";
        boolean condition = (detector.detectDayName(1).equals(expectedResult));
        checkResult(condition, expectedResult);
    }

    public void tuesdayTest() {
        String expectedResult = "Tuesday";
        boolean condition = (detector.detectDayName(2).equals(expectedResult));
        checkResult(condition, expectedResult);
    }

    public void wednesdayTest() {
        String expectedResult = "Wednesday";
        boolean condition = (detector.detectDayName(3).equals(expectedResult));
        checkResult(condition, expectedResult);
    }

    public void thursdayTest() {
        String expectedResult = "Thursday";
        boolean condition = (detector.detectDayName(4).equals(expectedResult));
        checkResult(condition, expectedResult);
    }

    public void fridayTest() {
        String expectedResult = "Friday";
        boolean condition = (detector.detectDayName(5).equals(expectedResult));
        checkResult(condition, expectedResult);
    }

    public void saturdayTest() {
        String expectedResult = "Saturday";
        boolean condition = (detector.detectDayName(6).equals(expectedResult));
        checkResult(condition, expectedResult);
    }

    public void sundayTest() {
        String expectedResult = "Sunday";
        boolean condition = (detector.detectDayName(7).equals(expectedResult));
        checkResult(condition, expectedResult);
    }

    public void enteredDayNumberIsLessThan_1_Test() {
        String expectedResult = "Wrong day number entered";
        boolean condition = (detector.detectDayName(0).equals(expectedResult));
        checkResult(condition, "Entered day number is less than 1");
    }

    public void enteredDayNumberIsGreaterThan_7_Test() {
        String expectedResult = "Wrong day number entered";
        boolean condition = (detector.detectDayName(8).equals(expectedResult));
        checkResult(condition, "Entered day number is greater than 7");
    }

}
