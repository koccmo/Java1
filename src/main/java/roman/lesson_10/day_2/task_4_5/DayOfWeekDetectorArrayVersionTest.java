package roman.lesson_10.day_2.task_4_5;

public class DayOfWeekDetectorArrayVersionTest {
    public static void main(String[] args) {
        DayOfWeekDetectorArrayVersionTest test = new DayOfWeekDetectorArrayVersionTest();
        test.weekDaysNumberFiveTest();
        test.weekDayNumberFifteen();
    }

    DayOfWeekDetectorArrayVersion weekDays = new DayOfWeekDetectorArrayVersion();

    public void weekDaysNumberFiveTest() {
        checkResult(weekDays.detectDayName(5).equals("Friday"),
                "Week day number Five");
    }

    public void weekDayNumberFifteen() {
        checkResult(weekDays.detectDayName(15).equals("Please input a valid number between 1 and 7"),
                "Week day number Fifteen");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test - OK!");
        } else {
            System.out.println(nameOfTest + " Test - FAIL!");
        }
    }
}
