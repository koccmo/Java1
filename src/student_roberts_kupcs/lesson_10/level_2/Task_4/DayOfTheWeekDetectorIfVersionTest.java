package student_roberts_kupcs.lesson_10.level_2.Task_4;

class DayOfTheWeekDetectorIfVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersionTest test = new DayOfTheWeekDetectorIfVersionTest();
        test.DayOfTheWeekDetectorIf();
    }

    void DayOfTheWeekDetectorIf() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIf = new DayOfTheWeekDetectorIfVersion();
        if (dayOfTheWeekDetectorIf.detectDayName(3).equals("Wednesday")) {
            System.out.println("DayOfTheWeekDetectorIf test is OK");
        } else {
            System.out.println("DayOfTheWeekDetectorIf test is Fail");

        }

    }

}
