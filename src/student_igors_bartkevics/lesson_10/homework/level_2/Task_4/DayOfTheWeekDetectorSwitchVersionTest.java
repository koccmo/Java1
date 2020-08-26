package student_igors_bartkevics.lesson_10.homework.level_2.Task_4;

class DayOfTheWeekDetectorSwitchVersionTest {

    DayOfTheWeekDetector detector = new DayOfTheWeekDetectorSwitchVersion();

    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersionTest test = new DayOfTheWeekDetectorSwitchVersionTest();
        test.mondayTest();
        test.tuesdayTest();
        test.wednesdayTest();
        test.thursdayTest();
        test.fridayTest();
        test.saturdayTest();
        test.sundayTest();
        test.wrongDayNumberLessThan1Test();
        test.wrongDayNumberMoreThan7Test();
    }

    void mondayTest() {
        String expectedResult = detector.detectDayName(1);
        checkResult(expectedResult.equals("Monday"), "Monday");
    }

    void tuesdayTest() {
        String expectedResult = detector.detectDayName(2);
        checkResult(expectedResult.equals("Tuesday"), "Tuesday");
    }

    void wednesdayTest() {
        String expectedResult = detector.detectDayName(3);
        checkResult(expectedResult.equals("Wednesday"), "Wednesday");
    }

    void thursdayTest() {
        String expectedResult = detector.detectDayName(4);
        checkResult(expectedResult.equals("Thursday"), "Thursday");
    }

    void fridayTest() {
        String expectedResult = detector.detectDayName(5);
        checkResult(expectedResult.equals("Friday"), "Friday");
    }

    void saturdayTest() {
        String expectedResult = detector.detectDayName(6);
        checkResult(expectedResult.equals("Saturday"), "Saturday");
    }

    void sundayTest() {
        String expectedResult = detector.detectDayName(7);
        checkResult(expectedResult.equals("Sunday"), "Sunday");
    }

    void wrongDayNumberLessThan1Test() {
        String expectedResult = detector.detectDayName(0);
        checkResult(expectedResult.equals("Please input a valid number between 1 and 7"), "Wrong day number");
    }

    void wrongDayNumberMoreThan7Test() {
        String expectedResult = detector.detectDayName(8);
        checkResult(expectedResult.equals("Please input a valid number between 1 and 7"), "Wrong day number");
    }




    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
