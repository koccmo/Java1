package student_jaroslav_brutan.lesson_10.day_2.task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.ifTest();
        test.arrayTest();
        test.switchTest();
    }

    void checkCorrectResult(String name, boolean testResult){
        if (testResult){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    void ifTest(){
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        checkCorrectResult("DayOfTheWeekDetectorIfVersion",
                dayOfTheWeekDetectorIfVersion.detectDayName(4).equals("Thursday"));
    }

    void arrayTest(){
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        checkCorrectResult("DayOfTheWeekDetectorArrayVersion",
                dayOfTheWeekDetectorIfVersion.detectDayName(3).equals("Wednesday"));
    }

    void switchTest(){
    DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
    checkCorrectResult("DayOfTheWeekDetectorSwitchVersion",
                       dayOfTheWeekDetectorIfVersion.detectDayName(2).equals("Tuesday"));
}
}
