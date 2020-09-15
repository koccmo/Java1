package student_jekaterina_loseva.lesson_6.level_1.task_2;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.testMonday();
        test.testTuesday();
        test.testWednesday();
        test.testThursday();
        test.testFriday();
        test.testSaturday();
        test.testSunday();
        test.testNumberNotvalid();
    }

    public void checkResult(String nameOfTest, Boolean isOk) {
        if (isOk) {
            System.out.println(nameOfTest + " = OK");
        } else {
            System.out.println(nameOfTest + " = FAIL");
        }
    }

    public void testMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.detectDayName(1);
        checkResult("Test of Monday", result.equals("Monday"));
    }

    public void testTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.detectDayName(2);
        checkResult("Test of Tuesday", result.equals("Tuesday"));
    }

    public void testWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.detectDayName(3);
        checkResult("Test of Wednesday", result.equals("Wednesday"));
    }

    public void testThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.detectDayName(4);
        checkResult("Test of Thursday", result.equals("Thursday"));
    }

    public void testFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.detectDayName(5);
        checkResult("Test of Friday", result.equals("Friday"));
    }

    public void testSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.detectDayName(6);
        checkResult("Test of Saturday", result.equals("Saturday"));
    }

    public void testSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.detectDayName(7);
        checkResult("Test of Sunday", result.equals("Sunday"));
    }

    public void testNumberNotvalid() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.detectDayName(0);
        checkResult("Test of not a day", result.equals("Please input a valid number between 1 and 7"));
    }

}
