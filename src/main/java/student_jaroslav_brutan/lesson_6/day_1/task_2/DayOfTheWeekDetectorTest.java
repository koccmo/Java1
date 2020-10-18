package student_jaroslav_brutan.lesson_6.day_1.task_2;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.mondayTest();
        test.tuesdayTest();
        test.wednesdayTest();
        test.thursdayTest();
        test.fridayTest();
        test.saturdayTest();
        test.sundayTest();

    }

    public void mondayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String monday = dayOfTheWeekDetector.detectTheDayName(1);
        if (monday.equals("Monday")){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void tuesdayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String tuesday = dayOfTheWeekDetector.detectTheDayName(2);
        if (tuesday.equals("Tuesday")){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void wednesdayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String wednesday = dayOfTheWeekDetector.detectTheDayName(3);
        if (wednesday.equals("Wednesday")){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void thursdayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String thursday = dayOfTheWeekDetector.detectTheDayName(4);
        if (thursday.equals("Thursday")){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void fridayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String friday = dayOfTheWeekDetector.detectTheDayName(15);
        if (friday.equals("Friday")){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void saturdayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String saturday = dayOfTheWeekDetector.detectTheDayName(6);
        if (saturday.equals("Saturday")){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void sundayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String sunday = dayOfTheWeekDetector.detectTheDayName(7);
        if (sunday.equals("Sunday")){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }


}
