package roman.lesson_10.day_2.task_4_5;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public void run() {
        System.out.print("Enter number of Day - ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo demoSwitch = new DayOfTheWeekDetectorDemo(switchVersion);
        demoSwitch.run();

        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo demoIf = new DayOfTheWeekDetectorDemo(ifVersion);
        demoIf.run();

        DayOfWeekDetectorArrayVersion arrayVersion = new DayOfWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo demoArray = new DayOfTheWeekDetectorDemo(arrayVersion);
        demoArray.run();
    }
}
