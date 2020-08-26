package student_igors_bartkevics.lesson_10.homework.level_2.Task_4_5;
import java.util.Scanner;
class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector detector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number of the week: ");
        int number = scanner.nextInt();
        System.out.println(detector.detectDayName(number));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector detectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector detectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetector detectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();

        DayOfTheWeekDetectorDemo demoIf = new DayOfTheWeekDetectorDemo(detectorIfVersion);
        DayOfTheWeekDetectorDemo demoSwitch = new DayOfTheWeekDetectorDemo(detectorSwitchVersion);
        DayOfTheWeekDetectorDemo demoArray = new DayOfTheWeekDetectorDemo(detectorArrayVersion);

        demoIf.run();
        demoSwitch.run();
        demoArray.run();
    }

}
