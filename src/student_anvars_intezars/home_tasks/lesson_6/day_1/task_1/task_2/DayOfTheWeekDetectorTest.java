package student_anvars_intezars.home_tasks.lesson_6.day_1.task_1.task_2;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.firstTestMonday();
        dayOfTheWeekDetectorTest.secondTestTuesday();
        dayOfTheWeekDetectorTest.thirdTestWednesday();
        dayOfTheWeekDetectorTest.fourthTestThursday();
        dayOfTheWeekDetectorTest.fifthTestFriday();
        dayOfTheWeekDetectorTest.sixthTestSaturday();
        dayOfTheWeekDetectorTest.seventhTestSunday();
    }

    public void firstTestMonday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String monday = dayOfTheWeekDetector.detectDayName(1);
        if (monday.equals("Monday")) {
            System.out.println("Test detect Monday = OK");
        }
        else {
            System.out.println("Test detect Monday = FAIL");
        }
    }

    public void secondTestTuesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String tuesday = dayOfTheWeekDetector.detectDayName(2);
        if (tuesday.equals("Tuesday")) {
            System.out.println("Test detect Tuesday = OK");
        }
        else {
            System.out.println("Test detect Tuesday = FAIL");
        }
    }

    public void thirdTestWednesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String wednesday = dayOfTheWeekDetector.detectDayName(3);
        if (wednesday.equals("Wednesday")) {
            System.out.println("Test detect Wednesday = OK");
        }
        else {
            System.out.println("Test detect Wednesday = FAIL");
        }
    }

    public void fourthTestThursday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String thursday = dayOfTheWeekDetector.detectDayName(4);
        if (thursday.equals("Thursday")) {
            System.out.println("Test detect Thursday = OK");
        }
        else {
            System.out.println("Test detect Thursday = FAIL");
        }
    }

    public void fifthTestFriday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String friday = dayOfTheWeekDetector.detectDayName(5);
        if (friday.equals("Friday")) {
            System.out.println("Test detect Friday = OK");
        }
        else {
            System.out.println("Test detect Friday = FAIL");
        }
    }

    public void sixthTestSaturday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String saturday = dayOfTheWeekDetector.detectDayName(6);
        if (saturday.equals("Saturday")) {
            System.out.println("Test detect Saturday = OK");
        }
        else {
            System.out.println("Test detect Saturday = FAIL");
        }
    }

    public void seventhTestSunday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String sunday = dayOfTheWeekDetector.detectDayName(7);
        if (sunday.equals("Sunday")) {
            System.out.println("Test detect Sunday = OK");
        }
        else {
            System.out.println("Test detect Sunday = FAIL");
        }
    }
}

