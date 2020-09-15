package student_eduards_jasvins.lesson_10.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.dayOfTheWeekDetectorIf();
        test.dayOfTheWeekDetectorSwitch();
        test.dayOfTheWeekDetectorArray();
    }

    void dayOfTheWeekDetectorIf() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        if (detector.detectDayName(1).equals("Monday")) {
            System.out.println("Test IF = OK");
        } else {
            System.out.println("Test IF = FAIL");
        }
    }

    void dayOfTheWeekDetectorSwitch() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        if (detector.detectDayName(3).equals("Wednesday")) {
            System.out.println("Test SWITCH = OK");
        } else {
            System.out.println("Test SWITCH = FAIL");
        }
    }

    void dayOfTheWeekDetectorArray() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        if (detector.detectDayName(5).equals("Friday")) {
            System.out.println("Test ARRAY = OK");
        } else {
            System.out.println("Test ARRAY = FAIL");
        }
    }
}
