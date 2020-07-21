package student_vladimir_kobenko.lesson6.homeworks.level_1.Task_2;

public class DayOfTheWeekDetectorTest {
    public static void main (String [] args){
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
    dayOfTheWeekDetectorTest.testMonday();
    dayOfTheWeekDetectorTest.testTuesday();
    dayOfTheWeekDetectorTest.testWednesday();
    dayOfTheWeekDetectorTest.testThursday();
    dayOfTheWeekDetectorTest.testFriday();
    dayOfTheWeekDetectorTest.testSaturday();
    dayOfTheWeekDetectorTest.testSunday();
    }

     public void testMonday(){
            DayOfTheWeekDetector test1 = new DayOfTheWeekDetector();
            if (test1.detectDayName(1) == "Monday"){
                System.out.println("Test Monday is Ok");
            } else  System.out.println("Test Monday is FAILED");
        }
    public void testTuesday(){
        DayOfTheWeekDetector test1 = new DayOfTheWeekDetector();
        if (test1.detectDayName(2) == "Tuesday"){
            System.out.println("Test Tuesday is Ok");
        } else  System.out.println("Test Tuesday is FAILED");
    }
    public void testWednesday(){
        DayOfTheWeekDetector test1 = new DayOfTheWeekDetector();
        if (test1.detectDayName(3) == "Wednesday"){
            System.out.println("Test Wednesday is Ok");
        } else  System.out.println("Test Wednesday is FAILED");
    }

    public void testThursday(){
        DayOfTheWeekDetector test1 = new DayOfTheWeekDetector();
        if (test1.detectDayName(4) == "Thursday"){
            System.out.println("Test Thursday is Ok");
        } else  System.out.println("Test Thursday is FAILED");
    }
    public void testFriday(){
        DayOfTheWeekDetector test1 = new DayOfTheWeekDetector();
        if (test1.detectDayName(5) == "Friday"){
            System.out.println("Test Friday is Ok");
        } else  System.out.println("Test Friday is FAILED");
    }
    public void testSaturday(){
        DayOfTheWeekDetector test1 = new DayOfTheWeekDetector();
        if (test1.detectDayName(6) == "Saturday"){
            System.out.println("Test Saturday is Ok");
        } else  System.out.println("Test Saturday is FAILED");

    }

    public void testSunday(){
        DayOfTheWeekDetector test1 = new DayOfTheWeekDetector();
        if (test1.detectDayName(7) == "Sunday"){
            System.out.println("Test Sunday is Ok");
        } else  System.out.println("Test Sunday is FAILED");

    }

    }

