package student_anvars_intezars.home_tasks.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.dayDetectorByIfVersion();
        dayOfTheWeekDetectorTest.dayDetectorByIfVersion2();
        dayOfTheWeekDetectorTest.dayDetectorByIfVersionNegativeScenario();
        dayOfTheWeekDetectorTest.dayDetectorBySwitchVersion();
        dayOfTheWeekDetectorTest.dayDetectorBySwitchVersion2();
        dayOfTheWeekDetectorTest.dayDetectorBySwitchNegativeScenario();
    }

    void dayDetectorByIfVersion() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(2);
        if (result.equals("Tuesday")) {
            System.out.println("Test for detecting day name with IF statement = OK");
        } else {
            System.out.println("Test for detecting day name with IF statement = FAIL");
        }
    }

    void dayDetectorByIfVersion2() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(7);
        if (result.equals("Sunday")) {
            System.out.println("Test2 for detecting day name with IF statement = OK");
        } else {
            System.out.println("Test for detecting day name with IF statement = FAIL");
        }
    }

    void dayDetectorByIfVersionNegativeScenario() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(8);
        if (result.equals("Sunday")) {
            System.out.println("Test3 for detecting day name with IF statement = OK");
        } else {
            System.out.println("Test3 for detecting day name with IF statement = FAIL");
        }
    }

    void dayDetectorBySwitchVersion() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(2);
        if (result.equals("Tuesday")) {
            System.out.println("Test4 for detecting day name with SWITCH = OK");
        } else {
            System.out.println("Test for detecting day name with SWITCH = FAIL");
        }
    }

    void dayDetectorBySwitchVersion2() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(7);
        if (result.equals("Sunday")) {
            System.out.println("Test4 for detecting day name with SWITCH = OK");
        } else {
            System.out.println("Test for detecting day name with SWITCH = FAIL");
        }
    }

    void dayDetectorBySwitchNegativeScenario() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(8);
        if (result.equals("Sunday")) {
            System.out.println("Test4 for detecting day name with SWITCH = OK");
        } else {
            System.out.println("Test for detecting day name with SWITCH = FAIL");
        }
    }

}
