package student_aleksandra_maksimovic.lesson_6.level_1.task_2;


public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();

        dayOfTheWeekDetectorTest.mondayTest();
        dayOfTheWeekDetectorTest.tuesdayTest();
        dayOfTheWeekDetectorTest.wednesdayTest();
        dayOfTheWeekDetectorTest.tuesdayTest();
        dayOfTheWeekDetectorTest.fridayTest();
        dayOfTheWeekDetectorTest.saturdayTest();
        dayOfTheWeekDetectorTest.sundayTest();
        dayOfTheWeekDetectorTest.outOfRangeTest();
    }

    private DayOfTheWeekDetector dayOfTheWeekDetector;
    public DayOfTheWeekDetectorTest() {
        this.dayOfTheWeekDetector = new DayOfTheWeekDetector();
    }

    public void mondayTest() {
        String result = dayOfTheWeekDetector.detectDayName(1);
        if (result.equals("Monday")) {
            System.out.println("Monday test is : PASSED");
        } else {
            System.out.println("Monday test is FAILED");
        }
    }
    public void tuesdayTest() {
        String result = dayOfTheWeekDetector.detectDayName(2);
        if (result.equals("Tuesday")) {
            System.out.println("Tuesday test is : PASSED");
        } else {
            System.out.println("TUesday test is FAILED");
        }
    }
    public void wednesdayTest() {
        String result = dayOfTheWeekDetector.detectDayName(3);
        if (result.equals("Wednesday")) {
            System.out.println("Wednesday test is : PASSED");
        } else {
            System.out.println("Wednesday test is FAILED");
        }
    }
    public void thursdayTest() {
        String result = dayOfTheWeekDetector.detectDayName(4);
        if (result.equals("Thursday")) {
            System.out.println("Thursday test is : PASSED");
        } else {
            System.out.println("Thursday test is : FAILED");
        }
    }
    public void fridayTest() {
        String result = dayOfTheWeekDetector.detectDayName(5);
        if (result.equals("Friday")) {
            System.out.println("Friday test is : PASSED");
        } else {
            System.out.println("Friday test is : FAILED");
        }
    }
    public void saturdayTest() {
        String result = dayOfTheWeekDetector.detectDayName(6);
        if (result.equals("Saturday")) {
            System.out.println("Saturday test is : PASSED");
        } else {
            System.out.println("Saturday test is : FAILED");
        }
    }
    public void sundayTest() {
        String result = dayOfTheWeekDetector.detectDayName(7);
        if (result.equals("Sunday")) {
            System.out.println("Sunday test is : PASSED");
        } else {
            System.out.println("Sunday test is : FAILED");
        }
    }
    public void outOfRangeTest() {
        String result = dayOfTheWeekDetector.detectDayName(8);
        if (result.equals("The number is out of range!!")) {
            System.out.println("Sunday test is : PASSED");
        } else {
            System.out.println("Sunday test is : FAILED");
        }
    }
}
