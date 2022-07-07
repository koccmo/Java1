package roman.lesson_10.day_2.task_4_5;

public class DayOfTheWeekDetectorIfVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersionTest test = new DayOfTheWeekDetectorIfVersionTest();
        test.testWithNumberTwo();
        test.testWithNumberTen();
    }
    DayOfTheWeekDetectorIfVersion weekDays = new DayOfTheWeekDetectorIfVersion();

    public void testWithNumberTwo() {
        int number = 2;
        checkResult(weekDays.detectDayName(number).equals("Tuesday"), "Week day number Two");
    }

    public void testWithNumberTen() {
        int number = 10;
        checkResult(weekDays.detectDayName(number).equals("Please input a valid number between 1 and 7"),
                "Week day number Ten");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test - OK!");
        } else {
            System.out.println(nameOfTest + " Test - FAIL!");
        }
    }
}
