package student_jaroslav_brutan.lesson_10.day_2.task_5;

import student_jaroslav_brutan.lesson_10.day_2.task_4.DayOfTheWeekDetector;
import student_jaroslav_brutan.lesson_10.day_2.task_4.DayOfTheWeekDetectorArrayVersion;
import student_jaroslav_brutan.lesson_10.day_2.task_4.DayOfTheWeekDetectorIfVersion;
import student_jaroslav_brutan.lesson_10.day_2.task_4.DayOfTheWeekDetectorSwitchVersion;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the day!");
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector ifDetector = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector switchDetector = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetector arrayDetector = new DayOfTheWeekDetectorArrayVersion();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorIf = new DayOfTheWeekDetectorDemo(ifDetector);
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorSwitch = new DayOfTheWeekDetectorDemo(switchDetector);
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorArray = new DayOfTheWeekDetectorDemo(arrayDetector);

        dayOfTheWeekDetectorIf.run();
        dayOfTheWeekDetectorSwitch.run();
        dayOfTheWeekDetectorArray.run();
    }


}


