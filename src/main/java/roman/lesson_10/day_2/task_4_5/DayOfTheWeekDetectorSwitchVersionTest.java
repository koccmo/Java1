package roman.lesson_10.day_2.task_4_5;

public class DayOfTheWeekDetectorSwitchVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersionTest test = new DayOfTheWeekDetectorSwitchVersionTest();
        test.weekDayNumberThree();
        test.weekDayNumberEleven();
    }

    DayOfTheWeekDetectorSwitchVersion weekDays = new DayOfTheWeekDetectorSwitchVersion();

    public void weekDayNumberThree() {
        int number = 3;
        checkResult(weekDays.detectDayName(number).equals("Wednesday"),
                "Week day with number Three");
    }

    public void weekDayNumberEleven() {
        checkResult(weekDays.detectDayName(11).equals("Please input a valid number between 1 and 7"),
                "Week day with number Eleven");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test - OK!");
        } else {
            System.out.println(nameOfTest + " Test - FAIL!");
        }
    }
}
