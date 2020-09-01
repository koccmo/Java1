package student_dmitrijs_jasvins.lesson_10.day_2;

public class DayOfWeekTest {
    public static void main(String[] args) {
        DayOfWeekTest dayOfWeekTest = new DayOfWeekTest();
        dayOfWeekTest.arrayTest();
        dayOfWeekTest.switchTest();
        dayOfWeekTest.ifTest();
    }

    void checkResult(String name, boolean testsResult) {
        if (testsResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }

    void arrayTest() {
        DayOfTheWeekArrayVersion dayOfTheWeekArrayVersion = new DayOfTheWeekArrayVersion();
        checkResult("Array Test", dayOfTheWeekArrayVersion.detectDayName(2).equals("Tuesday"));
    }

    void switchTest() {
        DayOfTheWeekSwitchVersion dayOfTheWeekSwitchVersion = new DayOfTheWeekSwitchVersion();
        checkResult("Switch Test", dayOfTheWeekSwitchVersion.detectDayName(3).equals("Wednesday"));
    }

    void ifTest() {
        DayOfTheWeekIfVersion dayOfTheWeekIfVersion = new DayOfTheWeekIfVersion();
        checkResult("If Test", dayOfTheWeekIfVersion.detectDayName(3).equals("Wednesday"));
    }
}