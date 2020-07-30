package student_sandra_arniece.lesson_6.level_1;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.test1();

    }

    public void test1() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        if (dayOfTheWeekDetector.detectDayName(1).equals("Monday")) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }

    }

}
