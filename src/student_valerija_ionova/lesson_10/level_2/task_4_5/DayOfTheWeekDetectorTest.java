package student_valerija_ionova.lesson_10.level_2.task_4_5;

class DayOfTheWeekDetectorTest {

    public static void main (String [] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();

        dayOfTheWeekDetectorTest.testDayOfTheWeekDetectorArrayVersion();
        dayOfTheWeekDetectorTest.testDayOfTheWeekDetectorSwitchVersion();
        dayOfTheWeekDetectorTest.testDayOfTheWeekDetectorIfVersion();

    }

    void checkResult(String name, boolean testsResult){
        if (testsResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testDayOfTheWeekDetectorArrayVersion(){
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();

        checkResult("TestDayOfTheWeekDetectorArrayVersion", dayOfTheWeekDetectorArrayVersion.detectDayName(2).equals("Tuesday"));
    }

    void testDayOfTheWeekDetectorSwitchVersion(){
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();

        checkResult("DayOfTheWeekDetectorSwitchVersion", dayOfTheWeekDetectorSwitchVersion.detectDayName(3).equals("Wednesday"));
    }

    void testDayOfTheWeekDetectorIfVersion(){
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();

        checkResult("DayOfTheWeekDetectorIfVersion", dayOfTheWeekDetectorIfVersion.detectDayName(5).equals("Friday"));
    }

}
