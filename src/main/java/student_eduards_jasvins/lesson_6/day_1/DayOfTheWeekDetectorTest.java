package student_eduards_jasvins.lesson_6.day_1;


public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.mondayTest();
        dayOfTheWeekDetectorTest.tuesdayTest();
        dayOfTheWeekDetectorTest.wednesdayTest();
        dayOfTheWeekDetectorTest.thursdayTest();
        dayOfTheWeekDetectorTest.fridayTest();
        dayOfTheWeekDetectorTest.saturdayTest();
        dayOfTheWeekDetectorTest.sundayTest();
        dayOfTheWeekDetectorTest.whatADayTest();
    }
    public void checkString(String name, String methodsResult, String expectedResult ) {
        if (methodsResult.equals(expectedResult)) {
            System.out.println(name + "Test OK");
        } else {
            System.out.println(name + "Test FAIL");
        }
    }

    public void mondayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Monday Test = ", detector.detectDayName(1), "Monday");

    }
    public void tuesdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Tuesday Test = ", detector.detectDayName(2), "Tuesday");

    }
    public void wednesdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Wednesday Test = ", detector.detectDayName(3), "Wednesday");

    }
    public void thursdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Thursday Test = ", detector.detectDayName(4), "Thursday");

    }
    public void fridayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Friday Test = ", detector.detectDayName(5), "Friday");

    }
    public void saturdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Saturday Test = ", detector.detectDayName(6), "Saturday");

    }
    public void sundayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Sunday Test  = ", detector.detectDayName(7), "Sunday");

    }
    public void whatADayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("What day is it?  = ", detector.detectDayName(8), "Please enter number from 1 to 7");

    }


}
