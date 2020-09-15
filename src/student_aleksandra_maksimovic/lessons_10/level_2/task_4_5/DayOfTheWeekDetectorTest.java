package student_aleksandra_maksimovic.lessons_10.level_2.task_4_5;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

        test.dayOfTheWeekDetectorSwitchVersionTest();
        test.dayOfTheWeekDetectorIfVersionTest();
        test.dayOfTheWeekDetectorArrayVersionTest();

    }
    void checkResult(String name, boolean result ) {

        if (result) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = fail");
        }

    }
    void dayOfTheWeekDetectorSwitchVersionTest() {

        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();

        checkResult("Switch Version test", dayOfTheWeekDetectorSwitchVersion.detectDayName(7).equals("Sunday"));
        checkResult("Switch Version not valid number test", dayOfTheWeekDetectorSwitchVersion.detectDayName(10).equals("Please input a valid number between 1 and 7"));

    }

    void dayOfTheWeekDetectorIfVersionTest() {

        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();

        checkResult("If Version test", dayOfTheWeekDetectorIfVersion.detectDayName(1).equals("Monday"));
        checkResult("If Version not valid number test", dayOfTheWeekDetectorIfVersion.detectDayName(0).equals("Please input a valid number between 1 and 7"));
    }

    void dayOfTheWeekDetectorArrayVersionTest() {

        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();

        checkResult("Array Version test", dayOfTheWeekDetectorArrayVersion.detectDayName(5).equals("Friday"));
        checkResult("Array Version not valid number test", dayOfTheWeekDetectorArrayVersion.detectDayName(12).equals("Please input a valid number between 1 and 7"));

    }



}
