package student_dmitrijs_jasvins.lesson_10.day_2;


import java.util.Scanner;

public class DayOfTheWeekDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));
    }

    public static void main(String[] args) {

        System.out.println("\n" + "Switch version");

        DayOfTheWeekSwitchVersion dayOfTheWeekSwitchVersion = new DayOfTheWeekSwitchVersion();
        DayOfTheWeekDemo dayOfTheWeekDemo = new DayOfTheWeekDemo(dayOfTheWeekSwitchVersion);
        dayOfTheWeekDemo.run();

        System.out.println("\n" + "If version");

        DayOfTheWeekIfVersion dayOfTheWeekIfVersion = new DayOfTheWeekIfVersion();
        DayOfTheWeekDemo dayOfTheWeekDemo1 = new DayOfTheWeekDemo(dayOfTheWeekIfVersion);
        dayOfTheWeekDemo1.run();

        System.out.println("\n" + "Array version");

        DayOfTheWeekArrayVersion dayOfTheWeekArrayVersion = new DayOfTheWeekArrayVersion();
        DayOfTheWeekDemo dayOfTheWeekDemo2 = new DayOfTheWeekDemo(dayOfTheWeekArrayVersion);
        dayOfTheWeekDemo2.run();
    }
}
