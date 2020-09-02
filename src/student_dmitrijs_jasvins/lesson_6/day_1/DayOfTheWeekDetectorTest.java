package student_dmitrijs_jasvins.lesson_6.day_1;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.mondayTest();
        dayOfTheWeekDetectorTest.tuesdayTest();
        dayOfTheWeekDetectorTest.wednesdayTest();
        dayOfTheWeekDetectorTest.thursdayTest();
        dayOfTheWeekDetectorTest.fridayTest();
        dayOfTheWeekDetectorTest.saturdayTest();
        dayOfTheWeekDetectorTest.sundayTest();
        dayOfTheWeekDetectorTest.notValidTest();
    }

    public void mondayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        assertResult("Monday ", dayOfTheWeekDetector.detectDayName(1), "Monday");
    }

    public void tuesdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        assertResult("Tuesday ", dayOfTheWeekDetector.detectDayName(2), "Tuesday");
    }

    public void wednesdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        assertResult("Wednesday ", dayOfTheWeekDetector.detectDayName(3), "Wednesday");
    }

    public void thursdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        assertResult("Thursday ", dayOfTheWeekDetector.detectDayName(4), "Thursday");
    }

    public void fridayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        assertResult("Friday ", dayOfTheWeekDetector.detectDayName(5), "Friday");
    }

    public void saturdayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        assertResult("Saturday ", dayOfTheWeekDetector.detectDayName(6), "Saturday");
    }

    public void sundayTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        assertResult("Sunday ", dayOfTheWeekDetector.detectDayName(7), "Sunday");
    }

    public void notValidTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        assertResult("Not valid ", dayOfTheWeekDetector.detectDayName(10),
                "Please input a valid number between 1 and 7");
    }

    public void assertResult(String name, String actualResult, String expectedResult) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(name + "Test = OK");
        } else {
            System.out.println(name + "Test = FAIL");
        }
    }
}
