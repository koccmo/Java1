package student_volodya_danilin.lesson_10.level_2.Task_4;

public class Demo {

    public static void main(String[] Args) {

        DayOfTheWeekDetectorIfVersion weekIf = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorSwitchVersion weekSwitch = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorArrayVersion weekArray = new DayOfTheWeekDetectorArrayVersion();

        System.out.println("\nTest 1 \nTesting IF version ... ");
        System.out.println("Entering 2, weekIF : " + weekIf.detectDayName(2));
        if (weekIf.detectDayName(2).equals("Tuesday")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("Entering 8, weekIf : " + weekIf.detectDayName(8));

        System.out.println("\nTest 2 \nTesting SWITCH version ... ");
        System.out.println("Entering 3, weekSwitch : " + weekSwitch.detectDayName(3));
        if (weekSwitch.detectDayName(3).equals("Wednesday")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("Entering 8, weekSwitch : " + weekSwitch.detectDayName(8));

        System.out.println("\nTest 3 \nTesting String array version ... ");
        System.out.println("Entering 5, weekArray : " + weekArray.detectDayName(5));
        if (weekArray.detectDayName(5).equals("Friday")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("Entering 8, weekArray : " + weekArray.detectDayName(8));
    }
}
