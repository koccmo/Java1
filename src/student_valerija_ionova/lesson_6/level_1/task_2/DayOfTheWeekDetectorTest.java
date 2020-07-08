package student_valerija_ionova.lesson_6.level_1.task_2;

/*Создайте класс DayOfTheWeekDetectorTest и напишите
автоматические тесты для всех сценариев*/

public class DayOfTheWeekDetectorTest {
    public static void main(String [] args){
        DayOfTheWeekDetectorTest detectorTest = new DayOfTheWeekDetectorTest();
        detectorTest.testMonday();
        detectorTest.testTuesday();
        detectorTest.testWednesday();
        detectorTest.testThursday();
        detectorTest.testFriday();
        detectorTest.testSaturday();
        detectorTest.testSunday();
        detectorTest.testNotDay();
    }

    public void checkString(String name, String methodsResult, String expectedResult){
        if (methodsResult.equals(expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+"FAIL");
        }
    }

    public void testMonday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Test Monday",detector.detectDayName(1), "Monday");
    }

    public void testTuesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Test Tuesday",detector.detectDayName(2), "Tuesday");
    }

    public void testWednesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Test Wednesday",detector.detectDayName(3), "Wednesday");
    }

    public void testThursday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Test Thursday",detector.detectDayName(4), "Thursday");
    }

    public void testFriday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Test Friday",detector.detectDayName(5), "Friday");
    }

    public void testSaturday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Test Saturday",detector.detectDayName(6), "Saturday");
    }

    public void testSunday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Test Sunday",detector.detectDayName(7), "Sunday");
    }

    public void testNotDay(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        checkString("Test NotDay",detector.detectDayName(8), "Not valid number!");
    }
}
