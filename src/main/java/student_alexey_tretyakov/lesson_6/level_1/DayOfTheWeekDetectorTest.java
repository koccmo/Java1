package student_alexey_tretyakov.lesson_6.level_1;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.testNotDayOfWeek(0," Please input a valid number between 1 and 7. ");
        dayOfTheWeekDetectorTest.testDayOfWeek(1," Monday");
        dayOfTheWeekDetectorTest.testDayOfWeek(2," Tuesday");
        dayOfTheWeekDetectorTest.testDayOfWeek(3," Wednesday");
        dayOfTheWeekDetectorTest.testDayOfWeek(4," Thursday");
        dayOfTheWeekDetectorTest.testDayOfWeek(5," Friday");
        dayOfTheWeekDetectorTest.testDayOfWeek(6," Saturday");
        dayOfTheWeekDetectorTest.testDayOfWeek(7," Sunday");
        dayOfTheWeekDetectorTest.testNotDayOfWeek(8," Please input a valid number between 1 and 7. ");


    }
    public void testNotDayOfWeek( int inNumber, String badNameDay ) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        testResult( dayOfTheWeekDetector.detectDayName( inNumber ).equals( badNameDay ), "Number is less 1 or bigger 7. ");
    }

    public void testDayOfWeek( int inNumber, String nameDay ) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        testResult( dayOfTheWeekDetector.detectDayName( inNumber ).equals( nameDay ), "Number " + inNumber);
    }

    private void testResult( boolean status, String testString ) {
        if (status) {
            System.out.println( testString + " Test OK.");
        } else {
            System.out.println( testString + " Test FAIL!!!");
        }
    }
}
